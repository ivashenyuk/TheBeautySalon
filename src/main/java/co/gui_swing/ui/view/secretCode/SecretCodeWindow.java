/*
 * Created by JFormDesigner on Sun Apr 15 11:45:28 EEST 2018
 */

package co.gui_swing.ui.view.secretCode;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ivashenuik Yurii
 */
public class SecretCodeWindow extends JFrame {
    public SecretCodeWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        labelSecretCode = new JLabel();
        continueBtn = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setTitle("\u0412\u0430\u0448 \u0441\u0435\u043a\u0440\u0435\u0442\u043d\u0438\u0439 \u043a\u043e\u0434");
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


            //---- labelSecretCode ----
            labelSecretCode.setText("Xf34bBd71C");
            labelSecretCode.setFont(new Font("Tahoma", Font.ITALIC, 48));
            labelSecretCode.setHorizontalAlignment(SwingConstants.CENTER);

            //---- continueBtn ----
            continueBtn.setText("\u041f\u0440\u043e\u0434\u043e\u0432\u0436\u0438\u0442\u0438");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(labelSecretCode, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(continueBtn, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(labelSecretCode, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(continueBtn)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private JLabel labelSecretCode;
    private JButton continueBtn;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JLabel getLabelSecretCode() {
        return labelSecretCode;
    }

    public JButton getContinueBtn() {
        return continueBtn;
    }
}
