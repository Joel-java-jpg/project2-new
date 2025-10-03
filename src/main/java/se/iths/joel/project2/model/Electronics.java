package se.iths.joel.project2.model;

import se.iths.joel.project2.Product;

public class Electronics extends Product {
    public Electronics(String articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Elektronik";
    }
}
