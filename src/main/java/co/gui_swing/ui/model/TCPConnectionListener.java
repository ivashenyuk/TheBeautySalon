package co.gui_swing.ui.model;

public interface TCPConnectionListener {
    void onConnectionReady(TCPConnection tcpConnection);
    void onReceive(TCPConnection tcpConnection, String data);
    void onDisconnect(TCPConnection tcpConnection);
    void onExeption(TCPConnection tcpConnection, Exception ex);
}
