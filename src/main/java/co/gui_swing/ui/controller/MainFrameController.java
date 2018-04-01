package co.gui_swing.ui.controller;

import co.gui_swing.ui.view.Check.CheckWindow;
import co.gui_swing.ui.view.Service.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrameController {
    private MainWindow mainWindow;
    private ArrayList<JPanel> listWorkers;
    private ArrayList<JButton> listBtnOrder;
    private JPanel workersPanel;

    public MainFrameController() {
        initComponent();
        initListener();
    }

    public void showMainFrameController() {
        mainWindow.setVisible(true);
    }

    private void initComponent() {
        mainWindow = new MainWindow();
        this.workersPanel = mainWindow.getWorkersPanel();

        mainWindow.createWorkers(getImage("img.jpg"), "Ivasheniuk Yurii Olexandrovich", "Масаж", "100$");
        mainWindow.createWorkers(getImage("img.jpg"), "Ivasheniuk Yurii Olexandrovich", "Масаж", "200$");

        this.listBtnOrder = mainWindow.getListBtnOrder();
        this.listWorkers = mainWindow.getListWorkers();

        for (JPanel worker : this.listWorkers) {
            workersPanel.add(worker);
        }
        for (JButton orderBtn : listBtnOrder) {
            orderBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new CheckWindow().SHOW();
                }
            });
        }

    }

    private void initListener() {
    }

    class MyAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static Image getImage(String name) {
        String filename = "E://" + name;
        Image gras = Toolkit.getDefaultToolkit().getImage(filename);
        return gras;
    }

}
