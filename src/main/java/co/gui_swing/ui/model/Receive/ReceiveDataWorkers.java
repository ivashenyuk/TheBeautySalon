package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.controller.LogInController;
import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataWorkers implements TCPConnectionListener {
    private ArrayList<DataWorker> dataWorkers = new ArrayList<DataWorker>();
    private TCPConnection tcp = null;
    private TCPConnection tcp1 = null;

    public ReceiveDataWorkers() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tcp = new TCPConnection(ReceiveDataWorkers.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        threadClient.start();
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<DataWorker> getDataWorkers() {
        return dataWorkers;
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
        tcpConnection.SendData("getworkers");

        try {
            if (tcp1 == null)
                tcp1 = new TCPConnection(ReceiveDataWorkers.this, Setting.getIpConnection(), Setting.getPortGetWorkers());
            //String[] t = {LogInController.getEmail(), LogInController.getPassword()};
            //tcp1.SendData(new Gson().toJson(t, String[].class));

        } catch (IOException e) {
            e.printStackTrace();
        }
        tcp.Disconnect();
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String data) {
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                          String priceWorker, int idButtonWorker, Image imgWorker) {
        dataWorkers.add(new DataWorker(nameWorker, priceWorker, kingOfServiceWorker, idButtonWorker, imgWorker));
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
        tcpConnection.Disconnect();
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }
}
