package Fields;

import Sensors.SensorGroup;
import Users.Farmer;
import java.io.Serializable;

public class FieldStation implements Serializable {

    private int fieldStationID;
    private String name;
    private String location;
    private String type;
    private Farmer farmer;
    private Field field;
    private SensorGroup group;

    public FieldStation() {
    }

    public FieldStation(int fieldStationID, String name, String location, String type, Farmer farmer, Field field, SensorGroup group) {
        this.fieldStationID = fieldStationID;
        this.name = name;
        this.location = location;
        this.type = type;
        this.farmer = farmer;
        this.field = field;
        this.group = group;
    }

    /**
     * @return the fieldStationID
     */
    public int getFieldStationID() {
        return fieldStationID;
    }

    /**
     * @param fieldStationID the fieldStationID to set
     */
    public void setFieldStationID(int fieldStationID) {
        this.fieldStationID = fieldStationID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the userID
     */
    public Farmer getFarmer() {
        return farmer;
    }

    /**
     * @param userID the userID to set
     */
    public void getFarmer(Farmer userID) {
        this.farmer = userID;
    }

    /**
     * @return the field
     */
    public Field getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(Field field) {
        this.field = field;
    }

    /**
     * @return the group
     */
    public SensorGroup getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(SensorGroup group) {
        this.group = group;
    }

    
}
