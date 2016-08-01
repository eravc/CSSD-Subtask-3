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
public class SoilAciditySensor extends Sensors{
    private double acidityLevel;

    public SoilAciditySensor(int id, String purpose, String model, String brand) {
        super(id, purpose, model, brand);
    }

    /**
     * @return the acidityLevel
     */
    public double getAcidityLevel() {
        return acidityLevel;
    }

    /**
     * @param acidityLevel the acidityLevel to set
     */
    public void setAcidityLevel(double acidityLevel) {
        this.acidityLevel = acidityLevel;
    }
}
