package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizationDemo implements Externalizable {
    public static void main(String[] args) {
        Employee emp=new Employee();

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
//here you are able to write what are attributes which need to serialize
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//and what are the attibutes which need to deserialize from the serializable file
    }
}
