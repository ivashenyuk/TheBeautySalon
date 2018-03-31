package co.gui_swing.ui.controller;

import co.gui_swing.ui.view.Service.MainWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {
    private MainWindow mainWindow;

    public MainFrameController() {
        initComponent();
        initListener();
    }

    public void showMainFrameController(){
        mainWindow.setVisible(true);
    }

    private void initComponent() {
        mainWindow = new MainWindow();
    }

    private void initListener() {
    }

    class MyAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

}
