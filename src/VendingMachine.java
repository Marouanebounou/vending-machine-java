
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class VendingMachine {
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

    public void pruchadeMenu() {
        while (true) {

        }
    }

    public static void display() {

        ArrayList<String> produits = new ArrayList<>(Arrays.asList("Eau", "Soda", "Chips", "Chocolat"));

        ArrayList<Double> prix = new ArrayList<>(Arrays.asList(5.0, 8.0, 12.0, 15.0));

        ArrayList<Integer> stock = new ArrayList<>(Arrays.asList(10, 5, 7, 3));

        // display

        for (int i = 0; i < produits.size(); i++) {
            System.out.println(String.format("%-15s | Prix: %-6s DH | Stock: %d",
                    produits.get(i), prix.get(i), stock.get(i)));
        }
    }

    public static void main(String[] args) {
        mainMenu();

    }
}