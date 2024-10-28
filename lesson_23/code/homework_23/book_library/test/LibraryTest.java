package homework_23.book_library.test;

import homework_23.book_library.controller.Library;
import homework_23.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    Book[] books;
    int size = 0;


    @BeforeEach
    void setUp() {

        library = new Library(5);

        books = new Book[5];

        books[0] = new Book("1984","Oruell",1_111_111_111_110L, 2010);
        books[1] = new Book("T1","A1",1_111_111_111_111L, 2011);
        books[2] = new Book("T2","A2",1_111_111_111_112L, 2012);
        books[3] = new Book("T3","A3",1_111_111_111_113L, 2013);

        // TODO
        //положить обьекты в массив, который "внутри" обьекта Library
        for (int i = 0; i < 4; i++) { // пока только 4 книги (size=4)"кладем" и library

        }
    }

    // method addBook boolean (true, false)
    @Test
    void addBookTest(){
        // не добавлять null
       assertFalse(library.addBook(null));
        // не добавлять дублик
       assertFalse(library.addBook(books[0]));
        // добавляем еще одну новую книгу
        Book newBook = new Book("T4", "A4",1_111_111_111_114L,2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());
        // добавляем еще одну сверх capacity
        Book newBook1 = new Book("T5", "A5",1_111_111_111_115L,2025);
        assertFalse(library.addBook(newBook1));
    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals( books[0], library.findBook(1_111_111_111_110L) ); // find existed book
        assertNull(library.findBook(1_111_111_111_119L)); // find absent book

    }

    @Test
    void removeBookTest(){ //delete a Book
        // remove existed book
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));
        assertEquals(3, library.size());
        // remove absent book
        assertNull(library.removeBook (1_111_111_111_119L));
    }

    @Test
    void sizeTest (){
        assertEquals(4,library.size());
    }

    @Test
    void printBooksTest (){
        System.out.println("-------------");
        library.printBook();
    }



}