package ecommerce.orders;
import ecommerce.products.*;

public class Orders extends Product {
    public Orders(String name, String pro_id, int price) {
        super(name, pro_id, price);
        //TODO Auto-generated constructor stub
    }
    public void Order_details()
    {
        System.out.printf("Product Name :%s\n",getname());
        System.out.println("Delivered");
    }
    
}
