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

                    cleaningTerminal();
                    break;

                case 2: 
                    cleaningTerminal();
                    listProducts();
                    break;

                case 3:
                    cleaningTerminal();
                    
                    System.out.println("Enter the product search");
                    productName = myObj.nextLine();

                    int productIndex = searchProductIndex(productName); 

                    if (productIndex != -1){
                        System.out.println("PRODUCT FOUND!!");
                        System.out.println("Product information below:");
                        listProductInfo(productIndex);
                    } else {
                        System.out.println("PRODUCT NOT FOUND!!!");
                    }
            }
        }
    }

    public static int searchProductIndex(String productName) {

        int productIndex = -1;

        for (int i = 0; i < totalProducts; i++) {
            if (products[i].equalsIgnoreCase(productName)) {
                productIndex = i;
            }
        }

        return productIndex;
    }

    public static void listProducts() {

        System.out.println("PRODUCTS INVENTORY");

        for (int i = 0; i < totalProducts; i++) {

            System.out.println(); 

            System.out.printf(
                    "PRODUCT |  %s \n" +
                            "QUANTITY | %d \n" +
                            "PRICE | %f \n",
                    products[i], quantity[i], price[i]);
        }
    }

    public static void listProductInfo(int index){
        System.out.printf(
                    "PRODUCT |  %s \n" +
                            "QUANTITY | %d \n" +
                            "PRICE | %f \n",
                    products[index], quantity[index], price[index]);
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

    public static void cleaningTerminal() {
        System.out.print("\033[H\033[2J"); // Cleaning terminal
        System.out.flush(); // Cleaning terminal
    }

    public static void main(String[] args) {
        menu();
    }
}