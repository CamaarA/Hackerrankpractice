/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.hackerrank;

/**
 *

 */
public class CartSystem extends TheSystem {
       CartSystem() {
           
    }

    @Override
    public void display() {
        System.out.println("Cart");
        System.out.printf("%-20s %-20s %-10s %-10s %-10s", "Name", "Description", "Price", "Quantity", "Sub Total");

        for(Item item : itemCollection.values()) {
            
        System.out.printf("%-20s %-20s %-10s %-10s %-10s", item.getItemName(), item.getItemDesc(), item.getItemPrice(), item.getQuantity(), item.getItemPrice() * item.getQuantity());

        }
        
       System.out.printf("%-20s %-20s %-20s", "Pre-tax Total", "Tax", "Total");

    }
}
