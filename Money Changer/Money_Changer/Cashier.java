package Money_Changer;

public class Cashier{
    private int bill;

    public Cashier() {
        this.bill = 0;
    }

    public int generateBill(int bill) {
        return this.bill = bill;
    }
    

    public void calculateChange(int bill , int cash) {
        int[] denominations = { 5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int retun_Change = cash - bill;

         if (retun_Change == 0) {
            System.out.println("Thanks for shopping!");
        } 
        else if (retun_Change < 0) {
            System.out.println("You need to pay more: Rs. " + (-retun_Change));
        } 
        else {
            System.out.println("Change to return: Rs. " + retun_Change);

            for (int i = 0; i < denominations.length; i++) { // loop from largest to smallest
                while (retun_Change >= denominations[i]) {
                    System.out.println("Rs. " + denominations[i]);
                    retun_Change -= denominations[i];
                }
            }
        }
    }

    @Override
    public String toString() {
        return " " + bill;
    }
}
