import java.util.Scanner;

public class InventorySystem {

    public static Scanner myObj = new Scanner(System.in);

    public static String[] products = new String[5];
    public static int[] quantity = new int[5];
    public static float[] price = new float[5];

    public static int totalProducts = 0;

    public static void menu() {

        while(true){

            System.out.println("===== INVENTORY SYSTEM =====");
            System.out.println("1. Register product"); 
            System.out.println("2. List products"); 
            System.out.println("3. Search product"); 
            System.out.println("4. Product stock-in "); 
            System.out.println("5. Product stock-out "); 
            System.out.println("6. Almost out-of-stock products"); 
            System.out.println("0. EXIT"); 

            System.out.print("Choose an option: "); 
            int op = Integer.parseInt(myObj.nextLine()); 
        }
    }

    public static void main(String[] args) {
        menu();
    }
}