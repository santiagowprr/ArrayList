package com.santiago;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); // we're telling JAva that we're creating an ArrayList with type String inside
    // in the previous array (int) we had to specify the size and could assign values to it
    // ArrayList handles that automatically:

    public void addGroceryItem(String item){
        groceryList.add(item); // adds the 'item' to the ArrayList automatically, and knows how and where to put it
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i=0 ; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        // Milk
        // Cheese //if we selected position 1, cheese is removed and bread goes up:
        // Bread

        //after removing the cheese:

        // Milk
        // Bread
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem); // contains checks if there is such an item in out arraylist
        int position = groceryList.indexOf(searchItem); // searches the arraylist, finds item passed, return Index position of this item, otherwise returns -1
         if(position >= 0) {
             return groceryList.get(position);
         }
         return null;

    }
}
