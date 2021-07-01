package finalExam;

public class Book {
    String title;
    double price;
    int year;
    String author;

    public Book(String author, String title, double price, int year){
        this.author = author;
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + ", author='" + author + '\''+
                "title='" + title + '\'' +
                ", $" + price +
                ", year=" + year;
    }

}
