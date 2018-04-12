package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataProfit implements TCPConnectionListener {
    private ArrayList<DataProfitLine> listProfit = new ArrayList<DataProfitLine>();
    public ReceiveDataProfit() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveDataProfit.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        // threadClient.start();
        listProfit.add(new DataProfitLine(1, "Ivashenuik", "100", "30"));
        listProfit.add(new DataProfitLine(1, "Ivashenuik", "100", "30"));
        listProfit.add(new DataProfitLine(1, "Ivashenuik", "100", "30"));
        listProfit.add(new DataProfitLine(1, "Ivashenuik", "100", "30"));
    }

    public ArrayList<DataProfitLine> getListProfit() {
        return listProfit;
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String data) {

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
