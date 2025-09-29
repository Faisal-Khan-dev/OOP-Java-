package Money_Changer;

public class Customer {
    private int cashPaid;

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
