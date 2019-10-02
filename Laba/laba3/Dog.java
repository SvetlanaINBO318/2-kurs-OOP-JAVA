package com.company;

abstract class Dog {
    private String name;
    private String Rathmer;
    public String getName() { return name; }
    public String getRathmer() { return Rathmer; }
    public Dog(String name, String Rathmer){
        this.name=name;
        this.Rathmer=Rathmer;
    }
    public abstract void displayInfo();
}
class Mops extends Dog{
    private String Colour;
    public String getColour() { return Colour; }
    public Mops(String name, String Rathmer, String colour) {
        super(name, Rathmer);
        this.Colour=colour;
    }
    public void displayInfo(){
        System.out.println("Кличка: " + super.getName() + "; Размер: "+ super.getRathmer() + "; Цвет: " +getColour()+ " ");
    }
}
class Taksa extends Dog{
    private String Sherst;
    public String getSherst() { return Sherst; }
    public Taksa(String name, String Rathmer, String Sherst) {
        super(name, Rathmer);
        this.Sherst=Sherst;
    }
    public void displayInfo(){
        System.out.println("Кличка: " + super.getName() + "; Размер: "+ super.getRathmer() + "; Длина шерсти: " +getSherst()+ " ");
    }
}
