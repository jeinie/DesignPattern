package prac_03;

public class Book {
    private String title;
    private int publishYear;
    private int price;

    public Book(String title, int publishYear, int price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    public int getPublishYear() {
        return publishYear;
    }
    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
