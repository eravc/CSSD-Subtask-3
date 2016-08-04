/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fields;

import Sensors.SensorGroup;
import Users.Farmer;


/**
 *
 * @author Eranga
 */
public class PortableFieldstation extends FieldStation {

    public PortableFieldstation(int fieldStationID, String name, String location, String type, Farmer farmer, Field field, SensorGroup group) {
        super(fieldStationID, name, location, type, farmer, field, group);
    }
}
