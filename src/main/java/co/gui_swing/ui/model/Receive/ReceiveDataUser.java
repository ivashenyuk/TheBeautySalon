package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

public class ReceiveDataUser implements TCPConnectionListener {
    private DataUser dataUser;

    public ReceiveDataUser() {
        this.dataUser = new DataUser(1, "Ivasheniuk Yurii", "yura.ivasheniuk@gmail.com", "user");
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
