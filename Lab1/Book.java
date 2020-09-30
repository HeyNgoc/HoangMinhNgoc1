package Lab1;

import java.lang.*;

public class Book {
    private String name;
    private String author;
    private int cost;

    public Book(String name, String author, int cost) {
        this.name = name;
        this.author = author;
        this.cost = cost;
    }

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void getInformation() {
        System.out.println("---------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Cost: " + this.getCost());
    }
}