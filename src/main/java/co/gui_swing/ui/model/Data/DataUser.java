package co.gui_swing.ui.model.Data;

public class DataUser {
    private int idUser;
    public String nameUser;
    private String emailUser;
    private String statusUser;
    private String password;

    public DataUser() {
        this.idUser = -1;
        this.nameUser = "";
        this.emailUser = "";
        this.statusUser = "";
        this.password = "";
    }

    public DataUser(int idUser, String nameUser, String emailUser, String statusUser, String password) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.statusUser = statusUser;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public String getPassword() {
        return password;
    }
}
