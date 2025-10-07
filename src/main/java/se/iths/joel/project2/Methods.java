package se.iths.joel.project2;

import java.util.Scanner;

public class Methods {
    private Scanner scanner = new Scanner(System.in);

    public static void showMenu(){
        System.out.println("--------- Meny ---------");
        System.out.println("Tryck 1 för att visa alla produkter");
        System.out.println("Tryck 2 för att visa en produkt");
        System.out.println("Tryck 3 för att lägga till produkt");
        System.out.println("Tryck 4 för att avsluta");
    }

    public void pauseHelper(){
        System.out.println("Klicka ENTER för att gå vidare... ");
        scanner.nextLine();
    }

    public int getUserChoice(){
        System.out.println("Välj ett alternativ");
        while (!scanner.hasNextInt()){
            System.out.println("Fel val!");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
