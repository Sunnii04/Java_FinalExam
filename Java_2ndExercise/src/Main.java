interface DiscountRate {
    double getServiceMemDiscount();
    double getProductMemDiscount();
}
class Customer implements DiscountRate {
    private String cusName;
    private String cusType;

    public Customer(String customerName, String customerType) {
        this.cusName = customerName;
        this.cusType = customerType;
    }

    public String getCustomerName() {
        return cusName;
    }

    public void setCustomerName(String customerName) {
        this.cusName = customerName;
    }

    public String getCustomerType() {
        return cusType;
    }

    public void setCustomerType(String customerType) {
        this.cusType = customerType;
    }

    @Override
    public double getServiceMemDiscount() {
        switch (cusType) {
            case "Premium": return   0.20;
            case "Gold": return   0.15;
            case "Silver": return   0.10;
            default: return   0.00;
        }
    }

    @Override
    public double getProductMemDiscount() {
        return   0.10;
    }
}


class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Date: " + date);
        System.out.println("Service Expense: " + serviceExpense);
        System.out.println("Product Expense: " + productExpense);
        System.out.println("Total Expense: " + getTotalExpense());
    }
}

public class Main {
    public static void main(String[] args) {
       
    }
}
