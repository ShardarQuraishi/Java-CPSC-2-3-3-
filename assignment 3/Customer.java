/**
 * This class creates a customer object with a name and ID.
 * It is linked to the BankAccount class.
 */
public class Customer {
    //instance variables for customers' name and ID.
    private String name;
    private int customerID;

    /**
     * Setter method for customer's name.
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Setter method for customer's ID.
     * @param customerID
     */
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    /**
     * Getter method for customer's name.
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Getter method for customer's ID.
     * @return customerID
     */
    public int getID(){
        return customerID;
    }

    /**
     * Method provides a string representation of the instance variables.
     * @return name
     * @return customerID
     */
    @Override
    public String toString(){
        return "Name: " + this.name + ", "
                + "ID: " + this.customerID;
    }

    /**
     * Default constructor.
     */
    Customer(){
    }

    /**
     * Parameterized constructor for the Customer class.
     * @param cName The customer's name
     * @param cID The customer's ID
     */
    Customer(String cName, int cID){
        name = cName;
        customerID = cID;
    }

    /**
     * Copy constructor of the Customer class.
     * @param customerToCopy
     */
    Customer(Customer customerToCopy){
        //Copies the customer's name
        setName(customerToCopy.name);
	//Copies the customer's ID
        setCustomerID(customerToCopy.customerID);
    }

    /**
     * Main method which is used to run code from multiple classes.
     * @param args Unused.
     */
    public static void main(String[] args){
        Customer c1 = new Customer("Alison Brown", 123);
        BankAccount b1 = new BankAccount(c1, 100.00);

        Customer c2 = b1.getCustomer();
        c2.setName("Charles Green");
        System.out.println(c1);
        System.out.println(c2);

        Customer c3 = c1;
        c3.setName("Eva White");
        System.out.println(b1.getCustomer());
        System.out.println(c3);
    }
}
