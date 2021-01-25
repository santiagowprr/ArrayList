package com.santiago;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); // we're telling JAva that we're creating an ArrayList with type String inside
    // in the previous array (int) we had to specify the size and could assign values to it
    // ArrayList handles that automatically:

    public void addGroceryItem(String item) {
        groceryList.add(item); // adds the 'item' to the ArrayList automatically, and knows how and where to put it
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //OVERLOADED METHOD BELOW
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //OVERLOADED METHOD BELOW (we're making it private, so it wont be accessible to any outsider)
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        // Milk
        // Cheese //if we selected position 1, cheese is removed and bread goes up:
        // Bread

        //after removing the cheese:

        // Milk
        // Bread
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

//    public String findItem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem); // contains checks if there is such an item in out arraylist
//        int position = groceryList.indexOf(searchItem); // searches the arraylist, finds item passed, return Index position of this item, otherwise returns -1
//         if(position >= 0) {
//             return groceryList.get(position);
//         }
//         return null;
//    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem((searchItem));
        if (position >= 0) {
            return true;
        }

        return false;
    }
}
