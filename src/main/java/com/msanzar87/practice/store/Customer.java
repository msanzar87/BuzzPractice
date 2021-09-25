package com.msanzar87.practice.store;

public class Customer {

    //Create a customer entity with the fields: name and number of apples purchased

    private String customerName;
    private int applesPurchased;

    public Customer(){}

    public Customer(String customerName, int applesPurchased){
        this.customerName = customerName;
        this.applesPurchased = applesPurchased;


    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getApplesPurchased() {
        return applesPurchased;
    }

    public void setApplesPurchased(int applesPurchased) {
        this.applesPurchased = applesPurchased;
    }
}
