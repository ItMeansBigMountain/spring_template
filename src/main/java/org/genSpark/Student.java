package org.genSpark;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;




public class Student {


    private String name;
    private int id;
    private Address address;

    private List<Phone> ph;


    public void init() {
        System.out.println("hello???");
    }

    public void destroy() {
        System.out.println("bye!!!");
    }


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

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
