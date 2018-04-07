package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataWorkers implements TCPConnectionListener {
    private final String ipConnection = "127.0.0.1";
    private ArrayList<DataWorker> dataWorkers = new ArrayList<DataWorker>();

    public ReceiveDataWorkers() {
        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveDataWorkers.this, ipConnection, 1356);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
       // threadClient.start();
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
    }

    public ArrayList<DataWorker> getDataWorkers() {
        return dataWorkers;
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String user) {
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
        dataWorkers.add(new DataWorker());
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }
}
