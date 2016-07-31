/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Aklive
 */
class Sensors implements Serializable {
    private static int sensorID;
    private String name;
    private String purpose;
    private int interval;
    private Date date; 

    public Sensors(String name, String purpose, int interval, Date date) {
        this.name = name;
        this.purpose = purpose;
        this.interval = interval;
        this.date = date;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    private void writeObject(ObjectOutputStream oos)throws IOException{
        oos.defaultWriteObject();
        oos.writeObject(sensorID);
    }

    private void readObject(ObjectInputStream ois)throws ClassNotFoundException, IOException{
        ois.defaultReadObject();
        sensorID = (Integer)ois.readObject();
    }
    
}
