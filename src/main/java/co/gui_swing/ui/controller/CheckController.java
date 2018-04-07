package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.view.Check.CheckWindow;
import co.gui_swing.ui.view.Service.MainWindow;

import javax.swing.*;

public class CheckController {
    private DataWorker dataWorker;
    private CheckWindow checkWindow;
    private int idButtonClecked;
    private DataUser dataUser;

    private JLabel kingOfServiceLable;
    private JLabel workerLable;
    private JTextField customer;
    private JLabel priceLable;
    private JLabel emailLable;
    private JButton confirmBtn;
    private JSpinner dateOrder;

    public CheckController(int idButtonClecked, DataWorker dataWorker) {
        this.checkWindow = new CheckWindow();
        this.dataUser = MainWindow.dataUser;

        this.idButtonClecked = idButtonClecked;
        this.dataWorker = dataWorker;

        this.kingOfServiceLable = this.checkWindow.getKingOfServiceLable();
        this.workerLable = this.checkWindow.getWorkerLable();
        this.customer = this.checkWindow.getCustomer();
        this.priceLable = this.checkWindow.getPriceLable();
        this.emailLable = this.checkWindow.getEmailLable();
        this.confirmBtn = this.checkWindow.getConfirmBtn();
        this.dateOrder = this.checkWindow.getDateOrder();

        this.kingOfServiceLable.setText(this.dataWorker.getKingOfServiceWorker());
        this.workerLable.setText(this.dataWorker.getNameWorker());
        this.priceLable.setText(this.dataWorker.getPriceWorker());
        this.emailLable.setText(this.dataUser.getEmailUser());
        this.customer.setText(this.dataUser.getNameUser());

        this.checkWindow.SHOW();
    }
}
