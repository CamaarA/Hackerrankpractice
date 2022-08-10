/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.hackerrank;

/**
 *
 */
public class AppSystem extends TheSystem{
       AppSystem() {
    }

    @Override
    public void display() {
 System.out.println("Cart");
        System.out.printf("%-20s %-20s %-10s %-10s %-10s", "Name", "Description", "Price", "Quantity");

        for(Item item : itemCollection.values()){
            
        }
    }
    

    @Override     
    public Boolean add(Item item) {
       if(item==null){
           return false;
       }else if(this.getItemCollection().containsKey(item.getItemName())){
           System.out.println(item.getItemName()+" is already in the App System ");
           return false;
       } else {
           this.getItemCollection().put(item.getItemName(), item);
                   return true;
       }
    }

    public Item reduceAvailableQuantity(String item_name) {
        Item foundItem = itemCollection.get(item_name);
        if (foundItem!=null){
            return this.itemCollection.remove(item_name);
            //Item collectItem = this.itemCollection.get(item_name)
            //int currentinv = collectItem.getQuantity();
            //collectItem.setQuantity(currentinv-1);
        }
        return null;
    }
}
