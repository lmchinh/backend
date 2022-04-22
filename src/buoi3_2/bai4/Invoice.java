package buoi3_2.bai4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }
    public String getCustomerName() {
        return this.customer.getName();
    }
    public int getCustomerDiscount() {
        return this.customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return this.amount - (this.amount * this.getCustomerDiscount()/100);
    }

    public String toString() {
        StringBuffer temp = new StringBuffer();
        temp.append(String.format("Invoice[id=%d,customer=",this.id));
        temp.append(this.customer.toString());
        temp.append(String.format(",amount=%.1f]",this.amount));
        return temp.toString();
    }
}
