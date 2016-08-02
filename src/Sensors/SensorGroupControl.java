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
public class SensorGroupControl extends Vector<SensorGroup> implements Serializable{
    
  
    
    public  void serialize() throws IOException {
        Serialization.serialize(this, "SensorGropControl.txt");
    }
    
    public  void deserialize() throws IOException, ClassNotFoundException {
        this.addAll(Serialization.deSerialize("SensorGropControl.txt"));
    }
    
    public SensorGroupControl(){
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
    
    public void remove(SensorGroup sen){
        super.remove(sen);
    }
}
