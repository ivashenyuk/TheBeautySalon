package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Random;

public class ReceiveCheck implements TCPConnectionListener {
    private String nameWorker;
    private String email;
    private String price;
    private String serveice;
    private String nameCustomer;
    private String date;

    private boolean OKorNO = false;

    public ReceiveCheck(String serveice, String nameWorker, String nameCustomer, String date, String price, String email) {
        this.serveice = serveice;
        this.nameWorker = nameWorker;
        this.email = email;
        this.nameCustomer = nameCustomer;
        this.date = date;
        this.price = price;

        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveCheck.this, Setting.getIpConnection(), Setting.getPortCheck());
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
        tcpConnection.SendData(new Gson().toJson(new String[]{serveice, nameWorker, nameCustomer, date, price, email}));
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
