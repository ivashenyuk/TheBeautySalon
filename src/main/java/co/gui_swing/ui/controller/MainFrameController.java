package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataUser;
import co.gui_swing.ui.model.Data.DataWorker;
import co.gui_swing.ui.model.Receive.ReceiveDataUser;
import co.gui_swing.ui.model.Receive.ReceiveDataWorkers;
import co.gui_swing.ui.view.Service.MainWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.*;
import java.util.ArrayList;

public class MainFrameController {
    private MainWindow mainWindow;
    private ArrayList<JPanel> listWorkers;
    private ArrayList<JButton> listBtnOrder;
    private JPanel workersPanel;
    private JMenu statistic;
    private JMenu schedule;
    private JMenu profit;
    private DataUser dataUser;
    private JMenuItem changeAcount;
    private JMenuItem exit;
    private ArrayList<DataWorker> dataWorkers = null;


    public MainFrameController() {
        dataWorkers = new ReceiveDataWorkers().getDataWorkers();
        this.dataUser = MainWindow.dataUser;
        this.dataUser = new ReceiveDataUser().getDataUser();
        MainWindow.dataUser = this.dataUser;
        initComponent();
        initListener();
    }

    public void showMainFrameController() {
        mainWindow.setVisible(true);
    }

    private void initComponent() {
        MainWindow.MAXHEIGHTWINDOW = 200 * dataWorkers.size();
        mainWindow = new MainWindow();
        this.workersPanel = mainWindow.getWorkersPanel();

        for (int i = 0; i < dataWorkers.size(); i++) {
            mainWindow.createWorkers(
                    dataWorkers.get(i).getImgWorker(), dataWorkers.get(i).getNameWorker(),
                    dataWorkers.get(i).getKingOfServiceWorker(), dataWorkers.get(i).getPriceWorker());
        }

        this.listBtnOrder = mainWindow.getListBtnOrder();
        this.listWorkers = mainWindow.getListWorkers();

        for (JPanel worker : this.listWorkers) {
            workersPanel.add(worker);
        }
        this.profit = this.mainWindow.getProfit();
        this.schedule = this.mainWindow.getSchedule();
        this.dataUser = new ReceiveDataUser().getDataUser();
        this.changeAcount = this.mainWindow.getChangeAcount();
        this.exit = this.mainWindow.getExit();
    }

    private void initListener() {
        int i = 0;
        for (final JButton orderBtn : listBtnOrder) {
            orderBtn.putClientProperty("id", i);
            i++;

            final int finalI = i;
            orderBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new CheckController((Integer) orderBtn.getClientProperty("id"), dataWorkers.get(finalI));
                }
            });
        }
        profit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ProfitController();
            }
        });
        schedule.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new ScheduleController();
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        changeAcount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LogInController().showLogInFrameController();
                mainWindow.setVisible(false);
            }
        });
    }
}
