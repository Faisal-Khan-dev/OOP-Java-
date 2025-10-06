package Test;
import java.util.Scanner;

import Money_Changer.Cashier;
import Money_Changer.Customer;

public class Main {
    public static void main(String[] args) {
  
         Cashier cashier = new Cashier();
         int bill = cashier.generateBill(2000);

        Customer customer = new Customer();
        customer.name();
        customer.viewBill(bill);
        int cash = customer.payCash();


        cashier.calculateChange(bill, cash);
    }
}
