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
public class RainfallSensor extends Sensors{
    private double rainFall;
    private Time time;

    public RainfallSensor(String name, String purpose, int interval, Date date) {
        super(name, purpose, interval, date);
    }

    /**
     * @return the rainFall
     */
    public double getRainFall() {
        return rainFall;
    }

    /**
     * @param rainFall the rainFall to set
     */
    public void setRainFall(double rainFall) {
        this.rainFall = rainFall;
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
