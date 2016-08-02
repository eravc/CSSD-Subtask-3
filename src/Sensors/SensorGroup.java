/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eranga
 */
public class SensorGroup implements Serializable {

    private int SensorGroupId;
    private String groupName;
    private String category;
    private int count;
    private SetOfSensors set = null;
    
    public SensorGroup(){
    }

    public SensorGroup(int groupId, String groupName,String category, int count, SetOfSensors sos) {
        this.SensorGroupId = groupId;
        this.groupName = groupName;
        this.category = category;
        this.count = count;
        this.set = sos;
    }
    
    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @param SensorGroupId the SensorGroupId to set
     */
    public void setSensorGroupId(int SensorGroupId) {
        this.SensorGroupId = SensorGroupId;
    }

    /**
     * @return the set
     */
    public SetOfSensors getSensorSet() {
        return set;
    }

    /**
     * @param set the set to set
     */
    public void setSensorSet(SetOfSensors set) {
        this.set = set;
    }

    /**
     * @return the SensorGroupId
     */
    public int getSensorGroupId() {
        return SensorGroupId;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}
