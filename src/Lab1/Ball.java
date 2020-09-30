package Lab1;

public class Ball {
    private String name;
    private int size;

    public Ball(String name) {
        this.name = name;
        this.size = 20;
    }

    public Ball(int size) {
        this.name = "ngoc";
        this.size = size;
    }
    public Ball(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Ball() {
        this.name = "ngoc";
        this.size = 10;
    }

    public void setLong(int size) {
        this.size = size;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public int getLong() {
        return size;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nSize: " + this.size;
    }
}
