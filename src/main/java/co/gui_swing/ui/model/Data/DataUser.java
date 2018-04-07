package co.gui_swing.ui.model.Data;

public class DataUser {
    public int idUser;
    public String nameUser;
    public String emailUser;
    public String statusUser;

    public DataUser() {
        this.idUser = -1;
        this.nameUser = "";
        this.emailUser = "";
        this.statusUser = "";
    }

    public DataUser(int idUser, String nameUser, String emailUser, String statusUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.statusUser = statusUser;
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
}
