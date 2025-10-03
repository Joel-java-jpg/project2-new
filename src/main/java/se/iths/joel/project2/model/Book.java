package se.iths.joel.project2.model;

import se.iths.joel.project2.Product;

public class Book extends Product {
    public Book(String articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Bok";
    }
}
