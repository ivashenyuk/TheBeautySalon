package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataUser implements TCPConnectionListener {
    private DataUser dataUser;

    public ReceiveDataUser() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveDataUser.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        // threadClient.start();
        this.dataUser = new DataUser(1, "  Ivasheniuk Yurii          ", "yura.ivasheniuk@gmail.com", "user");
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String user) {

    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }

    public DataUser getDataUser() {
        return dataUser;
    }
}
