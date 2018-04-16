package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Receive.ReceiveChangePassword;
import co.gui_swing.ui.model.Receive.ReceiveLogIn;
import co.gui_swing.ui.view.RestorationWindow.NewPasswordWindow;
import co.gui_swing.ui.view.RestorationWindow.RestorationWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RestorationController {
    private RestorationWindow restorationWindow;
    private NewPasswordWindow newPasswordWindow;
    private JTextField emailField;
    private JTextField SecretCodeField;
    private JButton nextBtn;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton changeBtn;

    public RestorationController() {
        initComponents();
        initListener();
        this.restorationWindow.show();
    }

    private void initComponents() {
        this.restorationWindow = new RestorationWindow();
        this.newPasswordWindow = new NewPasswordWindow();

        this.emailField = this.restorationWindow.getEmailField();
        this.SecretCodeField = this.restorationWindow.getSecretCodeField();
        this.nextBtn = this.restorationWindow.getNextBtn();

        this.passwordField1 = this.newPasswordWindow.getPasswordField1();
        this.passwordField2 = this.newPasswordWindow.getPasswordField2();
        this.changeBtn = this.newPasswordWindow.getChangeBtn();
    }

    private void initListener() {
        this.nextBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!LogInController.validateEmail(emailField.getText())) {
                    emailField.setBackground(new Color(255, 0, 0));
                    return;
                }
                emailField.setBackground(new Color(255, 255, 255));
                if (SecretCodeField.getText().length() != 10) {
                    SecretCodeField.setBackground(new Color(255, 0, 0));
                    return;
                }
                SecretCodeField.setBackground(new Color(255, 255, 255));
                ReceiveChangePassword changePassword = new ReceiveChangePassword(SecretCodeField.getText(), emailField.getText(), "secret");
                if (changePassword.isOKorNO()) {
                    restorationWindow.hide();
                    newPasswordWindow.show();
                } else {
                    SecretCodeField.setBackground(new Color(255, 0, 0));
                    emailField.setBackground(new Color(255, 0, 0));
                    return;
                }
            }
        });
        this.changeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (String.valueOf(passwordField1.getPassword()).equals("")) {
                    passwordField1.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordField1.setBackground(new Color(255, 255, 255));
                if (String.valueOf(passwordField2.getPassword()).equals("")) {
                    passwordField2.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordField2.setBackground(new Color(255, 255, 255));

                if (!String.valueOf(passwordField1.getPassword()).equals(String.valueOf(passwordField2.getPassword()))) {
                    passwordField2.setBackground(new Color(255, 0, 0));
                    passwordField1.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordField2.setBackground(new Color(255, 255, 255));
                passwordField1.setBackground(new Color(255, 255, 255));

                ReceiveChangePassword changePassword = new ReceiveChangePassword(SecretCodeField.getText(), emailField.getText(), "change", String.valueOf(passwordField1.getPassword()));
                if(changePassword.isOKorNO()){
                    ReceiveLogIn logIn = new ReceiveLogIn(emailField.getText(), String.valueOf(passwordField1.getPassword()));
                    if(logIn.isAoutorisation()){
                        new MainFrameController().showMainFrameController();
                        newPasswordWindow.hide();
                    }
                }

            }
        });
    }
}
