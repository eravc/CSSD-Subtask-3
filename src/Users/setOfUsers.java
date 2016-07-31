
package Users;

import serialization.Serialization;
import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;


public class setOfUsers implements Serializable{
    
    public static Vector<Farmer> setOfFarmers = new Vector<Farmer>();
    public static Vector<Manager> setOfFPManagers = new Vector<Manager>();

    public static void serialize() throws IOException {
    Serialization.serialize(setOfFarmers, "Farmers.txt");
    Serialization.serialize(setOfFPManagers, "Managers.txt");
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        setOfFarmers = (Vector<Farmer>) Serialization.deSerialize("Farmers.txt");
        setOfFPManagers = (Vector<Manager>) Serialization.deSerialize("Managers.txt");
    }

    public static void addFarmer(Farmer man) {
        setOfFarmers.add(man);
    }

    public static void addManager(Manager man) {
        setOfFPManagers.add(man);
    } 
    
    public static Vector<Manager> getAllManagers(){
        return setOfFPManagers;
    }
    
    public static Vector<Farmer> getAllFarmers(){
        return setOfFarmers;
    }

    public Farmer getFarmerByName(String name){
        Farmer fm = null;
        
        for(Farmer user: setOfFarmers){
            if(user.getName().equalsIgnoreCase(name)){
              fm = user; 
            }
        }
        return fm;
    }
    
    public Manager getManagerByName(String name){
        Manager mn = null;
        
        for(Manager user: setOfFPManagers){
            if(user.getName().equalsIgnoreCase(name)){
              mn = user; 
            }
        }
        return mn;
    }
    
    public static void removeFarmer(Farmer man){
        setOfFarmers.removeElement(man);
    }
    
    public static void removeManager(Manager man){
        setOfFPManagers.removeElement(man);
    }
    
}
