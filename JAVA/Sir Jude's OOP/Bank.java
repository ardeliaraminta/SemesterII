import java.util.ArrayList;
public class Bank {

    private ArrayList<Customer> customer;
    private int numberCustomers;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
        this.numberCustomers = 0;
        this.customer = new ArrayList<Customer>();
    }

    public String getBankName() {
        return bankName;
    }

    public void addCustomer(String f, String l){
        this.numberCustomers++;
        Customer newCustomer = new Customer(f, l);
        customer.add(newCustomer);
    }

    public int getNumOfCustomers(){
        return this.numberCustomers;
    }

    public Customer getCustomer(int index){
        return customer.get(index);
    }


}
