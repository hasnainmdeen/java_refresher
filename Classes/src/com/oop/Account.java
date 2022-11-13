package com.oop;

public class Account {
    private int accNo;
    private double balance;
    private String customerName, email, phoneNo;

    public Account(){
        this(112233, 100, "Mr.X", "mrx@xmail.com", "+123456789"); // parameterized constructor is called!
        System.out.println("Empty constructor called!");
    }

    // constructor called with is a constructor
    public Account(String customerName, String email, String phoneNo) {
        this(112233, 100, customerName, email, phoneNo); // parameterized constructor is called!
    }

    public Account(int accNo, double balance, String customerName, String email, String phoneNo) {
        this.accNo = accNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
        System.out.println("Parameterized constructor called");
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("deposited funds: " + amount + " current balance is " + this.balance);
    }

    public void withdrawFunds(double amount){
        if (balance >= amount){
            this.balance -= amount;
            System.out.println("withdrawal processed: remaining amount is " + this.balance);
        }
        else{
            System.out.println("withdrawal not possible. Insufficient balance!");
        }

    }
}
