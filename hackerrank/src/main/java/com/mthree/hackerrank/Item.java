/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.hackerrank;

/**
 *

 */
public class Item {
    private String itemName;
    private String itemDesc;
    private double itemPrice;
    private int quantity;
    private int availableQuantity;
    
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public Item(){
        quantity = 1;
        itemDesc="";
    }
       public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
           this();
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        
    }
}
