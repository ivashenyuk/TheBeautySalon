package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Receive.ReceiveDataProfit;
import co.gui_swing.ui.view.Profit.ProfitWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ProfitController {
    private ProfitWindow profitWindow;
    private JTable tableProfit;
    private ArrayList<DataProfitLine> listProfit = new ArrayList<DataProfitLine>();

    public ProfitController() {
        this.profitWindow = new ProfitWindow();
        this.tableProfit = this.profitWindow.getTableProfit();
        listProfit = new ReceiveDataProfit().getListProfit();
        DefaultTableModel model = (DefaultTableModel) this.tableProfit.getModel();

        for (DataProfitLine newLine : listProfit) {
            model.addRow(new Object[]{newLine.getName(), newLine.getProfitForSalon(), newLine.getSalary()});
        }



        this.tableProfit.setPreferredSize(new Dimension(225, model.getRowCount() * 16));


        this.profitWindow.SHOW();
    }
}
