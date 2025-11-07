import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    static ArrayList<String> produits = new ArrayList<> (List.of("Eau", "Soda", "Chips","Chocolat"));
    static ArrayList<Double> prix = new ArrayList<>(List.of(5.0, 8.0, 12.0, 15.0)) ;
    static ArrayList<Integer> stock = new ArrayList<>(List.of(10, 5, 7, 3));
    public static double tottalMoney = 0;
    public static int totalPurchase = 0;
    public static void acheterProduit(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre product number: ");
        int proNum = input.nextInt();
        System.out.printf("Entre the money: ");
        double amount = input.nextDouble()
        if (stock.get(proNum - 1) == 0) {
            System.out.println("Produit out of stock!");
        }else{
            if (amount >= prix.get(proNum - 1)) {
                tottalMoney += amount - prix.get(proNum - 1 );
                totalPurchase++; 
                System.out.println("Vous avez acheté : " + produits.get(proNum - 1));
                System.out.println("Monnaie rendue : " + (amount - prix.get(proNum - 1)) + " MAD");
            }else{
                System.out.println("No enogh money!");
            }
        }
    }
    public static void main(String[] args) {
        
    }
}