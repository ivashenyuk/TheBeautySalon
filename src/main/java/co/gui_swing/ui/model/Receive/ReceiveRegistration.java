package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;

public class ReceiveRegistration implements TCPConnectionListener {
    private String name;
    private String email;
    private String password;
    private boolean OKorNO = false;

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
        tcpConnection.SendData(new Gson().toJson(new String[]{name, email, password}));
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
}
