package Cloning;

public class Int3 extends Int2{
    private int j ;

    public Int3(int j){
        super(2);
        this.j = j;
    }
    public int getJ() {
        return j;
    }
    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "i : " + getI() + " j : " + getJ() ;
    }
}