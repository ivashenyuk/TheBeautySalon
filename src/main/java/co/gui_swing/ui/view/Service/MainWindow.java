/*
 * Created by JFormDesigner on Fri Mar 30 18:18:39 EEST 2018
 */

package co.gui_swing.ui.view.Service;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

import co.gui_swing.ui.model.Data.DataUser;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Ivashenuik Yurii
 */
public class MainWindow extends JFrame {

    public static int MAXHEIGHTWINDOW = 200;
    public static DataUser dataUser;
    private ArrayList<JPanel> listWorkers = new ArrayList<JPanel>();
    private ArrayList<JButton> listBtnOrder = new ArrayList<JButton>();

    public MainWindow() {
        initComponents();
    }

    public JPanel getWorkersPanel() {
        return workersPanel;
    }

    public JMenu getSchedule() {
        return schedule;
    }

    public JMenu getProfit() {
        return profit;
    }

    public JMenuItem getExit() {
        return exit;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
        menuBar1 = new JMenuBar();
        file = new JMenu();
        changeAcount = new JMenuItem();
        exit = new JMenuItem();
        schedule = new JMenu();
        profit = new JMenu();
        hSpacer1 = new JPanel(null);
        nameUser = new JLabel();
        scrollPaneWorkers = new JScrollPane();
        workersPanel = new JPanel();
        workerPanel = new JPanel();
        borderPanel = new JPanel();
        imgWorker = new JPanel();
        informationWorker = new JPanel();
        nameLabel = new JLabel();
        label1 = new JLabel();
        kingOfServiceLable = new JLabel();
        label2 = new JLabel();
        priceLabel = new JLabel();
        orderBtn = new JButton();
        openProfit = new openProfitWindow();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u0421\u0430\u043b\u043e\u043d \u043a\u0440\u0430\u0441\u0438");
        setMinimumSize(new Dimension(850, 300));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(5, 5));

        //======== menuBar1 ========
        {

            //======== file ========
            {
                file.setText("\u0424\u0430\u0439\u043b");

                //---- changeAcount ----
                changeAcount.setText("\u0417\u043c\u0456\u043d\u0438\u0442\u0438 \u043a\u043e\u0440\u0438\u0441\u0442\u0443\u0432\u0430\u0447\u0430\u0430");
                file.add(changeAcount);

                //---- exit ----
                exit.setText("\u0412\u0438\u0445\u0456\u0434");
                file.add(exit);
            }
            menuBar1.add(file);

            //======== schedule ========
            {
                schedule.setText("\u0420\u043e\u0431\u043e\u0447\u0438\u0439 \u0440\u043e\u0437\u043a\u043b\u0430\u0434");
            }
            menuBar1.add(schedule);

            //======== profit ========
            {
                profit.setAction(openProfit);
            }
            if(dataUser.getStatusUser().equals("admin") || dataUser.getStatusUser().equals("administrator"))
            menuBar1.add(profit);
            menuBar1.add(hSpacer1);

            //---- nameUser ----
            nameUser.setText(dataUser.nameUser);
            menuBar1.add(nameUser);
        }
        setJMenuBar(menuBar1);

