/*
 * Created by JFormDesigner on Sat Apr 07 21:53:45 EEST 2018
 */

package co.gui_swing.ui.view.Log_in;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Ivashenuik Yurii
 */
public class LogInWindow extends JFrame {
    public LogInWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        label1 = new JLabel();
        emailField = new JTextField();
        label2 = new JLabel();
        logInBtn = new JButton();
        passwordField = new JPasswordField();
        forgotPassword = new JLabel();
        registration = new JLabel();

        //======== this ========
        setTitle("\u0412\u0445\u0456\u0434");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(368, 388));
            panel1.setMaximumSize(new Dimension(368, 388));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- label1 ----
            label1.setText("Email:");
            label1.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- emailField ----
            emailField.setText("yura.ivash@gmail.com");

            //---- label2 ----
            label2.setText("\u041f\u0430\u0440\u043e\u043b\u044c:");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- logInBtn ----
            logInBtn.setText("\u0412\u0445\u0456\u0434");
            logInBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- forgotPassword ----
            forgotPassword.setText("\u0417\u0430\u0431\u0443\u043b\u0438 \u043f\u0430\u0440\u043e\u043b\u044c?");
            forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- registration ----
            registration.setText("\u0420\u0435\u0454\u0441\u0442\u0440\u0430\u0446\u0456\u044f");
            registration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(emailField, GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(forgotPassword, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(registration)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(logInBtn, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 275, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(logInBtn, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(forgotPassword, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                .addComponent(registration)))
                        .addContainerGap())
            );
        }
        contentPane.add(panel1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JPanel panel1;
    private JLabel label1;
    private JTextField emailField;
    private JLabel label2;
    private JButton logInBtn;
    private JPasswordField passwordField;
    private JLabel forgotPassword;
    private JLabel registration;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    /*--------------------------------------- Getters ------------------------------------------*/
    public JButton getLogInBtn() {
        return logInBtn;
    }

    public JLabel getForgotPassword() {
        return forgotPassword;
    }

    public JLabel getRegistration() {
        return registration;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
