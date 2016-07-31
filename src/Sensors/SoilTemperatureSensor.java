/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.util.Date;

/**
 *
 * @author Aklive
 */
public class SoilTemperatureSensor extends Sensors{
    private double soilTemp;

    public SoilTemperatureSensor(String name, String purpose, int interval, Date date) {
        super(name, purpose, interval, date);
    }

    /**
     * @return the soilTemp
     */
    public double getSoilTemp() {
        return soilTemp;
    }

    /**
     * @param soilTemp the soilTemp to set
     */
    public void setSoilTemp(double soilTemp) {
        this.soilTemp = soilTemp;
    }
}
