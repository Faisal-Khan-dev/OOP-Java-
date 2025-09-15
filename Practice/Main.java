// class Student {
//     String name;
//     int age;
//     boolean isActive;

//     public void studentInfo() {
//         System.out.println(this.name  + " " + this.age + " " + this.isActive);

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

// Variable Scope!

// public class Main {
//     public static void main(String[] args) {

//         DiceRoller diceRoller = new DiceRoller();

//     }

// }

// public class Main {
//     public static void main(String[] args) {

//          Overloading_Constructor animal = new Overloading_Constructor(2 , "Hen" , true);
//          System.out.println("Here's the chicks");
//         System.out.println("chicks" + animal.chicks);
//         System.out.println("Hen" + animal.hen);
//         System.out.println("isActive" + animal.isActive);
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//          Overloading_Constructor animal = new Overloading_Constructor(2 , "Hen");
//          System.out.println("Here's the chicks");
//         System.out.println("chicks" + animal.chicks);
//         System.out.println("Hen" + animal.hen);
//         System.out.println("isActive" + animal.isActive);
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//          Overloading_Constructor animal = new Overloading_Constructor(2);
//          System.out.println("Here's the chicks");
//         System.out.println("chicks" + animal.chicks);
//         System.out.println("Hen" + animal.hen);
//         System.out.println("isActive" + animal.isActive);
//     }

// }

// public class Main {
//     public static void main(String[] args) {

//         ToSTring car = new ToSTring("Ford", "Red", "Mustang");

//         System.out.println(car);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         ArrayOfObj[] refrigerator = new ArrayOfObj[3];

//         ArrayOfObj food1 = new ArrayOfObj("Pizza");
//         ArrayOfObj food2 = new ArrayOfObj("Cake");
//         ArrayOfObj food3 = new ArrayOfObj("Chicken");

//         refrigerator[0] = food1;
//         refrigerator[1] = food2;
//         refrigerator[2] = food3;

//         System.out.println(food1 + "\n" + food2 + "\n" + food3);

//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         // ArrayOfObj[] refrigerator = new ArrayOfObj[3];

//         ArrayOfObj food1 = new ArrayOfObj("Pizza");
//         ArrayOfObj food2 = new ArrayOfObj("Cake");
//         ArrayOfObj food3 = new ArrayOfObj("Chicken");

//         ArrayOfObj[] refrigerator = {food1, food2, food3};

//         // System.out.println(food1 + "\n" + food2 + "\n" + food3);
//         System.out.println(refrigerator[0]);
//         System.out.println(refrigerator[1]);
//         System.out.println(refrigerator[2]);

//     }

// import Passing_Obj.Car;
// import Passing_Obj.Garage;

// public class Main {
//     public static void main(String[] args) {

//         Car car1 = new Car("BMW");
//         Car car2 = new Car("Tesla");

//         Garage garage = new Garage();

//         garage.park(car1);

//     }
// }

// import Static_Keyword.Friend;

// public class Main {
//     public static void main(String[] args) {

//         Friend friend1 = new Friend("Ali");
//         Friend friend2 = new Friend("Salman");
//         Friend friend3 = new Friend("Ghaffar");

//         System.out.println(Friend.numberOfFriends);
//         System.out.println(friend1.name +"\n" + friend2.name + "\n" + friend3.name);

//     }
// }

// import Static_Keyword.Friend;

// public class Main {
//     public static void main(String[] args) {

//         Friend friend1 = new Friend("Ali");
//         Friend friend2 = new Friend("salman");
//         Friend friend3 = new Friend("Feroz");

//         Friend.displayfriends(friend1 , friend2 , friend3);
//     }
// }

// import Inheritance.Vehicle;
// import Inheritance.Bicycle;
// import Inheritance.Cars;

// public class Main {
//     public static void main(String[] args) {

//         Cars car = new Cars();
//         // car.go();

//         Bicycle bike = new Bicycle();
//         // bike.stop();

//         System.out.println(car.speed);
//         System.out.println(bike.speed);
//         System.out.println(bike.wheels);
//         System.out.println(bike.pedals);
//         System.out.println(car.doors);
//         System.out.println(car.wheels);
//     }
// }

