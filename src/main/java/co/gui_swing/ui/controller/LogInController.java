package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Receive.ReceiveLogIn;
import co.gui_swing.ui.view.Log_in.LogInWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;

public class LogInController {
    private JLabel forgotPassword;
    private LogInWindow logInWindow;
    private JLabel registration;
    private JTextField emailField;
    private JButton logInBtn;
    private JPasswordField passwordField;
    private static String password;
    private static String email;

    public LogInController() {
        initComponents();
        initListener();
    }

    private void initComponents() {
        this.logInWindow = new LogInWindow();
        this.forgotPassword = this.logInWindow.getForgotPassword();
        this.registration = this.logInWindow.getRegistration();
        this.emailField = this.logInWindow.getEmailField();
        this.logInBtn = this.logInWindow.getLogInBtn();
        this.passwordField = this.logInWindow.getPasswordField();
    }

    public void showLogInFrameController() {
        this.logInWindow.setVisible(true);
    }

    private void initListener() {
        this.registration.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new RegistrationController().showRegistrationFrameController();
                logInWindow.hide();
            }
        });
        this.logInBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String passText = String.copyValueOf(passwordField.getPassword());
                if (validateEmail(emailField.getText()) && !passText.equals("")) {
                    password = passText;
                    email = emailField.getText();
                    ReceiveLogIn receiveLogIn = new ReceiveLogIn(emailField.getText(), passText);

                    if (receiveLogIn.isAoutorisation()) {
                        emailField.setBackground(new Color(255, 255, 255));
                        passwordField.setBackground(new Color(255, 255, 255));
                    } else {
                        emailField.setBackground(new Color(255, 0, 0));
                        passwordField.setBackground(new Color(255, 0, 0));
                        return;
                    }
                } else {
                    if (!validateEmail(emailField.getText()))
                        emailField.setBackground(new Color(255, 0, 0));
                    else
                        emailField.setBackground(new Color(255, 255, 255));
                    if (passText.equals(""))
                        passwordField.setBackground(new Color(255, 0, 0));
                    else
                        passwordField.setBackground(new Color(255, 255, 255));
                    return;
                }
                new MainFrameController().showMainFrameController();
                logInWindow.hide();
            }
        });
        this.forgotPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new RestorationController();
                logInWindow.hide();
            }
        });
    }

    public static boolean validateEmail(String str) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        return pattern.matcher(str).matches();
    }

    public static String getPassword() {
        return password;
    }

    public static String getEmail() {
        return email;
    }
}
