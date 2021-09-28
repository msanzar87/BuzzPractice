package com.msanzar87.practice;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    //field to delcare/instatiate an ArrayList
    List<Inventory> strList = new ArrayList<>();

    /**
     * @param strList list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strList) {
        //constructor
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return null;
    }

    //Fill the parameter with the ArrayList
    public String getFirstItem(List<String> strList){

        return null;
    }

}
