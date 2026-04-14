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
            System.out.println("0. Exit");

            System.out.println();

            int op = myObj.nextInt();

            switch (op) {

                case 1:

                    boolean isPossibleRegistration = checkIsPossibleToRegister();

                    if (isPossibleRegistration) {

                        System.out.println("Please, enter the name: ");
                        String name = myObj.next();

                        System.out.println("Enter the age...");
                        int age = myObj.nextInt();

                        boolean result = registerUserAndAge(name, age);

                        if (result) {
                            System.out.println("USER REGISTERED!!");
                        } else {
                            System.out.println("USER NOT REGISTERED! TRY AGAIN LATER...");
                        }

                    } else {
                        System.out.println("Sorry! We do not have available space to register new user!");
                    }

                    break;

                case 2:
                    listUsersAndAge();
                    break;

                case 3:
                    System.out.println("Inform the user to search...");
                    String name = myObj.next();
                    searchUser(name);
                    break;

                case 4:
                    System.out.println("Inform the user to search...");
                    name = myObj.next();

                    boolean userExists = searchUser(name);

                    if (userExists) {
                        int userIndex = returnUserIndex(name);
                        updateUserInformation(userIndex);
                    } else {
                        System.out.println("ERROR! This user doesn't exist.");
                    }

                    break; 

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

        return true;
    }

    public static boolean checkIsPossibleToRegister() {

        if (totalUsers == 3) {

            return false;

        } else {

            return true;
        }
    }

    // findindex(name)

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
        String name = myObj.next();

        System.out.println("Enter the age...");
        int age = myObj.nextInt();

        users[userIndex] = name; 
        ages[userIndex] = age; 

        System.out.println("INFORMATION UPDATED!!");
    }

    public static void main(String[] args) {
        menu();
    }
}