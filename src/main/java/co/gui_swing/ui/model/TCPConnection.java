package co.gui_swing.ui.model;

import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

public class TCPConnection {
    public final Socket socket;
    public final Thread rxThread;
    private final TCPConnectionListener eventListener;
    private BufferedReader in;
    private BufferedWriter out;

    public TCPConnection(TCPConnectionListener eventListener, String ipAddress, int port) throws IOException {
        this(eventListener, new Socket(ipAddress, port));
    }

    public TCPConnection(TCPConnectionListener eventListener, final Socket socket) throws IOException {
        this.socket = socket;
        this.eventListener = eventListener;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8")));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TCPConnection.this.eventListener.onConnectionReady(TCPConnection.this);
                    // TODO: Send data
                    while (!rxThread.isInterrupted()) {
                        if(socket.getPort() == Setting.getPortGetWorkers()){
                            String nameWorker = in.readLine();
                            String kingOfServiceWorker = in.readLine();
                            String priceWorker = in.readLine();
                            int idButtonWorker = Integer.parseInt(in.readLine());
                            String imgWorker  = in.readLine();

                            TCPConnection.this.eventListener.onReceive(
                                    TCPConnection.this, nameWorker,
                                    kingOfServiceWorker, priceWorker, idButtonWorker,
                                    null);
                        }else {
                            String data = in.readLine();
                            TCPConnection.this.eventListener.onReceive(TCPConnection.this, data);
                        }
                        //Disconnect();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    rxThread.interrupt();
                } finally {
                    TCPConnection.this.eventListener.onDisconnect(TCPConnection.this);
                }
            }
        });
        rxThread.start();
    }

    public synchronized void SendData(String data) {
        try {
            out.write(data + "\r\n");
            out.flush();
        } catch (IOException e) {
            this.eventListener.onExeption(TCPConnection.this, e);
            Disconnect();
        }
    }

    public synchronized void Disconnect() {
        rxThread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            this.eventListener.onExeption(TCPConnection.this, e);
        }
    }

    @Override
    public String toString() {
        return "TCPConnectin: " + socket.getInetAddress() + ":" + socket.getPort();
    }
}
