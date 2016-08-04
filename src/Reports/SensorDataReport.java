/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Eranga
 */
public class SensorDataReport implements Serializable {
    private int reportId;
    private double currentValue;
    private String unit;
    private String date;
    private String time;
    private int sensorId;
    private int fieldstationId;

    public SensorDataReport() {
    }

    public SensorDataReport(int reportId, double currentValue, String unit, String date, String time, int sensorId, int fieldstationId) {
        this.reportId = reportId;
        this.currentValue = currentValue;
        this.unit = unit;
        this.date = date;
        this.time = time;
        this.sensorId = sensorId;
        this.fieldstationId = fieldstationId;
    }

    /**
     * @return the reportId
     */
    public int getReportId() {
        return reportId;
    }

    /**
     * @param reportId the reportId to set
     */
    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    /**
     * @return the currentValue
     */
    public double getCurrentValue() {
        return currentValue;
    }

    /**
     * @param currentValue the currentValue to set
     */
    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the sensorId
     */
    public int getSensorId() {
        return sensorId;
    }

    /**
     * @param sensorId the sensorId to set
     */
    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    /**
     * @return the fieldstationId
     */
    public int getFieldstationId() {
        return fieldstationId;
    }

    /**
     * @param fieldstationId the fieldstationId to set
     */
    public void setFieldstationId(int fieldstationId) {
        this.fieldstationId = fieldstationId;
    }
    
    
}
