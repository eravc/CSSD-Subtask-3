
package Fields;
import java.io.Serializable;


public class FieldStation implements Serializable{
 
 private int fieldStationID;
 private Field field;
 private Field location;   
 
 

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
     * @return the location
     */
    public Field getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Field location) {
        this.location = location;
    }
 
 
    
}
