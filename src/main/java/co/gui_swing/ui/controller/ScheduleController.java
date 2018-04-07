package co.gui_swing.ui.controller;

import co.gui_swing.ui.view.schedule.ScheduleWindow;

public class ScheduleController {
    ScheduleWindow scheduleWindow;
    public ScheduleController() {
        this.scheduleWindow = new ScheduleWindow();

        this.scheduleWindow.SHOW();
    }
}
