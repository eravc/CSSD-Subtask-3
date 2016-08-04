/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Vector;
import serialization.Serialization;

/**
 *
 * @author Eranga
 */
public class SetOfSensorDataReport extends Vector<SensorDataReport> implements Serializable {
    
    public  void serialize() throws IOException {
        Serialization.serialize(this, "SensorDataReport.txt");
    }
    
    public  void deserialize() throws IOException, ClassNotFoundException {
        this.addAll(Serialization.deSerialize("SensorDataReport.txt"));
    }
    
    public SetOfSensorDataReport(){
        super();
    }
    
    public void addSensorDataReport(SensorDataReport sdr){
        super.add(sdr);
    }
    
    public SensorDataReport findSensorDataReportById(int id){
        SensorDataReport report = null;
        
        for (SensorDataReport item:this){
            if(item.getReportId() == id){
                report = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return report;
    }
    
    public SensorDataReport findSensorDataReportByDate(String date){
        SensorDataReport report = null;
        
        for (SensorDataReport item:this){
            if(item.getDate().equalsIgnoreCase(date)){
                report = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return report;
    }
    
    public SensorDataReport findSensorDataReportByFieldStation(int id){
        SensorDataReport report = null;
        
        for (SensorDataReport item:this){
            if(item.getFieldstationId() == id){
                report = item;
                //System.out.println("Author " + authName + "Found.");
            }
        }
        return report;
    }
    
    public void removeSensorDataReport(SensorDataReport sdr){
        super.remove(sdr);
    }
}
