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
 * @author Ivashenuik Yurii
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
        label4 = new JLabel();
        label5 = new JLabel();
        textField1 = new JTextField();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label2 = new JLabel();
        label9 = new JLabel();
        button1 = new JButton();
        datePanel = new JPanel();
        calendarPanel1 = new JCalendarPanel();

        //======== this ========
        setTitle("\u0427\u0435\u043a");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(330, 425));
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

            //---- label4 ----
            label4.setText("Ivashenuik Yurii Olexandrovich");
            label4.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label5 ----
            label5.setText("\u0417\u0430\u043c\u043e\u0432\u043d\u0438\u043a:");
            label5.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- textField1 ----
            textField1.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label6 ----
            label6.setText("\u0414\u0430\u0442\u0430:");
            label6.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- label7 ----
            label7.setText("\u0426\u0456\u043d\u0430:");
            label7.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- label8 ----
            label8.setText("100$");
            label8.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- label2 ----
            label2.setText("Email:");
            label2.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //---- label9 ----
            label9.setText("yura.ivash@gmail.com");
            label9.setFont(new Font("Tahoma", Font.ITALIC, 14));

            //---- button1 ----
            button1.setText("\u041f\u0456\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0438");
            button1.setFont(new Font("Tahoma", Font.PLAIN, 14));

            //======== datePanel ========
            {
                datePanel.setLayout(new BorderLayout());
                datePanel.add(calendarPanel1, BorderLayout.WEST);
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
                                    .add(label4, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .add(kingOfServiceLable, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .add(GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                                        .add(panel1Layout.createParallelGroup()
                                            .add(textField1, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .add(datePanel, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                        .addContainerGap())))
                            .add(panel1Layout.createSequentialGroup()
                                .add(panel1Layout.createParallelGroup(GroupLayout.TRAILING, false)
                                    .add(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(label7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(18, 18, 18)
                                .add(panel1Layout.createParallelGroup()
                                    .add(label8, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .add(label9, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))))
                    .add(GroupLayout.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(185, Short.MAX_VALUE)
                        .add(button1)
                        .addContainerGap())
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
                            .add(label4))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label5)
                            .add(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup()
                            .add(label6)
                            .add(datePanel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.RELATED)
                        .add(panel1Layout.createParallelGroup(GroupLayout.TRAILING)
                            .add(label7)
                            .add(label8))
                        .add(18, 18, 18)
                        .add(panel1Layout.createParallelGroup(GroupLayout.BASELINE)
                            .add(label2)
                            .add(label9))
                        .addPreferredGap(LayoutStyle.UNRELATED)
                        .add(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        contentPane.add(panel1, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
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
    private JLabel label4;
    private JLabel label5;
    private JTextField textField1;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label2;
    private JLabel label9;
    private JButton button1;
    private JPanel datePanel;
    private JCalendarPanel calendarPanel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
