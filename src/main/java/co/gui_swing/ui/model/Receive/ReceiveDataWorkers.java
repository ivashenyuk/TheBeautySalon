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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReceiveDataWorkers implements TCPConnectionListener {
    private ArrayList<DataWorker> dataWorkers = new ArrayList<DataWorker>();
    private TCPConnection tcp = null;
    private TCPConnection tcp1 = null;
    private static Thread threadClient;
private static int time=4000;
    public ReceiveDataWorkers() {
        threadClient = new Thread(new Runnable() {
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
            Thread.sleep(time);
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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (tcp1 == null) {
            try {
                tcp1 = new TCPConnection(ReceiveDataWorkers.this, Setting.getIpConnection(), Setting.getPortGetWorkers());
                tcpConnection.Disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //threadClient.interrupt();
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String data) {
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                                       String priceWorker, int idButtonWorker, String imgWorker) {
        System.out.println(nameWorker);
        dataWorkers.add(new DataWorker(nameWorker, priceWorker, kingOfServiceWorker, idButtonWorker, imgWorker));
        time+=1000;
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
        tcpConnection.Disconnect();
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex.toString());
    }
}