// import Overriding.Animal;
// import Overriding.Dog;

// public class Main {
//     public static void main(String[] args) {

//         Animal animal = new Animal();
//         Dog dog = new Dog();

//         dog.speak();
//         animal.speak();

//     }
// }

// import Super_Keyword.Hero;

// public class Main {
//     public static void main(String[] args) {

//         Hero hero1 = new Hero("Batman", 30, "$$$$");
//         Hero hero2 = new Hero("Spiderman", 33, "%$#@");

//         // System.out.println(hero1.name);
//         // System.out.println(hero1.age);
//         // System.out.println(hero1.power);

//         // System.out.println(hero2.name);
//         // System.out.println(hero2.age);
//         // System.out.println(hero2.power);

//         System.out.println(hero1);
//         System.out.println(hero2);
//     }
// }

// import Abstraction.Car;
// import Abstraction.Vehicle;

// public class Main {
//     public static void main(String[] args) {

//         Car car = new Car();
//         // Vehicle vehicle = new Vehicle();
//         // now i can not create the instance of the class is its abstrat

//         car.go();
//     }
// }

// import Encapsulation.Car;

// public class Main {
//     public static void main(String[] args) {

//         //     Car car = new Car();
//         //     car.setName("BMW");
//         //     car.setYear(2021);

//         //     System.out.println(car.getName());
//         //     System.out.println(car.getYear());
//         // }

//         Car car = new Car("BMW", 2021);
//         // System.out.println(car);  // with toString method
//         // System.out.println(car.getName());
//         // System.out.println(car.getYear());
//     }
// }

// import Copy_Objects.Car;

// public class Main {
//     public static void main(String[] args) {

//         //     Car car = new Car();
//         //     car.setName("BMW");
//         //     car.setYear(2021);

//         //     System.out.println(car.getName());
//         //     System.out.println(car.getYear());
//         // }

//         Car car1 = new Car("BMW", 2021);
//         // Car car2 = new Car("Mustang", 2021);

//         // car2 = car1;  same reference // shallow copy
//         // car2.copy(car1);  // same value but differ reference
//         Car car2 = new Car(car1);   // Deep copy

//         System.out.println(car1);
//         System.out.println(car2);
//         System.out.println();
//         System.out.println(car1.getName());
//         System.out.println(car1.getYear());
//         System.out.println();
//         System.out.println(car2.getName());
//         System.out.println(car2.getYear());
//     }
// }

// import Interfaces.Fish;
// import Interfaces.Hawk;
// import Interfaces.Rabbit;

// public class Main {
//     public static void main(String[] args) {

//         Rabbit rabbit = new Rabbit();
//         Hawk hawk = new Hawk();
//         Fish fish = new Fish();

//         rabbit.flee();
//         hawk.hunt();
//         fish.flee();
//         fish.hunt();
//     }
// }

// import Polymorphism.Bicycle;
// import Polymorphism.Boat;
// import Polymorphism.Car;
// import Polymorphism.Vehicle;

// public class Main {
//     public static void main(String[] args) {

//         Car car = new Car();
//         Bicycle bicycle = new Bicycle();
//         Boat boat = new Boat();

//         Vehicle[] racers = { car, bicycle, boat };

//         for(Vehicle x : racers){
//             x.go();
//         }
//     }
// }

// import java.util.Scanner;
// import Dynamic_Polymorphism.Animal;
// import Dynamic_Polymorphism.Cat;
// import Dynamic_Polymorphism.Dog;

// public class Main {
//     public static void main(String[] args) {

//         // Animal animal1 = new Dog();
//         // Animal animal2 = new Cat();
//         // animal1.sound();
//         // animal2.sound();

//         Scanner scanner = new Scanner(System.in);
//         Animal animal;
//         System.out.println("1- Dog" + "\n" + "2- Cat");
//         int choice = scanner.nextInt();

//         if (choice == 1) {
//             animal = new Dog();
//             animal.sound();
//         } else if (choice == 2){
//             animal = new Cat();
//             animal.sound();
//         } else {
//             animal = new Animal();
//             animal.sound();
//         }

//     }
// }