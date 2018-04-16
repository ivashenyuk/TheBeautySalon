package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;
import com.sun.javafx.scene.layout.region.Margins;

import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class ReceiveRegistration implements TCPConnectionListener {
    private String name;
    private String email;
    private String password;
    private boolean OKorNO = false;
    private String secretCode = "";

    public ReceiveRegistration(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;

        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveRegistration.this, Setting.getIpConnection(), Setting.getPortRegistration());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        threadClient.start();
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if ((i == 2 || i == 3) || (i == 7 || i == 8))
                secretCode += (char) (Math.abs(random.nextInt() % 9) + 48);
            else {
                if ((random.nextInt() % 2) == 0)
                    secretCode += (char) (Math.abs(random.nextInt() % 26) + 65);
                else
                    secretCode += (char) (Math.abs(random.nextInt() % 26) + 97);
            }
        }
        tcpConnection.SendData(new Gson().toJson(new String[]{name, email, password, secretCode}));
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String user) {
        if (user.equals("true")) {
            OKorNO = true;
        } else if (user.equals("false")) {
            OKorNO = false;
        }
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                          String priceWorker, int idButtonWorker, String imgWorker) {

    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }

    public boolean isOKorNO() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return OKorNO;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
