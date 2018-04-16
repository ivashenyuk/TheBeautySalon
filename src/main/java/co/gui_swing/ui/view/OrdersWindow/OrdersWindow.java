/*
 * Created by JFormDesigner on Sat Apr 14 17:02:16 EEST 2018
 */

package co.gui_swing.ui.view.OrdersWindow;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Ivashenuik Yurii
 */
public class OrdersWindow extends JDialog {
    public OrdersWindow(Frame owner) {
        super(owner);
        initComponents();
    }

    public OrdersWindow(Dialog owner) {
        super(owner);
        initComponents();
    }

    public OrdersWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        ordersTable = new JTable();

        //======== this ========
        setTitle("\u0417\u0430\u043c\u043e\u0432\u043b\u0435\u043d\u043d\u044f");
        setResizable(false);
        setAlwaysOnTop(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(988, 343));
            panel1.setMaximumSize(new Dimension(988, 343));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new BorderLayout());

            //======== scrollPane1 ========
            {

                //---- ordersTable ----
                ordersTable.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "\u2116", "\u0417\u0430\u043c\u043e\u0432\u043d\u0438\u043a", "\u0412\u0438\u0434 \u043f\u043e\u0441\u043b\u0443\u0433", "\u0426\u0456\u043d\u0430", "Email", "\u0414\u0430\u0442\u0430", "\u0412\u0438\u043a\u043e\u043d\u0430\u0432\u0435\u0446\u044c", "\u0417\u043d\u0438\u0436\u043a\u0430"
                    }
                ));
                {
                    TableColumnModel cm = ordersTable.getColumnModel();
                    cm.getColumn(0).setMinWidth(45);
                    cm.getColumn(0).setMaxWidth(50);
                    cm.getColumn(1).setMinWidth(200);
                    cm.getColumn(1).setMaxWidth(200);
                    cm.getColumn(2).setMinWidth(150);
                    cm.getColumn(2).setMaxWidth(150);
                    cm.getColumn(3).setMinWidth(90);
                    cm.getColumn(3).setMaxWidth(90);
                    cm.getColumn(4).setMinWidth(170);
                    cm.getColumn(4).setMaxWidth(170);
                    cm.getColumn(5).setMinWidth(120);
                    cm.getColumn(5).setMaxWidth(120);
                    cm.getColumn(6).setMinWidth(150);
                    cm.getColumn(6).setMaxWidth(150);
                    cm.getColumn(7).setMinWidth(60);
                    cm.getColumn(7).setMaxWidth(60);
                }
                ordersTable.setEnabled(false);
                ordersTable.setPreferredScrollableViewportSize(new Dimension(990, 400));
                scrollPane1.setViewportView(ordersTable);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable ordersTable;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public JTable getOrdersTable() {
        return ordersTable;
    }
}
