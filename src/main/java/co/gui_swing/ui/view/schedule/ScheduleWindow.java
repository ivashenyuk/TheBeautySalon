/*
 * Created by JFormDesigner on Sun Apr 01 18:29:04 EEST 2018
 */

package co.gui_swing.ui.view.schedule;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Ivashenuik Yurii
 */
public class ScheduleWindow extends JDialog {
    public ScheduleWindow(Frame owner) {
        super(owner);
        initComponents();
    }

    public ScheduleWindow(Dialog owner) {
        super(owner);
        initComponents();
    }

    public ScheduleWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle("\u0420\u043e\u0431\u043e\u0447\u0456 \u0434\u043d\u0456 \u043f\u0440\u0430\u0446\u0456\u0432\u043a\u0456\u0432");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                    "\u0412\u0438\u0434 \u043f\u043e\u0441\u043b\u0443\u0433", "\u0412\u0438\u043a\u043e\u043d\u0430\u0432\u0435\u0446\u044c", "\u0433\u043e\u0434\u0438\u043d\u0438/\u0434\u043d\u0456"
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
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        setAlwaysOnTop(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void SHOW(){
        this.setVisible(true);
    }
}
