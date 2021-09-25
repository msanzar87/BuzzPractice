package com.msanzar87.practice.store;

public class AppleStore {
    private String storeName;
    private int numOfCustomers;
    private int appleStock;
    private int applesSold;
    private double totalProfit;
    private double costOfApple;


    /*
    Create a store entity with the fields: name of store, number of customers,
     apple stock, total number of apples sold and total profit
     */
    public AppleStore(){

    }

    public AppleStore(String storeName, int appleStock, double costOfApple){
        this.storeName = storeName;
        this.numOfCustomers = 0;
        this.appleStock = appleStock;
        this.applesSold = 0;
        this.totalProfit = 0;
        this.costOfApple = costOfApple;
    }

    public double getCostOfApple() {
        return costOfApple;
    }

    public void setCostOfApple(double costOfApple) {
        this.costOfApple = costOfApple;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }

    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }

    public int getAppleStock() {
        return appleStock;
    }

    public void setAppleStock(int appleStock) {
        this.appleStock = appleStock;
    }

    public int getApplesSold() {
        return applesSold;
    }

    public void setApplesSold(int applesSold) {
        this.applesSold = applesSold;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }
}