            //======== scrollPaneWorkers ========
            {
                scrollPaneWorkers.setMinimumSize(new Dimension(23, 250));
                scrollPaneWorkers.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPaneWorkers.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPaneWorkers.setPreferredSize(new Dimension(685, 300));
                scrollPaneWorkers.setAutoscrolls(true);

                //======== workersPanel ========
                {
                    workersPanel.setMinimumSize(new Dimension(100, 200));
                    workersPanel.setPreferredSize(new Dimension(666, MAXHEIGHTWINDOW));
                    workersPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
                    workersPanel.setInheritsPopupMenu(true);

                    // JFormDesigner evaluation mark
                    workersPanel.setBorder(new javax.swing.border.CompoundBorder(
                            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                                    java.awt.Color.red), workersPanel.getBorder()));
                    workersPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent e) {
                            if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                        }
                    });
                    workersPanel.setLayout(new BoxLayout(workersPanel, BoxLayout.Y_AXIS));

                }
                scrollPaneWorkers.setViewportView(workersPanel);
            }
            scrollPaneWorkers.setViewportView(workersPanel);
        contentPane.add(scrollPaneWorkers, BorderLayout.CENTER);
        setSize(765, 500);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
    private JMenuBar menuBar1;
    private JMenu file;
    private JMenuItem changeAcount;
    private JMenuItem exit;
    private JMenu schedule;
    private JMenu profit;
    private JPanel hSpacer1;
    private JLabel nameUser;
    private JScrollPane scrollPaneWorkers;
    private JPanel workersPanel;
    private JPanel workerPanel;
    private JPanel borderPanel;
    private JPanel imgWorker;
    private JPanel informationWorker;
    private JLabel nameLabel;
    private JLabel label1;
    private JLabel kingOfServiceLable;
    private JLabel label2;
    private JLabel priceLabel;
    private JButton orderBtn;
    private openProfitWindow openProfit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void createWorkers(final Image img, String nameWorker, String price, String kingOfService) {
        JPanel workerPanel = new JPanel();
        JPanel borderPanel = new JPanel();
        JPanel imgWorker = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(img, 0, 0, 200, 200, this);
            }
        };
        JPanel informationWorker = new JPanel();
        JLabel nameLabel = new JLabel();
        JLabel label1 = new JLabel();
        JLabel kingOfServiceLable = new JLabel();
        JLabel label2 = new JLabel();
        JLabel priceLabel = new JLabel();
        JButton orderBtn = new JButton();

        //======== workerPanel ========
        {
            workerPanel.setMaximumSize(new Dimension(2147483647, 200));
            workerPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            workerPanel.setMinimumSize(new Dimension(326, 200));
            workerPanel.setPreferredSize(new Dimension(650, 200));
            workerPanel.setOpaque(false);
            workerPanel.setLayout(new BoxLayout(workerPanel, BoxLayout.X_AXIS));

            //======== borderPanel ========
            {
                borderPanel.setBorder(LineBorder.createBlackLineBorder());
                borderPanel.setLayout(new BoxLayout(borderPanel, BoxLayout.X_AXIS));

                //======== imgWorker ========
                {
                    imgWorker.setBackground(new Color(51, 255, 153));
                    imgWorker.setMinimumSize(new Dimension(200, 200));
                    imgWorker.setPreferredSize(new Dimension(200, 200));
                    imgWorker.setMaximumSize(new Dimension(200, 200));
                    imgWorker.setLayout(new BorderLayout());
                }
                borderPanel.add(imgWorker);

                //======== informationWorker ========
                {
                    informationWorker.setPreferredSize(new Dimension(500, 0));

                    //---- nameLabel ----
                    nameLabel.setText(nameWorker);
                    nameLabel.setFont(nameLabel.getFont().deriveFont(nameLabel.getFont().getStyle() | Font.BOLD, nameLabel.getFont().getSize() + 8f));

                    //---- label1 ----
                    label1.setText("\u0412\u0438\u0434 \u043f\u043e\u0441\u043b\u0443\u0433:");
                    label1.setFont(new Font("Tahoma", Font.PLAIN, 16));

                    //---- kingOfServiceLable ----
                    kingOfServiceLable.setText(kingOfService);
                    kingOfServiceLable.setFont(new Font("Tahoma", Font.ITALIC, 16));

                    //---- label2 ----
                    label2.setText("\u0426\u0456\u043d\u0430: ");
                    label2.setFont(new Font("Tahoma", Font.PLAIN, 16));

                    //---- priceLabel ----
                    priceLabel.setText(price);
                    priceLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));

                    //---- orderBtn ----
                    orderBtn.setText("\u0417\u0430\u043c\u043e\u0432\u043e\u0442\u0438");
                    orderBtn.setPreferredSize(new Dimension(80, 25));
                    orderBtn.setMaximumSize(new Dimension(80, 25));
                    orderBtn.setMinimumSize(new Dimension(80, 25));
                    orderBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));

                    GroupLayout informationWorkerLayout = new GroupLayout(informationWorker);
                    informationWorker.setLayout(informationWorkerLayout);
                    informationWorkerLayout.setHorizontalGroup(
                            informationWorkerLayout.createParallelGroup()
                                    .add(informationWorkerLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .add(informationWorkerLayout.createParallelGroup()
                                                    .add(informationWorkerLayout.createSequentialGroup()
                                                            .add(label1)
                                                            .add(18, 18, 18)
                                                            .add(kingOfServiceLable, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))
                                                    .add(informationWorkerLayout.createSequentialGroup()
                                                            .add(label2)
                                                            .addPreferredGap(LayoutStyle.UNRELATED)
                                                            .add(priceLabel))
                                                    .add(nameLabel))
                                            .addContainerGap(33, Short.MAX_VALUE))
                                    .add(GroupLayout.TRAILING, informationWorkerLayout.createSequentialGroup()
                                            .addContainerGap(409, Short.MAX_VALUE)
                                            .add(orderBtn, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap())
                    );
                    informationWorkerLayout.setVerticalGroup(
                            informationWorkerLayout.createParallelGroup()
                                    .add(informationWorkerLayout.createSequentialGroup()
                                            .add(nameLabel)
                                            .addPreferredGap(LayoutStyle.RELATED)
                                            .add(informationWorkerLayout.createParallelGroup(GroupLayout.BASELINE)
                                                    .add(kingOfServiceLable, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                    .add(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.RELATED)
                                            .add(informationWorkerLayout.createParallelGroup(GroupLayout.BASELINE)
                                                    .add(label2)
                                                    .add(priceLabel))
                                            .addPreferredGap(LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                                            .add(orderBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap())
                    );
                }
                borderPanel.add(informationWorker);
            }
            workerPanel.add(borderPanel);
        }
        listWorkers.add(workerPanel);
        listBtnOrder.add(orderBtn);
    }

    private class openProfitWindow extends AbstractAction {
        private openProfitWindow() {
            // JFormDesigner - Action initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - Ivashenuik Yurii
            putValue(NAME, "\u041f\u0440\u0438\u0431\u0443\u0442\u043e\u043a");
            putValue(ACTION_COMMAND_KEY, "x");
            // JFormDesigner - End of action initialization  //GEN-END:initComponents
        }

        public void actionPerformed(ActionEvent e) {
            // TODO add your code here
        }
    }

    //-------------------------- Getters ------------------------------
    public ArrayList<JPanel> getListWorkers() {
        return listWorkers;
    }

    public ArrayList<JButton> getListBtnOrder() {
        return listBtnOrder;
    }

    public JMenuItem getChangeAcount() {
        return changeAcount;
    }
}
