/*
Desafio:

Criar um menu tipo:

1 - Cadastrar usuário
2 - Listar usuários
3 - Buscar usuário
4 - Atualizar usuário
5 - Remover usuário
0 - Sair

Armazenar nome e idade em arrays
Limitar quantidade (ex: 100 usuários)
*/

import java.util.Scanner;

public class UserRegistration {

    static String[] users = new String[3];
    static int[] ages = new int[3];

    static int totalUsers = 0;

    static Scanner myObj = new Scanner(System.in);

    public static void menu() {

        while (true) {

            System.out.println("====== USERS REGISTRATION ======");
            System.out.println("1. Register user");
            System.out.println("2. List Users");
            System.out.println("3. Search User");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("0. Exit");

            System.out.println();

            // int op = myObj.nextInt();
            int op = Integer.parseInt(myObj.nextLine()); 

            switch (op) {

                case 1:

                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal

                    boolean isPossibleRegistration = checkIsPossibleToRegister();

                    if (isPossibleRegistration) {

                        System.out.println("Please, enter the name: ");
                        String name = myObj.nextLine();

                        System.out.println("Enter the age...");
                        int age = Integer.parseInt(myObj.nextLine());

                        boolean result = registerUserAndAge(name, age);

                        if (result) {
                            System.out.println("USER REGISTERED!!");
                            System.out.println();
                        } else {
                            System.out.println("USER NOT REGISTERED! TRY AGAIN LATER...");
                            System.out.println();
                        }

                    } else {
                        System.out.println("Sorry! We do not have available space to register new user!");
                        System.out.println();
                    }

                    break;

                case 2:
                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal

                    listUsersAndAge();
                    break;

                case 3:
                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal

                    System.out.println("Inform the user to search...");                    
                    String name = myObj.nextLine();
                    searchUser(name);
                    break;

                case 4:

                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal

                    System.out.println("Inform the user to search...");
                    name = myObj.nextLine();

                    boolean userExists = searchUser(name);

                    if (userExists) {
                        int userIndex = returnUserIndex(name);
                        updateUserInformation(userIndex);
                    } else {
                        System.out.println("ERROR! This user doesn't exist.");
                    }

                    break;

                case 5:

                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal

                    System.out.println("Inform the user to search...");
                    name = myObj.nextLine();

                    userExists = searchUser(name);

                    if (userExists) {
                        int userIndex = returnUserIndex(name);
                        deleteUser(userIndex);
                    }

                    break;

                case 0: 
                    System.out.print("\033[H\033[2J"); // Cleaning terminal
                    System.out.flush(); // Cleaning terminal
                    System.out.println("Closing program..."); 
                    return; 

                default:
                    System.out.println("Invalid option! Restarting the application...");
            }

        }
    }

    public static boolean registerUserAndAge(String name, int age) {
        users[totalUsers] = name;
        ages[totalUsers] = age;
        totalUsers++;
        return true;
    }

    public static void listUsersAndAge() {

        System.out.println("======== USERS ========");

        for (int i = 0; i < totalUsers; i++) {
            System.out.println("Username:" + users[i] + " | Age: " + ages[i]);
        }

        System.out.println();
    }

    public static boolean searchUser(String name) {

        boolean found = false;

        for (int i = 0; i < totalUsers; i++) {

            if (users[i].equalsIgnoreCase(name)) {
                System.out.println("User found!! Information below: ");
                System.out.println();
                System.out.println("Username:" + users[i] + " | Age: " + ages[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("USER NOT FOUND!!");
            return false;
        }

        System.out.println();

        return true;
    }

    public static boolean checkIsPossibleToRegister() {

        if (totalUsers == users.length) {

            return false;

        } else {

            return true;
        }
    }

    public static int returnUserIndex(String name) {

        int userIndex = -1;

        for (int i = 0; i < totalUsers; i++) {
            if (users[i].equalsIgnoreCase(name)) {
                userIndex = i;
            }
        }

        return userIndex;
    }

    public static void updateUserInformation(int userIndex) {

        System.out.println("Please, enter the name: ");
        String name = myObj.nextLine();

        System.out.println("Enter the age...");
        int age = Integer.parseInt(myObj.nextLine());
        
        users[userIndex] = name;
        ages[userIndex] = age;

        System.out.println("INFORMATION UPDATED!!");

        System.out.println();
    }

    public static void deleteUser(int userIndex) {
        // User Index = 1

        // NOMES
        // [0] = "Y"
        // [1] = "X" --> i + 1
        // [2] = "z"
        // [3] = "y"
        // [4] = "maria"

        // NOMES
        // [0] = "Y" - --> i + 1

        for (int i = userIndex; i < totalUsers - 1; i++) {
            users[i] = users[i + 1];
            ages[i] = ages[i + 1];
        }

        totalUsers--;

        System.out.println("USER REMOVED!!");

        System.out.println();
    }

    public static void main(String[] args) {
        menu();
    }
}