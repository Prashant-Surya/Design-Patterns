package MementoPattern;

public class Main {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Customer customer = new Customer(101, "Sachin", "Primary", true);
        customer.setCareTaker(careTaker);
        Customer customer1 = new Customer(102, "Saurav", "Secondary", false);
        customer1.setCareTaker(careTaker);

        Product product = new Product(1001, "Home Loan");
        product.setCareTaker(careTaker);
        Product product1 = new Product(1002, "Business Loan");
        product1.setCareTaker(careTaker);

        System.out.println(customer);
        System.out.println(customer1);
        System.out.println(product);
        System.out.println(product1);
        System.out.println("------------State Stored -------------");
        customer.hydrate();
        customer1.hydrate();
        product.hydrate();
        product1.hydrate();


        customer.setName("Tendulkar");
        customer.setActive(false);

        customer1.setName("Ganguly");
        customer1.setType("Primary");

        product.setName("Personal Loan");
        product1.setId(2002);

        System.out.println("-------------State Before State Reset ---------------------");
        System.out.println(customer);
        System.out.println(customer1);
        System.out.println(product);
        System.out.println(product1);

        customer.dehydrate();
        customer1.dehydrate();
        product.dehydrate();
        product1.dehydrate();
        System.out.println("-------------State After State Reset ---------------------");
        System.out.println(customer);
        System.out.println(customer1);
        System.out.println(product);
        System.out.println(product1);

    }
}
