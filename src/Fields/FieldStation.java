
package Fields;
import java.io.Serializable;


public class FieldStation implements Serializable{
 
 private int fieldStationID;
 private Field field;
 private int userID;
private String name;
private String location;
private double longtitude;
private double latitude;

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
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
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
     * @return the longtitude
     */
    public double getLongtitude() {
        return longtitude;
    }

    /**
     * @param longtitude the longtitude to set
     */
    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
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
     * @return the fieldStationID
     */
 
 
    
}
