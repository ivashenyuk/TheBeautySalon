package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Receive.ReceiveLogIn;
import co.gui_swing.ui.model.Receive.ReceiveRegistration;
import co.gui_swing.ui.view.Registration.RegistrationWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegistrationController {
    private RegistrationWindow registrationWindow;

    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField passwordFieldAgain;
    private JButton registrationBtn;
    private JLabel logInBtn;

    public RegistrationController() {
        initComponents();
        initListener();
    }

    private void initComponents() {
        this.registrationWindow = new RegistrationWindow();

        this.nameField = this.registrationWindow.getNameField();
        this.emailField = this.registrationWindow.getEmailField();
        this.passwordField = this.registrationWindow.getPasswordField();
        this.passwordFieldAgain = this.registrationWindow.getPasswordFieldAgain();
        this.registrationBtn = this.registrationWindow.getRegistrationBtn();
        this.logInBtn = this.registrationWindow.getLogInBtn();
    }

    private void initListener() {
        this.logInBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new LogInController().showLogInFrameController();
                registrationWindow.hide();
            }
        });

        this.registrationBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (nameField.getText().equals("") || nameField.getText().length() < 7) {
                    nameField.setBackground(new Color(255, 0, 0));
                    return;
                }
                nameField.setBackground(new Color(255, 255, 255));
                if (!LogInController.validateEmail(emailField.getText())) {
                    emailField.setBackground(new Color(255, 0, 0));
                    return;
                }
                emailField.setBackground(new Color(255, 255, 255));
                if (String.valueOf(passwordField.getPassword()).equals("")) {
                    passwordField.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordField.setBackground(new Color(255, 255, 255));
                if (String.valueOf(passwordFieldAgain.getPassword()).equals("")) {
                    passwordFieldAgain.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordFieldAgain.setBackground(new Color(255, 255, 255));
                if (!String.valueOf(passwordField.getPassword()).equals(String.valueOf(passwordFieldAgain.getPassword()))) {
                    passwordFieldAgain.setBackground(new Color(255, 0, 0));
                    passwordField.setBackground(new Color(255, 0, 0));
                    return;
                }
                passwordFieldAgain.setBackground(new Color(255, 255, 255));
                passwordField.setBackground(new Color(255, 255, 255));

                ReceiveRegistration receiveRegistration =
                        new ReceiveRegistration(nameField.getText(), emailField.getText(),
                                String.valueOf(passwordField.getPassword()));
                if (!receiveRegistration.isOKorNO()) {
                    emailField.setBackground(new Color(255, 0, 0));
                    return;
                }
                emailField.setBackground(new Color(255, 255, 255));
                ReceiveLogIn logIn = new ReceiveLogIn(emailField.getText(), String.valueOf(passwordField.getPassword()));
                if(logIn.isAoutorisation()){
                    new SecretCode(receiveRegistration.getSecretCode());
                    registrationWindow.hide();
                }
            }
        });
    }

    public void showRegistrationFrameController() {
        this.registrationWindow.show();
    }
}
