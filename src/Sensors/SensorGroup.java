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

    public SensorGroup(int groupId, String groupName,String category, int count) {
        this.SensorGroupId = groupId;
        this.groupName = groupName;
        this.category = category;
        this.count = count;
    }

    public void addSensorsToGroup(Sensors sen) {
        getSet().add(sen);
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
    public SetOfSensors getSet() {
        return set;
    }

    /**
     * @param set the set to set
     */
    public void setSet(SetOfSensors set) {
        this.set = set;
    }

    /**
     * @return the SensorGroupId
     */
    public int getSensorGroupId() {
        return SensorGroupId;
    }
}
