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
public class WindSensor extends Sensors{
    
    private double windSpeed;
    private Time time;

    public WindSensor(String name, String purpose, int interval, Date date) {
        super(name, purpose, interval, date);
    }

    /**
     * @return the windSpeed
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
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
