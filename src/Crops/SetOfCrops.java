/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crops;

import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import serialization.Serialization;
import Crops.SetOfCrops;

/**
 *
 * @author Eranga
 */
public class SetOfCrops extends Vector<Crop> implements Serializable {

    public void serialize() throws IOException {
        Serialization.serialize(this, "Crop.txt");
    }

    public void deserialize() throws IOException, ClassNotFoundException {
        this.addAll(Serialization.deSerialize("Crop.txt"));
    }

    public SetOfCrops() {
        super();
    }

    public void addCrop(Crop crop) {
        super.add(crop);
    }

    public Crop findCropById(int id) {
        Crop crp = null;

        for (Crop item : this) {
            if (item.getCropID() == id) {
                crp = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return crp;
    }
    
    public Crop findCropByName(String name) {
        Crop crp = null;

        for (Crop item : this) {
            if (item.getName().equalsIgnoreCase(name)) {
                crp = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return crp;
    }

    public void remove(Crop crp) {
        super.remove(crp);
    }

}
