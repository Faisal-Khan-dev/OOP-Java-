
class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person clone() {
        try {
            return (Person) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}






// class Person implements Cloneable {
//     String name;
//     Address address;

//     Person(String name, Address address) {
//         this.name = name;
//         this.address = address;
//     }

//     public Person clone() {
//         try {
//             Person copy = (Person) super.clone(); // shallow copy
//             copy.address = this.address.clone(); // deep copy address
//             return copy;
//         } catch (CloneNotSupportedException e) {
//             throw new RuntimeException(e);
//         }
//     }
// }
