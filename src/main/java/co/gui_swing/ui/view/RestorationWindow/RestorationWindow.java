/*
 * Created by JFormDesigner on Sun Apr 15 19:22:28 EEST 2018
 */

package co.gui_swing.ui.view.RestorationWindow;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ivashenuik Yurii
 */
public class RestorationWindow extends JFrame {
    public RestorationWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        label1 = new JLabel();
        emailField = new JTextField();
        label2 = new JLabel();
        SecretCodeField = new JTextField();
        nextBtn = new JButton();

        //======== this ========
        setTitle("\u0417\u0430\u043f\u043e\u0432\u043d\u0456\u0442\u044c \u0434\u0430\u043d\u0456 \u0434\u043b\u044f \u0432\u0456\u0434\u043d\u043e\u0432\u043b\u0435\u043d\u043d\u044f \u0434\u043e\u0441\u0442\u0443\u043f\u0443");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
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
            label1.setText("\u0412\u0430\u0448 email: ");
            label1.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- label2 ----
            label2.setText("\u0412\u0430\u0448 \u0441\u0435\u043a\u0440\u0435\u0442\u043d\u0438\u0439 \u043a\u043e\u0434: ");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- nextBtn ----
            nextBtn.setText("\u0414\u0430\u043b\u0456");
            nextBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailField, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SecretCodeField, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(0, 285, Short.MAX_VALUE)
                                .addComponent(nextBtn, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecretCodeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(nextBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
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
    private JTextField emailField;
    private JLabel label2;
    private JTextField SecretCodeField;
    private JButton nextBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getSecretCodeField() {
        return SecretCodeField;
    }

    public JButton getNextBtn() {
        return nextBtn;
    }
}
