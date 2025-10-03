package se.iths.joel.project2;

import se.iths.joel.project2.model.Book;
import se.iths.joel.project2.model.Clothes;
import se.iths.joel.project2.model.Electronics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WebshopAdmin {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------- Meny ---------");
        System.out.println("Tryck 1 för att visa alla produkter");
        System.out.println("Tryck 2 för att visa en produkt");
        System.out.println("Tryck 3 för att lägga till produkt");
        String choice = scanner.nextLine();

        Book book1 = new Book("1001", "Bok.",
                2500, "Dyr bok.");
        Electronics electronics = new Electronics("1002", "Mobil.",
                12, "Iphone.");
        Clothes clothes1 = new Clothes("1003", "Tröja.",
                78, "Skön som fan!");

        products.add(electronics);
        products.add(book1);
        products.add(clothes1);

        if (choice.equals("1")) {
            for (Product p : products) {
                System.out.println(p);
            }
        } else if (choice.equals("2")) {
            System.out.println("Ange artikel nummer");
            String articleNumber = scanner.nextLine();

            boolean found = false;
            for (Product p : products) {
                if (p.getArticleNumber().equals(articleNumber)) {
                    System.out.println(p);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Produkten hittades inte.");
            }
            

        } else if (choice.equals("3")) {
            System.out.println("Vilken typ av produkt vill du lägga till ?");
            System.out.println("(Book, Clothes, Electronics)");
            String type = scanner.nextLine().toLowerCase();

            System.out.println("Ange artikel nummer:");
            String articleNumber = scanner.nextLine();

            System.out.println("Ange Titel:");
            String title = scanner.nextLine();

            System.out.println("Ange pris");
            double price;
            while (true) {
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ogiltigt pris, försök igen");
                }
            }

            System.out.println("Ange beskrivning:");
            String description = scanner.nextLine();

            Product newProduct = null;

            switch (type) {
                case "book":
                    newProduct = new Book(articleNumber, title, price, description);
                    break;
                    case "clothes":
                        newProduct = new Clothes(articleNumber, title, price, description);
                        break;
                        case "electronics":
                            newProduct = new Electronics(articleNumber, title, price, description);
                            break;
                            default:
                                System.out.println("Ogiltigt val.");
                                break;
                                
            }

            if (newProduct != null) {
                products.add(newProduct);
                System.out.println(newProduct);
            }
            
            } else {
                System.out.println("Ogiltigt val, Vänligen tryck 1 eller 2");

            }
            scanner.close();

        }
    }


