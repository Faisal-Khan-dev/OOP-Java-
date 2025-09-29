package Test;
import Money_Changer.Cashier;

public class Main {
    public static void main(String[] args) {
        
        Cashier cashier = new Cashier();
        cashier.setBill(1500);
        cashier.setCashPaid(2000);

        cashier.calculateChange();
    }
}
