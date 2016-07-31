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
public class LightSensor extends Sensors{
    private double lightIntencity;
    private Time time;

    public LightSensor(String name, String purpose, int interval, Date date) {
        super(name, purpose, interval, date);
    }

    /**
     * @return the lightIntencity
     */
    public double getLightIntencity() {
        return lightIntencity;
    }

    /**
     * @param lightIntencity the lightIntencity to set
     */
    public void setLightIntencity(double lightIntencity) {
        this.lightIntencity = lightIntencity;
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
