package Fields;

import java.io.IOException;
import java.io.Serializable;
import java.util.Vector;
import serialization.Serialization;

public class SetOfFields extends Vector<Field> implements Serializable {

    //private static final long serialVersionUID = 4277168882107543981L;
    //public static Vector<Field> fields = new Vector<Field>();
    public void serialize() throws IOException {
        Serialization.serialize(this, "Fields.txt");
    }

    public void deSerialize() {
        try{
        this.addAll(Serialization.deSerialize("Fields.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public SetOfFields() {
        super();
    }

    public void addField(Field aField) {
        super.add(aField);
    }

    public void removeField(Field aField) {
        super.remove(aField);
    }

    public Field findFieldById(int f) {

        Field tempField = new Field();
        for (Field fs : this) {

            if (fs.getFieldID() == f) {
                tempField = fs;
            }

        }
        return tempField;
    }
}
