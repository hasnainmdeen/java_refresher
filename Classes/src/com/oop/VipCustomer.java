package com.oop;

public class VipCustomer {
    private String name, email;
    private double creditLimit;

    public VipCustomer() {
        this("customer A", "a@vip.com", 1000);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 100);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
