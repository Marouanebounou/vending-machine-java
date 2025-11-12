
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    static ArrayList<String> produits = new ArrayList<> (List.of("Eau", "Soda", "Chips","Chocolat"));
    static ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0)) ;
    static ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));
    public static void mainMenu() {

        while (true) {
            System.out.println("===========================================");
            System.out.println("DISTRIBUTEUR AUTOMATIQUE");
            System.out.println("===========================================");
            System.out.println("[1] Afficher les produits");
            System.out.println("[2] Acheter un produit");
            System.out.println("[3] Quitter");
            System.out.println("===========================================");

            Scanner input = new Scanner(System.in);
            System.out.println("Entrez votre choix : ");
            int choix = input.nextInt();

            if (choix == 3) {
                System.out.println("Merci d’avoir utilisé notre distributeur !");
                break;
            }

            switch (choix) {
                case 1:
                    display();
                    break;

                case 2:
                    acheterProduit();
                    break;

            }
        }
    }

    public static void display() {

        for (int i = 0; i < produits.size(); i++) {
            System.out.println(String.format("%-15s | Prix: %-6s DH | Stock: %d",
                    produits.get(i), prix.get(i), stock.get(i)));
        }
    }

public static void updateStock(int numeroProduit) {
    int index = numeroProduit - 1;
    stock.set(index, stock.get(index) - 1);
    System.out.println("Stock restant du produit " + produits.get(index) + " : " + stock.get(index));
}


    public static double tottalMoney = 0;
    public static int totalPurchase = 0;
    public static void acheterProduit(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre product number: ");
        int proNum = input.nextInt();
        System.out.printf("Entre the money: ");
        double amount = input.nextDouble();
        if (stock.get(proNum - 1) == 0) {
            System.out.println("Produit out of stock!");
        }else{
            if (amount >= prix.get(proNum - 1)) {
                tottalMoney += amount - prix.get(proNum - 1 );
                totalPurchase++; 
                updateStock(proNum);
                System.out.println("Vous avez acheté : " + produits.get(proNum - 1));
                System.out.println("Monnaie rendue : " + (amount - prix.get(proNum - 1)) + " MAD");
            }else{
                System.out.println("No enogh money!");
            }
        }
    }
    public static void main(String[] args) {
        mainMenu();
    }
}
