public class Main {
    public static void main(String[] args){


        User user1 = new User("Sıla", "silainal@gmail.com", 170304);
        Product product1 = new Product("Apple", 15000, "Computer");

        User user2  = new User("Miraç", "miracinal@gmail.com", 170223);
        Product product2 = new Product("Samsung", 10000, "Phone");

        User user3 = new User("Hazal", "hazalinal@gmail.com", 150618);
        Product product3 = new Product("Huawei", 9000, "Tablet");

        user1.displayInfo();
        product1.displayInfo();

        user2.displayInfo();
        product2.displayInfo();

        user3.displayInfo();
        product3.displayInfo();

        user1.changeEmail("silainal@gmail.com");
        user1.changeEmail("silainal0@gmail.com");
        user1.displayInfo();

        product2.displayInfo();
        product2.applyDiscount(10);
        product2.displayInfo();
    }
}
