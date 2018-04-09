/*
 * Created by JFormDesigner on Sat Apr 07 21:54:28 EEST 2018
 */

package co.gui_swing.ui.view.Registration;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ivashenuik Yurii
 */
public class RegistrationWindow extends JFrame {
    public RegistrationWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        label1 = new JLabel();
        nameField = new JTextField();
        emailField = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        passwordField = new JPasswordField();
        label4 = new JLabel();
        passwordFieldAgain = new JPasswordField();
        registrationBtn = new JButton();
        logInBtn = new JLabel();

        //======== this ========
        setTitle("\u0420\u0435\u0454\u0441\u0442\u0440\u0430\u0446\u0456\u044f");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- label1 ----
            label1.setText("\u0406\u043c'\u044f \u043a\u043e\u0440\u0438\u0441\u0442\u0443\u0432\u0430\u0447\u0430");
            label1.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- label2 ----
            label2.setText("Email");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- label3 ----
            label3.setText("\u041f\u0430\u0440\u043e\u043b\u044c");
            label3.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- label4 ----
            label4.setText("\u041f\u0430\u0440\u043e\u043b\u044c \u0449\u0435 \u0440\u0430\u0437");
            label4.setFont(new Font("Tahoma", Font.PLAIN, 16));

            //---- registrationBtn ----
            registrationBtn.setText("\u0417\u0430\u0440\u0435\u0454\u0441\u0442\u0440\u0443\u0432\u0430\u0442\u0438\u0441\u044c");
            registrationBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
            registrationBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- logInBtn ----
            logInBtn.setText("\u0412\u0432\u0456\u0439\u0442\u0438 \u0432 \u0456\u0441\u043d\u0443\u044e\u0447\u0438\u0439 \u0430\u043a\u0430\u0443\u043d\u0442");
            logInBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
            logInBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(emailField)
                            .addComponent(nameField)
                            .addComponent(passwordField)
                            .addComponent(registrationBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logInBtn))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label3)
                                    .addComponent(label1)
                                    .addComponent(label4))
                                .addGap(0, 365, Short.MAX_VALUE))
                            .addComponent(passwordFieldAgain, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordFieldAgain, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registrationBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logInBtn)
                        .addContainerGap(15, Short.MAX_VALUE))
            );
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JPanel panel1;
    private JLabel label1;
    private JTextField nameField;
    private JTextField emailField;
    private JLabel label2;
    private JLabel label3;
    private JPasswordField passwordField;
    private JLabel label4;
    private JPasswordField passwordFieldAgain;
    private JButton registrationBtn;
    private JLabel logInBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    //------------------------- Getters ----------------------------

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JPasswordField getPasswordFieldAgain() {
        return passwordFieldAgain;
    }

    public JButton getRegistrationBtn() {
        return registrationBtn;
    }

    public JLabel getLogInBtn() {
        return logInBtn;
    }
}
