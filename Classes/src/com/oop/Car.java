package com.oop;

import java.util.Locale;

// public - unrestricted access
public class Car {

    public Car() {
    }

    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    // Encapsulation
    // private - don't allow the classes except this class to access the props of this class
    private int doors = 3;
    private int wheels;
    private String model, engine, color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    // encapsulation - by not allowing the people to access the field directly
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("holden")){
            this.model = model;
        }
        else {
            this.model = "unknown";
        }

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
