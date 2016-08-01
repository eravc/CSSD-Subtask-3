/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Aklive
 */
public class CropMoistureSensor extends Sensors{
    private double moistureLevel;
    private Time time;

    public CropMoistureSensor(int id, String purpose, String model, String brand) {
        super(id, purpose, model, brand);
    }

    /**
     * @return the moistureLevel
     */
    public double getMoistureLevel() {
        return moistureLevel;
    }

    /**
     * @param moistureLevel the moistureLevel to set
     */
    public void setMoistureLevel(double moistureLevel) {
        this.moistureLevel = moistureLevel;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
    }
}
