/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Aklive
 */
class User implements Serializable{
    
    private static int userId=0;
    private String name;
    private String email;
    private String username;
    private String password = null;
    private String type;

    public User(String name, String username, String email,String password, String type) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.type = type;
        this.userId=userId;
        this.password=password;
        userId++;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    private void writeObject(ObjectOutputStream oos)throws IOException{
        oos.defaultWriteObject();
        oos.writeObject(userId);
    }

    private void readObject(ObjectInputStream ois)throws ClassNotFoundException, IOException{
        ois.defaultReadObject();
        userId = (Integer)ois.readObject();
    } 
}
