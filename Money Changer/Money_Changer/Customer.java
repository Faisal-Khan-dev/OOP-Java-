package Money_Changer;

public class Customer extends Person {
    private int cashPaid;
    

    public Customer(int amount) {
        this.cashPaid = amount;    }

    public int getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(int cashPaid) {
        this.cashPaid = cashPaid;
    }

    @Override
    public String toString() {
        return " " + cashPaid;
    }
}
