package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.io.IOException;

public class ReceiveLogIn implements TCPConnectionListener {
    String email;
    String password;

    public ReceiveLogIn(String email, String password) {
        this.email = email;
        this.password = password;
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveLogIn.this, Setting.getIpConnection(), Setting.getPortConnection());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        // threadClient.start();
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

    public Boolean CheckEmail() {
        return email.equals(this.email);
    }

    public Boolean CheckPassword() {
        return password.equals(this.password);
    }
}
