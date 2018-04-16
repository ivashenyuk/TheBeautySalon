package co.gui_swing.ui.controller;

import co.gui_swing.ui.view.secretCode.SecretCodeWindow;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecretCode {
    private SecretCodeWindow secretCodeWindow;
    private JLabel labelSecretCode;
    private JButton continueBtn;


    private String secretCode;

    public SecretCode(String secretCode) {
        this.secretCode = secretCode;
        this.secretCodeWindow = new SecretCodeWindow();

        this.labelSecretCode = this.secretCodeWindow.getLabelSecretCode();
        this.labelSecretCode.setText(this.secretCode);

        this.continueBtn = this.secretCodeWindow.getContinueBtn();
        this.continueBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new MainFrameController().showMainFrameController();
                secretCodeWindow.hide();
            }
        });
        this.secretCodeWindow.show();
    }
}
