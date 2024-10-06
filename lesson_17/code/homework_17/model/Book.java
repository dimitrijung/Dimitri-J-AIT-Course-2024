package homework_17.model;

// - Создайте класс Book с полями:
//      - уникальный номер ISBN
//      - название title
//      - автор author
//      - год издания yearOfPublishing
//      - жанр genre
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
// Создайте конструктор, в котором нет поля ISBN. Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    // field----------------------------------------------
    private int isbn;
    private String titel;
    private String author;
    private  int yearOfPublishing;
    private String genre;

    // constructor with all fields-----------------------
    public Book(int isbn, String titel, String author, int yearOfPublishing, String genre) {
        this.isbn = isbn;
        this.titel = titel;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // constructor without ISBN--------------------------
    public Book(String titel, String author, int yearOfPublishing, String genre) {
        this.titel = titel;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // constructor with Titel, Autor, Genre-------------
    public Book(String titel, String author, String genre) {
        this.titel = titel;
        this.author = author;
        this.genre = genre;
    }

    // Getters & Setters-------------------------------
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Print--------------------------------------------
    public void display (){
        System.out.println("ISBN: " + isbn + ", Titel: " + titel + ", Author: " + author + ", Year: " + yearOfPublishing + ", Genre: " + genre);
    }


}// end of class
