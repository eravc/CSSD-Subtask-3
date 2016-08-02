
package Fields;

import static Users.setOfUsers.setOfFPManagers;

import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import serialization.Serialization;
import Fields.SetOfFields;


public class SetOfFields extends Vector<Field> implements Serializable{
    
        private static final long serialVersionUID = 4277168882107543981L;
        
        public static Vector<Field> fields= new Vector<Field>();
    
  public SetOfFields()
  {
    super();
  }
  
  
   public static void serialize() throws IOException {
    Serialization.serialize(fields, "Fields.txt");

    }
   
    public static void deSerialize() throws IOException, ClassNotFoundException {
    fields=(Vector<Field>)Serialization.deSerialize("Fields.txt");

    }


  public void addField(Field aField)
  {
    super.add(aField);
  }
  
  public void removeField(Field aField)
  {
    super.remove(aField);
  }
  
  
     public Field findFieldById(int f){
   
    Field  tempField=new Field();
    for(Field fs:this){
    
        if(fs.getFieldID()==f)
        {
            tempField=fs;
        }
    
    }
    return tempField;  
  }
  
    
}
