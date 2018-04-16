package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;
import com.google.gson.Gson;

import java.io.IOException;

public class ReceiveChangePassword implements TCPConnectionListener {
    private String SecretCode;
    private String secretOrChange;
    private String email;
    private String password;
    private boolean OKorNO = false;

    public ReceiveChangePassword(String secretCode, String email, String secretOrChange) {
        this(secretCode, email, secretOrChange, null);

    }

    public ReceiveChangePassword(String SecretCode, String email, String secretOrChange, String password) {
        this.SecretCode = SecretCode;
        this.secretOrChange = secretOrChange;
        this.email = email;
        this.password = password;

        Thread threadClient = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TCPConnection(ReceiveChangePassword.this, Setting.getIpConnection(), Setting.getPortRestoration());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //threadClient.setDaemon(true);
        threadClient.start();
    }

    @Override
    public synchronized void onConnectionReady(TCPConnection tcpConnection) {
        System.out.println("Connected!");
        if (secretOrChange.equals("secret"))
            tcpConnection.SendData
                    (new Gson().toJson
                            (new String[]{new Gson().toJson(
                                    new String[]{
                                            email,
                                            SecretCode
                                    }
                                    ),
                                            secretOrChange
                                    }
                            )
                    );
        else if (secretOrChange.equals("change")) {
            tcpConnection.SendData(new Gson().toJson(new String[]{SecretCode, secretOrChange, password, email}));
        }

    }

    @Override
    public synchronized void onReceive(TCPConnection tcpConnection, String user) {
        if (user.equals("true")) {
            OKorNO = true;
        } else if (user.equals("false")) {
            OKorNO = false;
        }
    }

    @Override
    public void onReceive(TCPConnection tcpConnection, String nameWorker, String kingOfServiceWorker,
                          String priceWorker, int idButtonWorker, String imgWorker) {
    }

    @Override
    public synchronized void onDisconnect(TCPConnection tcpConnection) {
        System.out.println("Disconnected!");
    }

    @Override
    public synchronized void onExeption(TCPConnection tcpConnection, Exception ex) {
        System.out.println("TCPConnection exeption: " + ex);
    }

    public boolean isOKorNO() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return OKorNO;
    }
}
