package com.santiago;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // changing the length (size) of an array without creating a new one:
        // Array list = resizeble array, handles the resizing automatically

        boolean quit=false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();;
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit=true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t0 - print choice options");
        System.out.println("\t1 - print the list of grocery items");
        System.out.println("\t2 - add an item to the list");
        System.out.println("\t3 - modify an item");
        System.out.println("\t4 - remove an item");
        System.out.println("\t5 - search for an item");
        System.out.println("\t6 - quit");

    }

    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not on file");
        }
    }

    // another way how to copy from one ArrayList to another
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // yet another way:
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        // how to convert ArrayList back to a regular Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);


    }









}
