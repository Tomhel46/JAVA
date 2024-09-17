import ecommerce.customers.Customer;
import ecommerce.orders.Orders;
import ecommerce.products.Product;
public class Ecommerce {
    public static void main(String[] args) {

        Product s0 = new Product("Mobile", "AX1285", 25000);
        Orders s1 = new Orders("Mobile", "AX1285", 25000);
        Customer s2 = new Customer("Ash", "Mobile", 967845512);
        s0.details();
        s1.Order_details();
        s2.customer_details();
    }
    
}
