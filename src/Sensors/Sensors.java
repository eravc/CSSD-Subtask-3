/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Aklive
 */
class Sensors implements Serializable {
    private int sensorID;
    private String purpose;
    private String model;
    private String brand;
    private int interval = 0; 

    public Sensors(int id, String purpose, String model, String brand) {
        this.sensorID = id;
        this.purpose = purpose;
        this.model = model;
        this.brand = brand;
    }
    /**
     * @return the sensorID
     */
    public int getSensorID() {
        return sensorID;
    }

    /**
     * @param sensorID the sensorID to set
     */
    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    /**
     * @return the purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose the purpose to set
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * @return the interval
     */
    public int getInterval() {
        return interval;
    }

    /**
     * @param interval the interval to set
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }  
}
