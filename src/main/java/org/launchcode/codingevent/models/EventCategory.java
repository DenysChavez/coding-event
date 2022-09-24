package org.launchcode.codingevent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class EventCategory extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

    @NotBlank
    @Size(min=3, message = "Name must be at least 3 characters long")
    private String name;

    public EventCategory() {
    }

//    public int getId() {
//        return id;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public int hashCode() {
//        return id;
//    }
}
