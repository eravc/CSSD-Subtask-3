/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fields;

import Crops.Crop;
import Users.Farmer;
import java.io.Serializable;

/**
 *
 * @author Eranga
 */
public class Field implements Serializable {

    private int fieldID;
    private double latitude;
    private double lontitude;
    private Farmer owner;
    private String location;
    private Crop crop;

    /***
     * 
     */
    public Field() {
    }

    /**
     * *
     *
     * @param fieldID
     * @param latitude
     * @param lontitude
     * @param owner
     * @param location
     * @param crop
     */
    public Field(int fieldID, double latitude, double lontitude, String location, Farmer owner, Crop crop) {
        this.fieldID = fieldID;
        this.latitude = latitude;
        this.lontitude = lontitude;
        this.owner = owner;
        this.location = location;
        this.crop = crop;
    }

    /**
     * @return the fieldID
     */
    public int getFieldID() {
        return fieldID;
    }

    /**
     * @param fieldID the fieldID to set
     */
    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the lontitude
     */
    public double getLontitude() {
        return lontitude;
    }

    /**
     * @param lontitude the lontitude to set
     */
    public void setLontitude(double lontitude) {
        this.lontitude = lontitude;
    }

    /**
     * @return the owner
     */
    public Farmer getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Farmer owner) {
        this.owner = owner;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the crop
     */
    public Crop getCrop() {
        return crop;
    }

    /**
     * @param crop the crop to set
     */
    public void setCrop(Crop crop) {
        this.crop = crop;
    }

}
