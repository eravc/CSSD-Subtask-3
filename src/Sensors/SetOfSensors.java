/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import serialization.Serialization;
import java.io.Serializable;
import java.util.Vector;
import java.io.IOException;

/**
 *
 * @author Eranga
 */
public class SetOfSensors extends Vector<Sensors> implements Serializable  {
    
    private static Vector<AirTemperatureSensor> setOfAirTemperatureSensor = new Vector<AirTemperatureSensor>();
    private static Vector<CropMoistureSensor> setOfCropMoistureSensor = new Vector<CropMoistureSensor>();
    private static Vector<LightSensor> setOfLightSensor = new Vector<LightSensor>();
    private static Vector<SoilAciditySensor> setOfSoilAciditySensor = new Vector<SoilAciditySensor>();
    private static Vector<SoilTemperatureSensor> setOfSoilTemperatureSensor = new Vector<SoilTemperatureSensor>();
    private static Vector<RainfallSensor> setOfRainfallSensor = new Vector<RainfallSensor>();
    private static Vector<WindSensor> setOfWindSensor = new Vector<WindSensor>();
    
    public static void serialize() throws IOException {
        Serialization.serialize(setOfAirTemperatureSensor, "AirTempSensors.txt");
        Serialization.serialize(setOfCropMoistureSensor, "CropMoisSensors.txt");
        Serialization.serialize(setOfLightSensor, "LightSensors.txt");
        Serialization.serialize(setOfSoilAciditySensor, "SoilAcidSensor.txt");
        Serialization.serialize(setOfSoilTemperatureSensor, "SoilTempSensor.txt");
        Serialization.serialize(setOfRainfallSensor, "RainFallSensor.txt");
        Serialization.serialize(setOfWindSensor, "WindSensor.txt");
    }
    
    public static void deserialize() throws IOException, ClassNotFoundException {
        setOfAirTemperatureSensor = (Vector<AirTemperatureSensor>) Serialization.deSerialize("AirTempSensors.txt");
        setOfCropMoistureSensor = (Vector<CropMoistureSensor>) Serialization.deSerialize("CropMoisSensors.txt");
        setOfLightSensor = (Vector<LightSensor>) Serialization.deSerialize("LightSensors.txt");
        setOfSoilAciditySensor = (Vector<SoilAciditySensor>) Serialization.deSerialize("SoilAcidSensor.txt");
        setOfSoilTemperatureSensor = (Vector<SoilTemperatureSensor>) Serialization.deSerialize("SoilTempSensor.txt");
        setOfRainfallSensor = (Vector<RainfallSensor>) Serialization.deSerialize("RainFallSensor.txt");
        setOfWindSensor = (Vector<WindSensor>) Serialization.deSerialize("WindSensor.txt");    
    }
    
    public static void addAirTemperatureSensor(AirTemperatureSensor ats) {
        setOfAirTemperatureSensor.add(ats);
    }

    public static void addCropMoistureSensor(CropMoistureSensor cms) {
        setOfCropMoistureSensor.add(cms);
    }
    
    public static void addLightSensor(LightSensor ls) {
        setOfLightSensor.add(ls);
    }

    public static void addSoilAciditySensor(SoilAciditySensor sas) {
        setOfSoilAciditySensor.add(sas);
    }
    
    public static void addSoilTemperatureSensor(SoilTemperatureSensor sts) {
        setOfSoilTemperatureSensor.add(sts);
    }

    public static void addRainfallSensor(RainfallSensor rfs) {
        setOfRainfallSensor.add(rfs);
    }
    
    public static void addWindSensor(WindSensor ws) {
        setOfWindSensor.add(ws);
    }
    //--------------------------------------------------------
    public static Vector getAirTemperatureSensor(){
        return setOfAirTemperatureSensor;
    }
    
    public static Vector getCropMoistureSensor(){
        return setOfCropMoistureSensor;
    }
    
    public static Vector getLightSensor(){
        return setOfLightSensor;
    }
    
    public static Vector getSoilAciditySensor(){
        return setOfSoilAciditySensor;
    }
    
    public static Vector getSoilTemperatureSensor(){
        return setOfSoilTemperatureSensor;
    }
    
    public static Vector getRainfallSensor(){
        return setOfRainfallSensor;
    }
    
    public static Vector getWindSensor(){
        return setOfWindSensor;
    }
}
