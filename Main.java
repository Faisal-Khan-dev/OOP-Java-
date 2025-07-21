// class Student {
//     String name;
//     int age;
//     boolean isActive;

//     public void studentInfo() {
//         System.out.println(this.name  + " " + " " + this.age + " " + this.isActive);

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "Izhan";
//         s1.age = 20;
//         s1.isActive = true;
//         s1.studentInfo();

//         Student s2 = new Student();
//         s2.name = "Azlan";
//         s2.age = 15;
//         s2.isActive = false;
//         s2.studentInfo();
//     }
// }

// Non-Parameterized constructor!

// class Student {
//     String name;
//     int age;
//     boolean isActive;

//     public void studentInfo() {
//         System.out.println(this.name + " " + " " + this.age + " " + this.isActive);

//     }

//     Student() {
//         System.out.println("Constructor called");
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();

//         s1.name = "Izhan";
//         s1.age = 20;
//         s1.isActive = true;
//         s1.studentInfo();

//         Student s2 = new Student();

//         s2.name = "Azlan";
//         s2.age = 19;
//         s2.isActive = false;
//         s2.studentInfo();
//     }
// }

// Prameterized construcotr!

// class Student {
//     String name;
//     int age;
//     boolean isActive;

//     public void studentInfo() {
//         System.out.println(this.name + " " + " " + this.age + " " + this.isActive);

//     }

//     Student(String name, int age, boolean isActive) {
//         this.name = name;
//         this.age = age;
//         this.isActive = isActive;
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student("Izhan" , 20 , true);
//         s1.studentInfo();

//         Student s2 = new Student("Azlan" , 19, false);
//         s2.studentInfo();
//     }
// }

// Copy-Constructor

//  class Student {
//     String name;
//     int age;
//     boolean isActive;

//     public void studentInfo() {
//         System.out.println(this.name + " " + " " + this.age + " " + this.isActive);

//     }

//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//         this.isActive = s2.isActive;
//     }

//     Student(){

//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Student s1 = new Student();
//         s1.name = "izhan";
//         s1.age = 19;
//         s1.isActive = true;

//         Student s2 = new Student(s1);
//         s2.studentInfo();
//     }
// }

// constructor!

// class Vehicle {

//     String name;
//     String model;
//     String company;

//     public void BMW() {
//         System.out.println(this.name + "\n" + this.model + "\n" + this.company);
//     }

//     Vehicle(String carName, String carModel, String carCompany){
//         this.name = carName; // this.name (class variable) = carName (parameter variable)
//         this.model = carModel;
//         this.company = carCompany;
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Vehicle car1 = new Vehicle("BMW M5 cs" , "BMW M5 Competition Sport(cs)" , "BMW");
//         car1.BMW();

//     }

// }

// copy constructor!

// class Vehicle {

//     String name;
//     String model;
//     String company;

//     public void BMW() {
//         System.out.println(this.name + "\n" + this.model + "\n" + this.company);
//     }

//     Vehicle(Vehicle car2) {
//         this.name = car2.name;
//         this.model = car2.model;
//         this.company = car2.company;
//     }

//     Vehicle() {

//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Vehicle car1 = new Vehicle();

//         car1.name ="BMW M5 cs";
//         car1.model ="BMW M5 Competition Sport(cs)";
//         car1.company = "BMW";

//         Vehicle car2 = new Vehicle(car1);
//         car1.BMW();
//     }

// }

// Can we use the default constructor!......Yes we can!

// class Vehicle {

//     String name;
//     String model;
//     String company;

//     public void BMW() {
//         System.out.println(this.name + "\n" + this.model + "\n" + this.company);
//     }

//     Vehicle() {

//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         Vehicle car1 = new Vehicle();

//         car1.name = "BMW M5 cs";
//         car1.model = "BMW M5 Competition Sport(cs)";
//         car1.company = "BMW";
//         car1.BMW();
//     }

// }

// can we make a private function in java? ..... yes we can

// class Secret {

//     private void private_conv() {
//         System.out.println("This is our private conversation");
//     }

//     public void public_conv() {
//         private_conv();
//     }

// }

// public class Private_conversation {
//     public static void main(String[] args) {

//         Secret conversation = new Secret();
//         conversation.public_conv();
//     }

// }

// can we make a function with same as class name? .... yes (but not recommended bcz compiler will confuse btw constructor and method)

// class Message {
//     public void Message() {
//         System.out.println("hello");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Message msg = new Message();
//         msg.Message();
//     }
    
// }