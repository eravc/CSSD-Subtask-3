/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import Users.Farmer;
import serialization.Serialization;
import java.io.Serializable;
import java.util.Vector;
import java.io.IOException;

/**
 *
 * @author Eranga
 */
public class SetOfSensors extends Vector<Sensors> implements Serializable  {
    
    private Vector<AirTemperatureSensor> setOfAirTemperatureSensor = new Vector<AirTemperatureSensor>();
    private Vector<CropMoistureSensor> setOfCropMoistureSensor = new Vector<CropMoistureSensor>();
    private Vector<LightSensor> setOfLightSensor = new Vector<LightSensor>();
    private Vector<SoilAciditySensor> setOfSoilAciditySensor = new Vector<SoilAciditySensor>();
    private Vector<SoilTemperatureSensor> setOfSoilTemperatureSensor = new Vector<SoilTemperatureSensor>();
    private Vector<RainfallSensor> setOfRainfallSensor = new Vector<RainfallSensor>();
    private Vector<WindSensor> setOfWindSensor = new Vector<WindSensor>();
    
    public void serialize() throws IOException {
        Serialization.serialize(setOfAirTemperatureSensor, "AirTempSensors.txt");
        Serialization.serialize(setOfCropMoistureSensor, "CropMoisSensors.txt");
        Serialization.serialize(setOfLightSensor, "LightSensors.txt");
        Serialization.serialize(setOfSoilAciditySensor, "SoilAcidSensor.txt");
        Serialization.serialize(setOfSoilTemperatureSensor, "SoilTempSensor.txt");
        Serialization.serialize(setOfRainfallSensor, "RainFallSensor.txt");
        Serialization.serialize(setOfWindSensor, "WindSensor.txt");
    }
    
    public void deserialize() throws IOException, ClassNotFoundException {
        setOfAirTemperatureSensor = (Vector<AirTemperatureSensor>) Serialization.deSerialize("AirTempSensors.txt");
        setOfCropMoistureSensor = (Vector<CropMoistureSensor>) Serialization.deSerialize("CropMoisSensors.txt");
        setOfLightSensor = (Vector<LightSensor>) Serialization.deSerialize("LightSensors.txt");
        setOfSoilAciditySensor = (Vector<SoilAciditySensor>) Serialization.deSerialize("SoilAcidSensor.txt");
        setOfSoilTemperatureSensor = (Vector<SoilTemperatureSensor>) Serialization.deSerialize("SoilTempSensor.txt");
        setOfRainfallSensor = (Vector<RainfallSensor>) Serialization.deSerialize("RainFallSensor.txt");
        setOfWindSensor = (Vector<WindSensor>) Serialization.deSerialize("WindSensor.txt");    
    }
    
    public void addAirTemperatureSensor(AirTemperatureSensor ats) {
        setOfAirTemperatureSensor.add(ats);
    }

    public void addCropMoistureSensor(CropMoistureSensor cms) {
        setOfCropMoistureSensor.add(cms);
    }
    
    public void addLightSensor(LightSensor ls) {
        setOfLightSensor.add(ls);
    }

    public void addSoilAciditySensor(SoilAciditySensor sas) {
        setOfSoilAciditySensor.add(sas);
    }
    
    public void addSoilTemperatureSensor(SoilTemperatureSensor sts) {
        setOfSoilTemperatureSensor.add(sts);
    }

    public void addRainfallSensor(RainfallSensor rfs) {
        setOfRainfallSensor.add(rfs);
    }
    
    public void addWindSensor(WindSensor ws) {
        setOfWindSensor.add(ws);
    }
    //--------------------------------------------------------
    public Vector getAirTemperatureSensor(){
        return setOfAirTemperatureSensor;
    }
    
    public  Vector getCropMoistureSensor(){
        return setOfCropMoistureSensor;
    }
    
    public  Vector getLightSensor(){
        return setOfLightSensor;
    }
    
    public  Vector getSoilAciditySensor(){
        return setOfSoilAciditySensor;
    }
    
    public  Vector getSoilTemperatureSensor(){
        return setOfSoilTemperatureSensor;
    }
    
    public  Vector getRainfallSensor(){
        return setOfRainfallSensor;
    }
    
    public  Vector getWindSensor(){
        return setOfWindSensor;
    }
    
    //-----------------------------------------------------------
    
    public AirTemperatureSensor getAirTemperatureSensorById(int id){
        AirTemperatureSensor ats = null;
        
        for(AirTemperatureSensor item: setOfAirTemperatureSensor){
            if(item.getSensorID() == id){
              ats = item; 
            }
        }
        return ats;
    }
    public CropMoistureSensor getCropMoistureSensorById(int id){
        CropMoistureSensor cms = null;
        
        for(CropMoistureSensor item: setOfCropMoistureSensor){
            if(item.getSensorID() == id){
              cms = item; 
            }
        }
        return cms;
    }
    public LightSensor getLightSensorById(int id){
        LightSensor ls = null;
        
        for(LightSensor item: setOfLightSensor){
            if(item.getSensorID() == id){
              ls = item; 
            }
        }
        return ls;
    }
    public SoilAciditySensor getSoilAciditySensorById(int id){
        SoilAciditySensor sas = null;
        
        for(SoilAciditySensor item: setOfSoilAciditySensor){
            if(item.getSensorID() == id){
              sas = item; 
            }
        }
        return sas;
    }
    public SoilTemperatureSensor getSoilTemperatureSensorById(int id){
        SoilTemperatureSensor sts = null;
        
        for(SoilTemperatureSensor item: setOfSoilTemperatureSensor){
            if(item.getSensorID() == id){
              sts = item; 
            }
        }
        return sts;
    }
    public RainfallSensor getRainfallSensorById(int id){
        RainfallSensor rfs = null;
        
        for(RainfallSensor item: setOfRainfallSensor){
            if(item.getSensorID() == id){
              rfs = item; 
            }
        }
        return rfs;
    }
    public WindSensor getWindSensorById(int id){
        WindSensor ws = null;
        
        for(WindSensor item: setOfWindSensor){
            if(item.getSensorID() == id){
              ws = item; 
            }
        }
        return ws;
    }
    
    //-------------------------------------------------------------------------
    
    public  void removeAirTemperatureSensor(Sensors sen){
        setOfAirTemperatureSensor.removeElement(sen);
    }
    
    public  void removeCropMoistureSensor(Sensors sen){
        setOfCropMoistureSensor.removeElement(sen);
    }
    
    public  void removeLightSensor(Sensors sen){
        setOfLightSensor.removeElement(sen);
    }
    public  void removeRainfallSensor(Sensors sen){
        setOfRainfallSensor.removeElement(sen);
    }
    public  void removeSoilAciditySensor(Sensors sen){
        setOfSoilAciditySensor.removeElement(sen);
    }
    public  void removeSoilTemperatureSensor(Sensors sen){
        setOfSoilTemperatureSensor.removeElement(sen);
    }
    public  void removeWindSensor(Sensors sen){
        setOfWindSensor.removeElement(sen);
    }
}
