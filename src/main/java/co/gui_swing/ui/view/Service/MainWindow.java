/*
 * Created by JFormDesigner on Fri Mar 30 18:18:39 EEST 2018
 */

package co.gui_swing.ui.view.Service;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

import co.gui_swing.ui.view.Check.CheckWindow;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Ivashenuik Yurii
 */
public class MainWindow extends JFrame {

    public MainWindow() {
        initComponents();
    }

    private void thisComponentResized(ComponentEvent e) {
        // TODO add your code here
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
        scrollPaneWorkers = new JScrollPane();
        workersPanel = new JPanel();



        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u0421\u0430\u043b\u043e\u043d \u043a\u0440\u0430\u0441\u0438");
        setMinimumSize(new Dimension(850, 300));
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                thisComponentResized(e);
            }
        });
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

        //======== scrollPaneWorkers ========
        {
            scrollPaneWorkers.setMinimumSize(new Dimension(23, 9000));
            scrollPaneWorkers.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPaneWorkers.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPaneWorkers.setPreferredSize(new Dimension(685, 9500));
            scrollPaneWorkers.setAutoscrolls(true);

            //======== workersPanel ========
            {
                workersPanel.setMinimumSize(new Dimension(100, 400));
                workersPanel.setPreferredSize(new Dimension(666, 880));
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

                createWorkers();
                createWorkers();
                for (JPanel worker : listWorkers) {
                    workersPanel.add(worker);
                }

            }
            scrollPaneWorkers.setViewportView(workersPanel);
        }
        contentPane.add(scrollPaneWorkers, BorderLayout.CENTER);
        setSize(765, 880);
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
    private JScrollPane scrollPaneWorkers;
    private JPanel workersPanel;


    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private ArrayList<JPanel> listWorkers = new ArrayList<JPanel>();
    private ArrayList<JButton> listBtnOrder = new ArrayList<JButton>();
    public static Image getImage(String name) {
        String filename = "E://" + name;
        Image gras = Toolkit.getDefaultToolkit().getImage(filename);
        return gras;
    }

    private void createWorkers() {
        JPanel workerPanel = new JPanel();
        JPanel borderPanel = new JPanel();
        JPanel imgWorker = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("img.jpg"), 0,0,200,200,this);
            }
        };
        JPanel informationWorker = new JPanel();
        JLabel nameLabel = new JLabel();
        JLabel label1 = new JLabel();
        JLabel kingOfServiceLable = new JLabel();
        JLabel label2 = new JLabel();
        JLabel priceLabel = new JLabel();
        JButton orderBtn = new JButton();
        orderBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckWindow().SHOW();
            }
        });
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
                    nameLabel.setText("Ivashenuik Yurii Olexandrovich");
                    nameLabel.setFont(nameLabel.getFont().deriveFont(nameLabel.getFont().getStyle() | Font.BOLD, nameLabel.getFont().getSize() + 8f));

                    //---- label1 ----
                    label1.setText("\u0412\u0438\u0434 \u043f\u043e\u0441\u043b\u0443\u0433:");
                    label1.setFont(new Font("Tahoma", Font.PLAIN, 16));

                    //---- kingOfServiceLable ----
                    kingOfServiceLable.setText("\u041c\u0430\u0441\u0430\u0436");
                    kingOfServiceLable.setFont(new Font("Tahoma", Font.ITALIC, 16));

                    //---- label2 ----
                    label2.setText("\u0426\u0456\u043d\u0430: ");
                    label2.setFont(new Font("Tahoma", Font.PLAIN, 16));

                    //---- priceLabel ----
                    priceLabel.setText("100$");
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
}
