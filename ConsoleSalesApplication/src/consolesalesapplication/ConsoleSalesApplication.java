/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consolesalesapplication;

import java.util.Scanner;

public class ConsoleSalesApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== CONSOLE SALES APPLICATION =====");

        System.out.println("Select Console Type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        String consoleType;

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid console choice.");
                return;
        }

        input.nextLine();

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

        System.out.println();
        System.out.println("===== SALES REPORT =====");

        sales.printReport();

        input.close();
    }
}
