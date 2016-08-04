package Fields;

import Users.Farmer;
import Users.Manager;
import java.io.IOException;
import java.io.Serializable;
import serialization.Serialization;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;

public class SetOfFieldStations extends Vector<FieldStation> implements Serializable {

    public static Vector<PermenentFieldstation> setOfPermenentFieldstation = new Vector<PermenentFieldstation>();
    public static Vector<PortableFieldstation> setOfPortableFieldstation = new Vector<PortableFieldstation>();

    public static void serialize() throws IOException {
        Serialization.serialize(setOfPermenentFieldstation, "PermenentFieldstation.txt");
        Serialization.serialize(setOfPortableFieldstation, "PortableFieldstation.txt");
    }

    public static void deSerialize() throws IOException, ClassNotFoundException {
        setOfPermenentFieldstation = (Vector<PermenentFieldstation>) Serialization.deSerialize("PermenentFieldstation.txt");
        setOfPortableFieldstation = (Vector<PortableFieldstation>) Serialization.deSerialize("PortableFieldstation.txt");
    }

    public static void addPermenentFieldstation(PermenentFieldstation pfs) {
        setOfPermenentFieldstation.add(pfs);
    }

    public static void addPortableFieldstation(PortableFieldstation porfs) {
        setOfPortableFieldstation.add(porfs);
    }

    public static Vector<PermenentFieldstation> getAllPermenentFieldstation() {
        return setOfPermenentFieldstation;
    }

    public static Vector<PortableFieldstation> getAllPortableFieldstation() {
        return setOfPortableFieldstation;
    }

    public PermenentFieldstation getPermenentFieldstationByName(String name) {
        PermenentFieldstation pfs = null;

        for (PermenentFieldstation permfs : setOfPermenentFieldstation) {
            if (permfs.getName().equalsIgnoreCase(name)) {
                pfs = permfs;
            }
        }
        return pfs;
    }

    public PortableFieldstation getPortableFieldstationByName(String name) {
        PortableFieldstation mn = null;

        for (PortableFieldstation prfs : setOfPortableFieldstation) {
            if (prfs.getName().equalsIgnoreCase(name)) {
                mn = prfs;
            }
        }
        return mn;
    }
    
    public PermenentFieldstation getPermenentFieldstationById(int id) {
        PermenentFieldstation pfs = null;

        for (PermenentFieldstation permfs : setOfPermenentFieldstation) {
            if (permfs.getFieldStationID() == id) {
                pfs = permfs;
            }
        }
        return pfs;
    }

    public PortableFieldstation getPortableFieldstationById(int id) {
        PortableFieldstation mn = null;

        for (PortableFieldstation prfs : setOfPortableFieldstation) {
            if (prfs.getFieldStationID() == id) {
                mn = prfs;
            }
        }
        return mn;
    }

    public static void removePermenentFieldstation(PermenentFieldstation permfs) {
        setOfPermenentFieldstation.removeElement(permfs);
    }

    public static void removePortableFieldstation(PortableFieldstation pfs) {
        setOfPortableFieldstation.removeElement(pfs);
    }

}
