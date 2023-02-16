package org.example.restaurant;

public class MenuItem {
 //private fields name, description, price, category, and dateAdded (Date)

    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;


    //constructor

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }

    /*
    MenuItem(int price,string desc, string categ){...}

    // getter methods
     public get price{}
    public get desc{}
    public get category{}

    // setter methods
    private set price{}
    private set desc{}
    private set categ{}
     */
}
