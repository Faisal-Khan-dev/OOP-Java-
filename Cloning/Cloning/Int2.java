package Cloning;

public class Int2 implements Cloneable{
    private int i;

    public Int2(int i) {
        this.i = i;
    }

      public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

     @Override
    public String toString() {
        return ""+ i ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void increment() {
        i++;
    }
}