package homework_17;

import homework_17.model.Book;

public class BookAppl {
    public static void main(String[] args) {

        Book garryPotter= new Book(123456789, "Garry Potter", "Joan Rowling", 1997, "Fantasy");
        garryPotter.display();

        Book garryPotter2= new Book("Garry Potter 2", "Joan Rowling", 2001, "Fantasy");
        garryPotter2.display();

        Book garryPotter3 = new Book("Garry Potter 3", "Joan Rowling", "Fantasy");
        garryPotter3.display();

    } // end of main
} // end of class

