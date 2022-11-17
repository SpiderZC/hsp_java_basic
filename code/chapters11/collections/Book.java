package collections;

public class Book {

    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.setName(name);
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t %s\t\t %d", name,  author, price);
    }

}

