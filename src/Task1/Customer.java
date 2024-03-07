package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String username) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + "\nUsername: " + getUsername() + "\nid: " + getId();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public int getId() {
        return this.id;
    }
}



