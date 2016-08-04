/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crops;

import java.io.Serializable;

/**
 *
 * @author Eranga
 */
public class Crop implements Serializable {

    private int cropID;
    private String name;
    private double approxSpace;

    public Crop(int id, String nm, double spc) {
        cropID = id;
        name = nm;
        approxSpace = spc;

    }

    public Crop() {
    }

    /**
     * @return the cropID
     */
    public int getCropID() {
        return cropID;
    }

    /**
     * @param cropID the cropID to set
     */
    public void setCropID(int cropID) {
        this.cropID = cropID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name name of the 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the approxSpace
     */
    public double getApproxSpace() {
        return approxSpace;
    }

    
    /**
     * 
     * @param approxSpace Approximate space for a crop
     */
    public void setApproxSpace(double approxSpace) {
        this.approxSpace = approxSpace;
    }

}
