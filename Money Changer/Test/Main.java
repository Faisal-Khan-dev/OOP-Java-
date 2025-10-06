package Test;
import java.util.Scanner;

import Money_Changer.Cashier;
import Money_Changer.Customer;

public class Main {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Total Bill");

        Cashier cashier = new Cashier();
        cashier.setBill(1100);
        
        Customer customer = new Customer(2000);

        cashier.calculateChange(customer);
    }
}
