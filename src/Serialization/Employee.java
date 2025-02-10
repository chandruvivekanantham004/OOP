package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    //transient is an keyword which is used to remove the particular attribute from serialization
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
