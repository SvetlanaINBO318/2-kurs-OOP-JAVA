package com.company;

class Human {

    String name;
    int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) { this.name = name; }
    public String getName(){ return name; }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String toHuman() {
        return " Имя:"+getName()+"; Возраст: "+getAge()+ "; ";
    }
}
class Head {
    public String colourHair;
    public String colourEyes;
    public void setColourHair( String colourHair) {
        this.colourHair = colourHair;
    }
    public String getColourHair() { return colourHair; }
    public void setColorEyes( String colourEyes) {
        this.colourEyes = colourEyes;
    }
    public String getColorEyes( ) { return colourEyes; }
    public String toHead() {
        return " Цвет волос: "+getColourHair()+"; Цвет глаз: "+getColorEyes()+ "; ";
    }
}

class Leg {
    public int length;
    public void setLength( int length) {
        this.length = length;
    }
    public int getLength() { return length; }
    public String toLeg() {
        return " Длина ног: "+getLength()+"; ";
    }
}

class Hand {
    public String ManicurColour;
    public void setManicurColour( String ManicurColour) {
        this.ManicurColour = ManicurColour;
    }
    public String getManicurColour() { return ManicurColour; }
    public String toHand() {
        return " Цвет маникюра: "+getManicurColour()+"; ";
    }
}
public class Main {

    public static void main(String[] args) {
        Human Hu= new Human("Nik", 12);
        System.out.println(Hu.toHuman());
    }
}
