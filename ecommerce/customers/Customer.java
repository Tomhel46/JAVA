package ecommerce.customers;

public class Customer {
    String name;
    String pro_name;
    int ph_number;
    public Customer(String name,String pro_name,int ph_number)
    {
        this.name=name;
        this.ph_number=ph_number;
        this.pro_name=pro_name;
    }
    public void customer_details()
    {
        System.out.printf("Customer Name :%s\nProduct Name :%s\nContact Number%d",name,pro_name,ph_number);
    }
}
