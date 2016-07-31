/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import serialization.Serialization;

/**
 *
 * @author Eranga
 */
public class SensorGropControl extends Vector<SensorGroup> implements Serializable{
    
    private static Vector<SensorGroup> SensorGropControl = new Vector<SensorGroup>();
    
    public static void serialize() throws IOException {
        Serialization.serialize(SensorGropControl, "SensorGropControl.txt");
    }
    
    public static void deserialize() throws IOException, ClassNotFoundException {
        SensorGropControl = (Vector<SensorGroup>) Serialization.deSerialize("SensorGropControl.txt");
    }
    
    public SensorGropControl(){
        super();
    }
    
    public void addSensorGroup(SensorGroup sen){
        super.add(sen);
    }
    
    public SensorGroup findSensorGroupById(int id){
        SensorGroup group = null;
        
        for (SensorGroup item:this){
            if(item.getSensorGroupId() == id){
                group = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return group;
    }
}
