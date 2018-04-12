package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataScheduleLine;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataSchedule implements TCPConnectionListener {
    private final ArrayList<DataScheduleLine> listSchedule = new ArrayList<DataScheduleLine>();
    private TCPConnection tcp1;
    private TCPConnection tcp;

    public ReceiveDataSchedule() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tcp = new TCPConnection(ReceiveDataSchedule.this, Setting.getIpConnection(), Setting.getPortConnection());
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

    public ArrayList<DataScheduleLine> getListSchedule() {
        return listSchedule;
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
        tcpConnection.SendData("getschedule");

        try {
            if (tcp1 == null)
                tcp1 = new TCPConnection(ReceiveDataSchedule.this, Setting.getIpConnection(), Setting.getPortGetSchedule());
            //String[] t = {LogInController.getEmail(), LogInController.getPassword()};
            //tcp1.SendData(new Gson().toJson(t, String[].class));

        } catch (IOException e) {
            e.printStackTrace();
        }
        tcp.Disconnect();
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String data) {
        DataScheduleLine[] tmpData = new Gson().fromJson(data, DataScheduleLine[].class);
        for (DataScheduleLine scheduleLine : tmpData) {
            listSchedule.add(scheduleLine);
        }
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                          String priceWorker, int idButtonWorker, Image imgWorker) {

    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
    }

    @Override
    public void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }
}
