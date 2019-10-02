package com.company;

public class Dog implements Nameable {
    String Name;
    int nomer;
    public Dog (String Name,int radius){
        this.Name=Name;
        this.nomer=nomer;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getNomer() {
        return nomer;
    }
    public void setNomer(int nomer) {
        this.nomer = nomer;
    }
}

