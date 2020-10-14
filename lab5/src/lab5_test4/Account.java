package lab5_test4;

public class Account {
    private int id;
    private TheCustomer Customer;
    private double balance=0.0;
    public Account(int id,TheCustomer Customer,double balance){
        this.id=id;
        this.Customer=Customer;
        this.balance=balance;

    }
    public Account(int id,TheCustomer Customer){
        this.id=id;
        this.Customer=Customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TheCustomer getCustomer() {

        return Customer;
    }

    public void setCustomer(TheCustomer customer) {
        Customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance,double amount) {
        this.balance = balance;
        this.balance=amount;
    }

    @Override
    public String toString() {
        return Customer +" $("+ balance+ ")";
    }
    String getCustomerName(){
        throw new UnsupportedOperationException("Not Supported yet: ");
    }
    public Account withDraw(double amount ){
        this.balance=amount;
        if(balance>=amount) {
            System.out.println("Subtract Amount to balance");
        }else{
            System.out.println("Amount Withdrawn");
        }
        return this;
    }
}
