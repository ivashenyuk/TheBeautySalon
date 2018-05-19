package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.model.Receive.ReceiveCheck;
import co.gui_swing.ui.view.Check.CheckWindow;
import co.gui_swing.ui.view.Service.MainWindow;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import static jdk.nashorn.internal.objects.NativeString.trim;

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
        initComponents(idButtonClecked, dataWorker);
        initListener();
    }

    private void initComponents(int idButtonClecked, DataWorker dataWorker) {
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

        this.kingOfServiceLable.setText(this.dataWorker.getPriceWorker());
        this.workerLable.setText(this.dataWorker.getNameWorker());
        this.priceLable.setText(this.dataWorker.getKingOfServiceWorker());
        this.emailLable.setText(this.dataUser.getEmailUser());
        this.customer.setText(trim(this.dataUser.getNameUser()));

        this.checkWindow.SHOW();
    }

    private void initListener() {
        this.confirmBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SimpleDateFormat formater = new SimpleDateFormat("dd.mm.YYYY HH:MM:ss");
                Object value = CheckController.this.dateOrder.getValue();
                String time="";
                if (value instanceof Date) {
                    Date date = (Date)value;
                    SimpleDateFormat format = new SimpleDateFormat("dd.mm.YYYY HH:MM:ss");
                    time = format.format(date);
                }
                ReceiveCheck receiveCheck = new ReceiveCheck(CheckController.this.kingOfServiceLable.getText(), CheckController.this.workerLable.getText(),
                        CheckController.this.customer.getText(), time, CheckController.this.priceLable.getText(),
                        CheckController.this.emailLable.getText());

                if (!receiveCheck.isOKorNO()) {
                    CheckController.this.dateOrder.getEditor().getComponent(0).setBackground(new Color(255, 0, 0));
                    return;
                }
                CheckController.this.dateOrder.getEditor().getComponent(0).setBackground(new Color(255, 255, 255));

                CheckController.this.checkWindow.hide();
            }
        });
    }
}
