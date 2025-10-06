package Money_Changer;

import java.util.Scanner;

public class Customer implements Person {
    private int cashPaid;

     public Customer (){
        this.cashPaid = 0;
    }
    
    @Override
    public void name() {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Name: " + name);
    }

    public void viewBill(int bill) {
        Cashier cashier = new Cashier();
        System.out.println("YOUR TOTAL BILL IS : " + bill);

    }
    
    public int payCash(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PAY THE BILL!");
        this.cashPaid = sc.nextInt();
        return this.cashPaid;
    }

    @Override
    public String toString() {
        return " " + cashPaid;
    }

}
