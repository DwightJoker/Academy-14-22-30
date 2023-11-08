package by.academy.lesson2DZ.book;

public class Book {

    String title;
    String author;
    int year;
    int pages;

    public Book(String title, String author, int year, int pages){
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public void info() {
            System.out.println(title+ "\n" + author + "\n" + year + "\n" + pages);
    }

}
