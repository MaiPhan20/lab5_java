package lab5_test3;

public class Invoice {
    private int ID;
    private TheCustomer Customer;
    private double amount;
    public Invoice(int ID,TheCustomer Customer,double amount){
        this.ID=ID;
        this.Customer=Customer;
        this.amount=amount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public TheCustomer getCustomer() {
        return Customer;
    }

    public void setCustomer(TheCustomer customer) {
        Customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "ID=" + ID +
                ", Customer=" + Customer +
                ", amount=" + amount +
                '}';
    }
    String getCustomerName(){
        throw new UnsupportedOperationException("Not");
    }
    public double getAmountAfterDiscount(double amount,int discount){
        double ad = amount-(amount*discount/100);
        return Math.abs(ad);
    }
}
