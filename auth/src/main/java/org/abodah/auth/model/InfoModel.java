package org.abodah.auth.model;

public class InfoModel extends HistoryModel {

    String daysDescription;
    String info7;
    String info30;
    String months;

    public String getDaysDescription() {
        return daysDescription;
    }

    public void setDaysDescription(String daysDescription) {
        this.daysDescription = daysDescription;
    }

    public String getInfo7() {
        return info7;
    }

    public void setInfo7(String info7) {
        this.info7 = info7;
    }

    public String getInfo30() {
        return info30;
    }

    public void setInfo30(String info30) {
        this.info30 = info30;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }
}
