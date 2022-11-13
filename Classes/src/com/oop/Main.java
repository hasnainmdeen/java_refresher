package com.oop;

import java.beans.Customizer;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Car porsche = new Car();
//        Car holden = new Car(2, 4, "New", "x-brand", "Grey");
//        porsche.setColor("Pink");
//        System.out.println(porsche.getColor());
//        System.out.println("Default no. of doors of porsche are : " + porsche.getDoors());
//        porsche.setDoors(4);
//        System.out.println("Customized no. of doors of porsche are : " + porsche.getDoors());
//
//        System.out.println(holden.getModel());
//
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNUm(5.0);
//        calculator.setSecondNum(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNUm(5.25);
//        calculator.setSecondNum(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Account acc1 = new Account();
//        acc1.setBalance(45.2);
//        acc1.depositFunds(550.6);
//        acc1.withdrawFunds((acc1.getBalance() + 152));
//
//        Account bobsAccount = new Account(12345, 453.2, "bob", "bob@test.com", "+1121");
//        System.out.println(bobsAccount.getCustomerName());
//        System.out.println(bobsAccount.getBalance());
//        bobsAccount.depositFunds(125.25);
//
//        Account timsAccount = new Account("Tims", "tim@test.com", "+6462");
//        System.out.println(timsAccount.getAccNo());
//        System.out.println(timsAccount.getBalance());

//        VipCustomer cust1 = new VipCustomer();
//        System.out.println(cust1.getName());
//        System.out.println(cust1.getCreditLimit());
//        VipCustomer cust2 = new VipCustomer("Bob", "bob@bob.com");
//        System.out.println(cust2.getName());
//        System.out.println(cust2.getCreditLimit());
//
//        Person person = new Person();
//        person.setAge(20);
//        System.out.println(person.isTeen());
//
//        person.setAge(13);
//        System.out.println(person.isTeen());
//        person.setAge(12);
//        System.out.println(person.isTeen());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
