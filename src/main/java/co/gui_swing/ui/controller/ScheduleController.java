package co.gui_swing.ui.controller;

import co.gui_swing.ui.model.Data.DataProfitLine;
import co.gui_swing.ui.model.Data.DataScheduleLine;
import co.gui_swing.ui.model.Receive.ReceiveDataSchedule;
import co.gui_swing.ui.view.schedule.ScheduleWindow;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ScheduleController {
    private ScheduleWindow scheduleWindow;
    private ArrayList<DataScheduleLine> listSchedule;
    private JTable jTable;

    public ScheduleController() {
        this.scheduleWindow = new ScheduleWindow();
        this.jTable = this.scheduleWindow.getTable1();
        this.listSchedule = new ReceiveDataSchedule().getListSchedule();
        DefaultTableModel model = (DefaultTableModel) this.jTable.getModel();

        for (DataScheduleLine newLine : listSchedule) {
            model.addRow(new Object[]{newLine.get_services(), newLine.get_workers(), newLine.get_timeWork()});
        }
        this.scheduleWindow.SHOW();
    }
}
