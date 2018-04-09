package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataScheduleLine;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataSchedule implements TCPConnectionListener {
    private final ArrayList<DataScheduleLine> listSchedule = new ArrayList<DataScheduleLine>();

    public ReceiveDataSchedule() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveDataSchedule.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        // threadClient.start();
        listSchedule.add(new DataScheduleLine(0, "Масаж", "Івашенюк", "09:00-18:00 Пн-Пт "));
        listSchedule.add(new DataScheduleLine(0, "Стрижка", "Ivasheniuk", "09:00-18:00 Пн-Пт "));
        listSchedule.add(new DataScheduleLine(0, "Стрижка", "Пастерук", "09:00-18:00 Пн-Пт "));
        listSchedule.add(new DataScheduleLine(0, "Масаж", "Pasteruk", "09:00-18:00 Пн-Пт "));
    }

    public ArrayList<DataScheduleLine> getListSchedule() {
        return listSchedule;
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String data) {

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
