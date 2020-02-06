package FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sachin", "India", "Male", "Hindu",
                "45", "101");
        Customer customer1 = new Customer("Rahul", "India", "Male", "Hindu",
                "42", "102");
        Customer customer2 = new Customer("Monty", "England", "Male", "Hindu",
                "50", "103");
        Customer customer3 = new Customer("VVS", "India", "Male", "Hindu",
                "45", "104");
        Customer customer4 = new Customer("Irfan", "India", "Male", "Muslim",
                "45", "105");
        Customer customer5 = new Customer("Raju", "India", "Male", "Hindu",
                "60", "106");

        Customer[] customers = {customer, customer1, customer2, customer3, customer4, customer5};

        for(Customer c: customers) {
            System.out.println(c);
        }

        System.out.println("Customers count: " + Customer.count);
        System.out.println("NGR Count: " + NGR.count );

    }
}
