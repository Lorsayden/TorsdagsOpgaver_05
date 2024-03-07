package Task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer c1 = new Customer("Robert", "Jensen", "BOBBYBOY1991");
        Customer c2 = new Customer("Magnus", "Larson", "MagnusMissen");
        Customer c3 = new Customer("Richard", "Rich", "richDICK");
        Customer c4 = new Customer("Lasse", "Jensen", "KageManden");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        printCustomers(customers);
    }

    static void printCustomers(ArrayList<Customer> customers){
        for(Customer element : customers) {
            System.out.println(element);
        }
    }
}
