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
public class AirTemperatureSensor extends Sensors {
    private double airTemp;

    public AirTemperatureSensor(int id, String purpose, String model, String brand) {
        super(id, purpose, model, brand);
    }

    /**
     * @return the airTemp
     */
    public double getAirTemp() {
        return airTemp;
    }

    /**
     * @param airTemp the airTemp to set
     */
    public void setAirTemp(double airTemp) {
        this.airTemp = airTemp;
    }
    
}
