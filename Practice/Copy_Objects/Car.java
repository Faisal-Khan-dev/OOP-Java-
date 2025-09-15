// package Copy_Objects;

// public class Car {

//     private String name;
//     private int year;

//     // public Car(String name, int year) {
//     //     this.name = name;
//     //     this.year = year;
//     // }

//     public Car(String name, int year) {  // parameterized constructor
//         this.setName(name);
//         this.setYear(year);
//     }

//     public Car(Car x) {  // copy constructor
//         this.copy(x);    // this will take values from copy method which created below
//     }

//     public String getName() {
//         return name;
//     }

//     public int getYear() {
//         return year;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setYear(int year) {
//         this.year = year;
//     }

//     public void copy(Car x) {
//         this.setName(x.getName());
//         this.setYear(x.getYear());
//     }

//     // public String toString() {
//     //     return name + "\n" + year;
//     // }

// }
