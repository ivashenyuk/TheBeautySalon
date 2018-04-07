/*
 * Created by JFormDesigner on Sat Mar 31 22:29:05 EEST 2018
 */

package co.gui_swing.ui.view.Check;

import java.awt.*;
import javax.swing.*;

import de.wannawork.jcalendar.JCalendarPanel;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;
import sun.util.calendar.JulianCalendar;

/**
 * @author Ivasheniuk Yurii
 */
public class CheckWindow extends JDialog {

    public CheckWindow(Frame owner) {
        super(owner);
        initComponents();
    }

    public CheckWindow(Dialog owner) {
        super(owner);
        initComponents();
    }

    public CheckWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        label1 = new JLabel();
        kingOfServiceLable = new JLabel();
        label3 = new JLabel();
        workerLable = new JLabel();
        label5 = new JLabel();
        customer = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        priceLable = new JLabel();
        label2 = new JLabel();
        emailLable = new JLabel();
        confirmBtn = new JButton();
        datePanel = new JPanel();
        dateOrder = new JSpinner();

        //======== this ========
        setTitle("\u0427\u0435\u043a");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(360, 300));
            panel1.setOpaque(false);
            panel1.setMaximumSize(new Dimension(304, 395));
            panel1.setMinimumSize(new Dimension(294, 395));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- label1 ----
            label1.setText("\u0412\u0438\u0434 \u043f\u043e\u0441\u043b\u0443\u0433:");
            label1.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- kingOfServiceLable ----
            kingOfServiceLable.setText("\u041c\u0430\u0441\u0430\u0436");
            kingOfServiceLable.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label3 ----
            label3.setText("\u0412\u0438\u043a\u043e\u043d\u0430\u0432\u0435\u0446\u044c:");
            label3.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- workerLable ----
            workerLable.setText("Ivashenuik Yurii Olexandrovich");
            workerLable.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label5 ----
            label5.setText("\u0417\u0430\u043c\u043e\u0432\u043d\u0438\u043a:");
            label5.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- customer ----
            customer.setFont(new Font("Tahoma", Font.ITALIC, 14));
            customer.setOpaque(false);

            //---- label6 ----
            label6.setText("\u0414\u0430\u0442\u0430:");
            label6.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- label7 ----
            label7.setText("\u0426\u0456\u043d\u0430:");
            label7.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- priceLable ----
            priceLable.setText("100$");
            priceLable.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label2 ----
            label2.setText("Email:");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- emailLable ----
            emailLable.setText("yura.ivash@gmail.com");
            emailLable.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- confirmBtn ----
            confirmBtn.setText("\u041f\u0456\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0438");
            confirmBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //======== datePanel ========
            {

                //---- dateOrder ----
                dateOrder.setModel(new SpinnerDateModel(new java.util.Date((System.currentTimeMillis()/60000)*60000), new java.util.Date((System.currentTimeMillis()/60000)*60000), new java.util.Date(1744019640000L), java.util.Calendar.DAY_OF_MONTH));

                GroupLayout datePanelLayout = new GroupLayout(datePanel);
                datePanel.setLayout(datePanelLayout);
                datePanelLayout.setHorizontalGroup(
                    datePanelLayout.createParallelGroup()
                        .add(datePanelLayout.createSequentialGroup()
                            .add(dateOrder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(0, 0, Short.MAX_VALUE))
                );
                datePanelLayout.setVerticalGroup(
                    datePanelLayout.createParallelGroup()
                        .add(datePanelLayout.createSequentialGroup()
                            .add(dateOrder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .add(0, 12, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1Layout.setHonorsVisibility(false);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .add(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(panel1Layout.createParallelGroup()
                            .add(panel1Layout.createSequentialGroup()
                                .add(panel1Layout.createParallelGroup(GroupLayout.TRAILING, false)
                                    .add(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(GroupLayout.LEADING, label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(GroupLayout.LEADING, label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(18, 18, 18)
                                .add(panel1Layout.createParallelGroup()
                                    .add(workerLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(kingOfServiceLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                                        .add(panel1Layout.createParallelGroup()
                                            .add(customer)
                                            .add(datePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap())))
                            .add(panel1Layout.createSequentialGroup()
                                .add(panel1Layout.createParallelGroup(GroupLayout.TRAILING, false)
                                    .add(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(label7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(panel1Layout.createParallelGroup()
                                    .add(priceLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(emailLable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.RELATED, 175, GroupLayout.PREFERRED_SIZE)
                                .add(confirmBtn)
                                .addContainerGap())))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .add(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(kingOfServiceLable)
                            .add(label1))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label3)
                            .add(workerLable))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label5)
                            .add(customer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup()
                            .add(label6)
                            .add(datePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.TRAILING)
                            .add(label7)
                            .add(priceLable))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label2)
                            .add(emailLable))
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(confirmBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
            );
        }
        contentPane.add(panel1, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setAlwaysOnTop(true);
    }

    public void SHOW(){
        this.setVisible(true);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JPanel panel1;
    private JLabel label1;
    private JLabel kingOfServiceLable;
    private JLabel label3;
    private JLabel workerLable;
    private JLabel label5;
    private JTextField customer;
    private JLabel label6;
    private JLabel label7;
    private JLabel priceLable;
    private JLabel label2;
    private JLabel emailLable;
    private JButton confirmBtn;
    private JPanel datePanel;
    private JSpinner dateOrder;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public JLabel getKingOfServiceLable() {
        return kingOfServiceLable;
    }

    public JLabel getWorkerLable() {
        return workerLable;
    }

    public JTextField getCustomer() {
        return customer;
    }

    public JLabel getPriceLable() {
        return priceLable;
    }

    public JLabel getEmailLable() {
        return emailLable;
    }

    public JButton getConfirmBtn() {
        return confirmBtn;
    }

    public JSpinner getDateOrder() {
        return dateOrder;
    }

}
