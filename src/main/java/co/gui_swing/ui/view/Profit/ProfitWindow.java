/*
 * Created by JFormDesigner on Sun Apr 01 18:07:40 EEST 2018
 */

package co.gui_swing.ui.view.Profit;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author Ivashenuik Yurii
 */
public class ProfitWindow extends JDialog {
    public ProfitWindow(Frame owner) {
        super(owner);
        initComponents();
    }

    public ProfitWindow(Dialog owner) {
        super(owner);
        initComponents();
    }

    public ProfitWindow() {
        initComponents();
    }
    public void SHOW(){
        this.setVisible(true);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        tableProfit = new JTable();

        //======== this ========
        setTitle("\u041f\u0440\u0438\u0431\u0443\u0442\u043e\u043a");
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


            //======== scrollPane1 ========
            {
                scrollPane1.setMinimumSize(new Dimension(400, 300));

                //---- tableProfit ----
                tableProfit.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "Сервіс", "\u041f\u0440\u0438\u0431\u0443\u0442\u043e\u043a \u0444\u0456\u0440\u043c\u0438", "\u0417/\u041f \u041f\u0440\u0430\u0446\u0456\u0432\u043d\u0438\u043a\u0430"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                tableProfit.setPreferredSize(new Dimension(225, 0));
                tableProfit.setEnabled(false);
                scrollPane1.setViewportView(tableProfit);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .add(scrollPane1, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
            );
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setAlwaysOnTop(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTable tableProfit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public JTable getTableProfit() {
        return tableProfit;
    }
}
