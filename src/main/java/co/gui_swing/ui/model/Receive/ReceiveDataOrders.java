package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataOrderLine;
import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataOrders implements TCPConnectionListener {
    private ArrayList<DataOrderLine> listProfit = new ArrayList<DataOrderLine>();
    private TCPConnection tcp1;
    private TCPConnection tcp;

    public ReceiveDataOrders() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tcp = new TCPConnection(ReceiveDataOrders.this, Setting.getIpConnection(), Setting.getPortConnection());
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

    public ArrayList<DataOrderLine> getListOrders() {
        return listProfit;
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");

        tcpConnection.SendData("getprofit");

        try {
            if (tcp1 == null)
                tcp1 = new TCPConnection(ReceiveDataOrders.this, Setting.getIpConnection(), Setting.getPortGetOrders());

        } catch (IOException e) {
            e.printStackTrace();
        }
        tcp.Disconnect();
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String data) {
        DataOrderLine[] tmpData = new Gson().fromJson(data, DataOrderLine[].class);
        for (DataOrderLine orderLine : tmpData) {
            listProfit.add(orderLine);
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
