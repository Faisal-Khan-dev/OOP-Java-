public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Delhi");
        Person p1 = new Person("John", a1);
        Person p2 = p1.clone(); // shallow copy

        p2.address.city = "Mumbai"; // change city using p2
        System.out.println(p1.address.city); // also "Mumbai"
    }
}
  
