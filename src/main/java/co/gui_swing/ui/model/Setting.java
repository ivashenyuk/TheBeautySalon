package co.gui_swing.ui.model;

public class Setting {
    public static String getIpConnection() {
        return ipConnection;
    }

    private static final String ipConnection = "127.0.0.1";
    private static final int portConnection = 1356;

    public static int getPortConnection() {
        return portConnection;
    }
}
