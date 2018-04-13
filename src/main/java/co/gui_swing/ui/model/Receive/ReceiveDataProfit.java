package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Data.DataScheduleLine;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataProfit implements TCPConnectionListener {
    private ArrayList<DataProfitLine> listProfit = new ArrayList<DataProfitLine>();
    private TCPConnection tcp1;
    private TCPConnection tcp;

    public ReceiveDataProfit() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tcp = new TCPConnection(ReceiveDataProfit.this, Setting.getIpConnection(), Setting.getPortConnection());
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

    public ArrayList<DataProfitLine> getListProfit() {
        return listProfit;
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");

        tcpConnection.SendData("getprofit");

        try {
            if (tcp1 == null)
                tcp1 = new TCPConnection(ReceiveDataProfit.this, Setting.getIpConnection(), Setting.getPortGetProfit());
            //String[] t = {LogInController.getEmail(), LogInController.getPassword()};
            //tcp1.SendData(new Gson().toJson(t, String[].class));

        } catch (IOException e) {
            e.printStackTrace();
        }
        tcp.Disconnect();
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String data) {
        DataProfitLine[] tmpData = new Gson().fromJson(data, DataProfitLine[].class);
        for (DataProfitLine profitLine : tmpData) {
            listProfit.add(profitLine);
        }
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                          String priceWorker, int idButtonWorker, String imgWorker) {

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
