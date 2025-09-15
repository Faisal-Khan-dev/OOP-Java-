class Address {
    String city;
    Address(String city) { 
        this.city = city; 
        }
}


// class Address implements Cloneable {
//     String city;

//     Address(String city) {
//         this.city = city;
//     }

//     public Address clone() {
//         try {
//             return (Address) super.clone(); // copy Address too
//         } catch (CloneNotSupportedException e) {
//             throw new RuntimeException(e);
//         }
//     }
// }