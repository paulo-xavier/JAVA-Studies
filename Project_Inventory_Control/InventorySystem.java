import java.util.Scanner;

public class InventorySystem {

    public static Scanner myObj = new Scanner(System.in);

    public static String[] products = new String[5];
    public static int[] quantity = new int[5];
    public static float[] price = new float[5];

    public static int totalProducts = 0;

    public static void menu() {

        while (true) {

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

            switch (op) {

                case 1:
                    System.out.println("Enter the product name: ");
                    String productName = myObj.nextLine();

                    System.out.println("Enter the product quantity: ");
                    int productQuantity = Integer.parseInt(myObj.nextLine());

                    System.out.println("Enter the product price: ");
                    float productPrice = Float.parseFloat(myObj.nextLine());

                    boolean result = registerProduct(productName, productQuantity, productPrice);

                    if (result) {
                        System.out.println("Product Successfully registered!!");
                    } else {
                        System.out.println("Product not registered! TRY AGAIN...");
                    }

                    break;

                case 2:
                    listProducts();
                    break; 

            }
        }
    }


    public static void listProducts() {
        
        System.out.println("PRODUCTS INVENTORY");

        for (int i = 0; i < totalProducts; i++) {
            System.out.printf(
                "PRODUCT |  %s \n" +
                "QUANTITY | %d \n" + 
                "PRICE | %f \n", 
                products[i], quantity[i], price[i]
            );
        }
    }

    public static boolean registerProduct(String productName, int productQuantity, float productPrice) {

        try {
            products[totalProducts] = productName;
            quantity[totalProducts] = productQuantity;
            price[totalProducts] = productPrice;
            totalProducts++;
            return true;

        } catch (Exception e) {
            System.out.println("Fail to register product!!");
            return false;
        }
    }

    public static boolean checkIsPossibleToRegisterProduct() {
        if (totalProducts == 5) {
            return false; // Not possible

        } else {
            return true; // Possible
        }
    }

    public static void main(String[] args) {
        menu();
    }
}