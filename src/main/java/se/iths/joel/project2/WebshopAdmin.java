package se.iths.joel.project2;

import se.iths.joel.project2.model.Book;
import se.iths.joel.project2.model.Clothes;
import se.iths.joel.project2.model.Electronics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebshopAdmin {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Methods methods = new Methods();

        products.add(new Electronics("1002", "Mobil", 12, "Iphone."));
        products.add(new Book("1001", "Bok", 2500, "Dyr bok."));
        products.add(new Clothes("1003", "Tröja", 78, "Skön som fan!"));

        boolean isRunning = true;
        while (isRunning) {
            Methods.showMenu();
            int choice = methods.getUserChoice();

            switch (choice) {
                case 1:
                    System.out.println("Här är alla produkter");
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    methods.pauseHelper();
                    break;
                case 2:
                    System.out.println("Ange artikelnummer");
                    String articleNumberInput = scanner.nextLine();

                    boolean found = false;

                    for (Product p : products) {
                        if (p.getArticleNumber().equals(articleNumberInput)) {
                            System.out.println(p);
                            found = true;
                            methods.pauseHelper();
                        }
                    }

                    if (!found) {
                        System.out.println("ingen produkt med det artikelnumret hittades.");
                        methods.pauseHelper(); //test
                    }
                    break;

                case 3:
                    System.out.println("Vilken produkt vill du lägga till?");
                    System.out.println("(Kläder, Elektronik, Bok)");
                    String type = scanner.nextLine();

                    System.out.println("Ange artikelnummer:");
                    String articleNumber = scanner.nextLine();

                    System.out.println("Ange titel:");
                    String title = scanner.nextLine();

                    System.out.println("Ange beskrivning");
                    String description = scanner.nextLine();

                    System.out.println("Ange pris:");
                    double price;

                    while (true) {
                        try {
                            price = Double.parseDouble(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Ogiltigt pris, försök igen");
                        }
                    }

                    Product newProduct = null;

                    switch (type) {
                        case "bok":
                            newProduct = new Book(articleNumber, title, price, description);
                            break;
                        case "kläder":
                            newProduct = new Clothes(articleNumber, title, price, description);
                            break;
                        case "elektronik":
                            newProduct = new Electronics(articleNumber, title, price, description);
                            break;
                        default:
                            System.out.println("Ogiltig produkttyp.");
                            break;
                    }

                    if (newProduct != null) {
                        products.add(newProduct);
                        System.out.println("Produkten har lagts till.");
                    } else {
                        System.out.println("Produkten måste ha ett värde!");
                    }

                    methods.pauseHelper();
                    break;

                case 4:
                    System.out.println("Avslutar programmet");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Ogiltigt val, försök igen.");
                    break;
            }
        }
    }
}



