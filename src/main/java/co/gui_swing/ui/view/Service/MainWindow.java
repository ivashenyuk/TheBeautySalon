/*
 * Created by JFormDesigner on Fri Mar 30 18:18:39 EEST 2018
 */

package co.gui_swing.ui.view.Service;

import java.awt.*;
import javax.swing.*;

/**
 * @author Ivashenuik Yurii
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        menuBar1 = new JMenuBar();
        statistic = new JMenu();
        schedule = new JMenu();
        profit = new JMenu();
        hSpacer1 = new JPanel(null);
        nameUser = new JLabel();
        workers = new JPanel();
        worker = new JPanel();
        imgWorker = new JPanel();
        informationWorker = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(5, 5));

        //======== menuBar1 ========
        {

            //======== statistic ========
            {
                statistic.setText("\u0421\u0442\u0430\u0442\u0438\u0441\u0442\u0438\u043a\u0430");
            }
            menuBar1.add(statistic);

            //======== schedule ========
            {
                schedule.setText("\u0420\u043e\u0431\u043e\u0447\u0438\u0439 \u0440\u043e\u0437\u043a\u043b\u0430\u0434");
            }
            menuBar1.add(schedule);

            //======== profit ========
            {
                profit.setText("\u041f\u0440\u0438\u0431\u0443\u0442\u043e\u043a");
            }
            menuBar1.add(profit);
            menuBar1.add(hSpacer1);

            //---- nameUser ----
            nameUser.setText("Name User");
            menuBar1.add(nameUser);
        }
        setJMenuBar(menuBar1);

        //======== workers ========
        {
            workers.setAutoscrolls(true);

            // JFormDesigner evaluation mark
            workers.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), workers.getBorder())); workers.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            workers.setLayout(new BorderLayout(2, 1));

            //======== worker ========
            {
                worker.setMaximumSize(new Dimension(2147483647, 200));
                worker.setBackground(new Color(102, 255, 51));
                worker.setLayout(new BorderLayout(30, 30));

                //======== imgWorker ========
                {
                    imgWorker.setLayout(new BorderLayout());
                }
                worker.add(imgWorker, BorderLayout.WEST);

                //======== informationWorker ========
                {
                    informationWorker.setLayout(new BorderLayout());
                }
                worker.add(informationWorker, BorderLayout.EAST);
            }
            workers.add(worker, BorderLayout.CENTER);
        }
        contentPane.add(workers, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JMenuBar menuBar1;
    private JMenu statistic;
    private JMenu schedule;
    private JMenu profit;
    private JPanel hSpacer1;
    private JLabel nameUser;
    private JPanel workers;
    private JPanel worker;
    private JPanel imgWorker;
    private JPanel informationWorker;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
