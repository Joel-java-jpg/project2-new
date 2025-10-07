package se.iths.joel.project2;

public abstract class Product {
    String articleNumber;
    String title;
    double price;
    String description;

    public Product(String articleNumber, String title, double price, String description) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String category();

    public String toString() {
        return "Kategori: " + category() +
                " " + "Titel: " + title +
                " " + "Pris: " + price +
                " " + "Beskrivning: " + description +
                " " + "Artikel: " + articleNumber;
    }
}



