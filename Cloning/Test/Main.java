package Test;
import java.util.ArrayList;
import java.util.Iterator;

import Cloning.Int2;
import Cloning.Int3;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Int2 x1 = new Int2(20);
        Int2 x2 = (Int2)x1.clone(); //Clone # 01 shallow copy
        x2.increment();

        System.out.println("x ==> " + x1 + " x2 ==> " + x2);
        
        Int3 x3 = new Int3(10);
        x3 = (Int3)x3.clone();       //clone # 2  shallow copy
        Int3 x3_cloned = (Int3) x3.clone();    //clone
    //    x3_cloned.setJ(34);
        System.out.println("x3 : " + x3 + "\nCloned x3  : " + x3_cloned);
        
        ArrayList v = new ArrayList();
        for (int i = 1; i <= 20; i++) {
            v.add(new Int2(i));
        }
            
        System.out.println("ArrayList V : " + v);
        
        ArrayList v2 = (ArrayList)v.clone();      // clone # 3 shallow copy
        // ((Int2)v.get(3)).increment();
        System.out.println("ArrayList V : " + v + "\nArrayList v2 : " + v2);
        // System.out.println(v2);
       
    //    ((Int2)v.get(3)).increment();
    //    System.out.println("After again increment");  // shallow copy doesn't work for reference data types
    //    System.out.println(v);
    //    System.out.println(v2);

    for (int i = 0; i < v.size(); i++) {
        v2.set(i, ((Int2) v.get(i)).clone());    // Clone # 4 // Deep Copy
    }
        
     Iterator e = v2.iterator();
        while(e.hasNext()){
            ((Int2)e.next()).increment();
        }

        System.out.println("Original V :" +v);
        System.out.println("Deep copy V2 : " + v2);
    }
}





// Q # 3
// Ans."Typecasting is required in this program to convert the generic Object references—returned
// by the clone() method or stored in the raw ArrayList—back to their specific types (Int2, Int3, or ArrayList).
// This ensures that class-specific fields and methods can be accessed safely and correctly."

// Q # 4
// Ans."Iterator is used for easy and safe traversal of v2 without managing indexes.
// Yes, it can be replaced with a traditional for loop here since ArrayList supports index-based access,
// but iterator makes the code cleaner and works for any collection type."

// Q # 5
// Ans."The clone() method is not overridden in Int3 because the implementation inherited from Int2 is sufficient. 
// Since Int2 already implements Cloneable and its clone() method performs a field-by-field copy using super.clone(), 
// it correctly duplicates both the inherited field i and the j field in Int3. Moreover, as j is a primitive type, 
// no special deep-copy logic is required. Overriding clone() in Int3 would therefore be redundant."

// Q # 6
// Ans."Out of the four clone() calls in main(), the first three (x1.clone(), x3.clone(), and v.clone()) perform shallow copies
// they simply copy object references without duplicating referenced objects. Only the fourth operation, where each element
//  of v2 is explicitly replaced with a cloned Int2 object inside the for loop, represents a true deep copy because it creates
//   independent copies of all elements."