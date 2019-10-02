package com.company;

public class Planeta implements Nameable {
    String Name;
    int radius;
    public Planeta (String Name,int radius){
        this.Name=Name;
        this.radius=radius;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
