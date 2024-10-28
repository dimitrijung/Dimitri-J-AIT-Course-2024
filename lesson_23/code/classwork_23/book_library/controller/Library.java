package classwork_23.book_library.controller;

import classwork_23.book_library.model.Book;

public class Library {

    // field
    private Book[] books; // размер всей библиотеки наших книг
    private int size;     // текущее количество книг в библиотеке


    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }


    // CRUD methods
    // addBook()



    // printBooks



     public  Book findBook(long isbn){
        Book foundBook = null;
        return foundBook;
     }



    // removeBook(long isbn)



    // updateBook()


   public int size(){
        return size;
   }



}
