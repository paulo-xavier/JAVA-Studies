/*
Desafio:

Criar um menu tipo:

1 - Cadastrar usuário
2 - Listar usuários
3 - Buscar usuário
4 - Sair

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

                default:
                    System.out.println("Invalid option! Restarting the application...");
            }

        }
    }

    public static boolean checkIsPossibleToRegister() {
        if (totalUsers == 3) {
            return false;

        } else {
            return true;
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

        for (int i = 0; i < users.length; i++) {

            if (users[i] == null) {
                continue;

            } else {
                System.out.println("Username:" + users[i] + " | Age: " + ages[i]);
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}