package Money_Changer;

public class Cashier extends Customer{
    private int bill;

    public int getBill() {
        return bill;
    }
    
    public void setBill(int cashPaid) {
        this.bill = cashPaid;
    }

    public void calculateChange() {
        int[] denominations = { 5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int retun_Change = getCashPaid() - bill;

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
