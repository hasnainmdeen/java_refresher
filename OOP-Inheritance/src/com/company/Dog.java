package com.company;

// inheriting Dog from Animal class
public class Dog extends Animal {

    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // call the constructor of base class and sets params in that

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); // mean will execute the method of super class
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        // both are same.
//        move(5); // will try to find move in current (child) class, if not found then will execute move of parent
        super.move(5); // not look in the current class, forcing to execute move of parent
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10); // will try to find move in child, if not found then will execute move of parent
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called; moving legs at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(10);
        super.move(speed); // also calling the functionality of super class
    }
}
