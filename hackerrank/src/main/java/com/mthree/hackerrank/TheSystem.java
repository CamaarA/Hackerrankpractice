/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 */
public abstract class TheSystem {
   public HashMap<String, Item> itemCollection;

    TheSystem() {
        itemCollection = new HashMap<String,Item>();
        try{
            FileReader file= new FileReader(new File("sample.txt"));
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String[] itemInfo =sc.nextLine().split("");
                Item item = new Item();
                item.setItemName(itemInfo[0]);
                item.setItemDesc(itemInfo[1]);
                item.setItemPrice(Double.valueOf(itemInfo[2]));
                item.setAvailableQuantity(Integer.valueOf(itemInfo[3]));
                itemCollection.put(item.getItemName(), item);
            } sc.close();
        } catch (FileNotFoundException fex){
            System.err.println("Error can not find your file");
            fex.printStackTrace();
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
        
    }
    
    public Boolean checkAvailability(Item item) {
        if(item.getAvailableQuantity() < item.getQuantity()){
            String unavailable = "System is unable to add " + item.getItemName() + " to the card. System only has" + item.getAvailableQuantity() + "" + item.getItemName() + "s";
            System.err.println(unavailable);
            return false;
        } else{
            return true;
        }
    }
    
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } else if (this.itemCollection.containsKey(item.getItemName())){
            Item collectItem = this.itemCollection.get(item.getItemName());
            int currentinv = collectItem.getQuantity();
            collectItem.setQuantity(currentinv+1);
            this.itemCollection.put(item.getItemName(), collectItem);
            return true;
        } else{
        this.itemCollection.put(item.getItemName(), item);
        return true;
        }
    }
    

    public Item remove(String itemName) {
        
       Item foundItem = itemCollection.get(itemName);
       
       if (foundItem != null) {
       return this.itemCollection.remove(itemName);
       } 
       
       return null;
    }

    public abstract void display();
}
