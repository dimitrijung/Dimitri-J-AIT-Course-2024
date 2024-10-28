package homework_23.book_library.model;

// Создать класс Book с полями:
//    - long isbn,
//    - String title,
//    - String author,
//    - int yearOfPublishing.
// Проверить ISBN на корректное количество цифр = 13

import java.util.Objects;

public class Book {

    public static final  int ISBN_LENGTH = 13;

    // field
    private String titel;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    // constructor
    public Book(String titel, String author, long isbn, int yearOfPublishing) {
        this.titel = titel;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;

        this.isbn = checkIsbn (isbn);
    }

    private long checkIsbn(long isbn) {
    // проверить длину isbn
        if (countDigit(isbn)){
            return isbn;
        }
        return -1; // сигнал того что ISBN неверный
    }

    private boolean countDigit(long isbn) {
        // String.valueOf(isbn).length()==13  -
        // можно циклом  fori так как известно сколько раз он должен отработать
        int count = 0;
        long temp = isbn; // чтобы не испортить значение isbn
        while ((temp != 0)){
            temp = temp / 10;
            count++;
        }
        return count == ISBN_LENGTH;
    }

    public long getIsbn() {
        return isbn;
    }

    //TODO предусмотреть защиту по поводу 13 цифр и в этом случае (если ктото захочет поменять ISBN)
    public void setIsbn(long isbn) {
        if (checkIsbn(isbn) > 0){
            this.isbn = checkIsbn(isbn);
        } else {
            System.out.println("ISBN is not correct.");
        }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn && yearOfPublishing == book.yearOfPublishing && Objects.equals(titel, book.titel) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, author, isbn, yearOfPublishing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("titel='").append(titel).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}// end of class
