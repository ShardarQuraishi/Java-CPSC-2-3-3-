/**
 * This class creates a customer object with a name and ID.
 * It is linked to the BankAccount class.
 */
public class Customer {
    //instance variables for customers' name and ID.
    private String name;
    private int id;

    /**
     * Parameterized constructor which takes in two parameters.
     * @param name The customer's name
     * @param id The customer's ID
     */
    public Customer(String name, int id){
        this.name = name;
        this.id = id;
    }

    /**
     * Copy constructor.
     * @param oldCustomer.
     */
    public Customer(Customer oldCustomer){
        setName(oldCustomer.name);
        setID(oldCustomer.id);
    }

    /**
     * Setter method for customer's name.
     * @param newName
     */
    public void setName(String newName){
        this.name = newName;
    }

    /**
     * Setter method for customer's ID.
     * @param id
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     * Getter method for customer's name.
     * @return name.
     */
    public String getName(){
        return name;
    }

    /**
     * Getter method for customer's ID.
     * @return id.
     */
    public int getID(){
        return id;
    }

    /**
     * Method provides a string representation of the instance variables.
     * @return name
     * @return id
     */
    @Override
    public String toString(){
        return "Name: " + this.name + ", "
                + "ID: " + this.id;
    }

}
