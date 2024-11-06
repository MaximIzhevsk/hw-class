public class Book {
    private String nameBook;
    private Author author;
    private int yearBook;

    public Book(String nameBook, Author author, int yearBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearBook = yearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
