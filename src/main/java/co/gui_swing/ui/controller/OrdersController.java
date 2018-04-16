package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataOrderLine;
import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Receive.ReceiveDataOrders;
import co.gui_swing.ui.model.Receive.ReceiveDataProfit;
import co.gui_swing.ui.view.OrdersWindow.OrdersWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class OrdersController {
    private OrdersWindow ordersWindow;
    private JTable ordersTable;
    private ArrayList<DataOrderLine> listOrders = new ArrayList<DataOrderLine>();

    public OrdersController() {
        initComponents();
    }

    private void initComponents() {
        this.ordersWindow = new OrdersWindow();

        this.ordersTable = this.ordersWindow.getOrdersTable();
        listOrders = new ReceiveDataOrders().getListOrders();
        DefaultTableModel model = (DefaultTableModel) this.ordersTable.getModel();

        for (DataOrderLine newLine : listOrders) {
            model.addRow(
                    new Object[]
                            {
                                    newLine.get_id(),
                                    newLine.get_customer(),
                                    newLine.get_serveice(),
                                    newLine.get_price(),
                                    newLine.get_email(),
                                    newLine.get_date(),
                                    newLine.get_performer(),
                                    newLine.get_discount()
                            });
        }

        this.ordersTable.setPreferredSize(new Dimension(225, model.getRowCount() * 16));
        this.ordersWindow.show();
    }
}
