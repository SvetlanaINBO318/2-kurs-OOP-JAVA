package com.company;

public class Main {
    public static void main(String[] args) {
        Taksa Nik = new Taksa("Nik", "Маленькая", "Длинная");
        Mops Tom = new Mops("Tom", "Огромный", "Бежевый");
        Nik.displayInfo();
        Tom.displayInfo();
    }
}
