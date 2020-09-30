package Lab1;

import java.util.Scanner;

public class TestBook {
    public static void main(String args[]) {

            Book newBook1 = new Book();
            newBook1.getInformation();

            Book newBook2 = new Book("Hello World", "Hoang Minh Ngoc", 300);
            newBook2.getInformation();
    }
}
