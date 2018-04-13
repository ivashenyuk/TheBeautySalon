package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.controller.LogInController;
import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ReceiveLogIn implements TCPConnectionListener {
    String email;
    String password;
    TCPConnection tcp;
    private boolean aoutorisation = false;
    static DataUser dataUser;

    public ReceiveLogIn(String email, String password) {
        this.email = email;
        this.password = password;
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tcp = new TCPConnection(ReceiveLogIn.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        threadClient.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
        tcp.SendData("login");
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String data) {
        if (data.equals("true")) {
            aoutorisation = true;
        } else if (data.charAt(0) == '{') {
            dataUser = new Gson().fromJson(data, DataUser.class);
        } else {
            TCPConnection tcp1;
            try {
                tcp1 = new TCPConnection(ReceiveLogIn.this, Setting.getIpConnection(), Setting.getPortLogin());
                String[] t = {ReceiveLogIn.this.email, ReceiveLogIn.this.password};
                tcp1.SendData(new Gson().toJson(t, String[].class));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        tcp.Disconnect();
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

    public boolean isAoutorisation() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return aoutorisation;
    }

    public static DataUser getDataUser() {
        return dataUser;
    }
}
