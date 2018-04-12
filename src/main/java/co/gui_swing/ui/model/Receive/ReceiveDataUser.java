package co.gui_swing.ui.model.Receive;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Setting;
import co.gui_swing.ui.model.TCPConnection;
import co.gui_swing.ui.model.TCPConnectionListener;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class ReceiveDataUser {
    private DataUser dataUser;

    public ReceiveDataUser() {
        this.dataUser = ReceiveLogIn.getDataUser();
        this.dataUser.nameUser = "  " + this.dataUser.getNameUser() + "          ";
    }

    public DataUser getDataUser() {
        return dataUser;
    }
}
