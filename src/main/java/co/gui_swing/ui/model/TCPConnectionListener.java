package co.gui_swing.ui.model;

import java.awt.*;

public interface TCPConnectionListener {
    void onConnectionReady(TCPConnection tcpConnection);
    void onReceive(TCPConnection tcpConnection, String data);
    void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker, String priceWorker, int idButtonWorker, Image imgWorker);
    void onDisconnect(TCPConnection tcpConnection);
    void onExeption(TCPConnection tcpConnection, Exception ex);
}
