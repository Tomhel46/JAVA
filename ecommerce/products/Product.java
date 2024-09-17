package ecommerce.products;

public class Product {
    String name;
    String pro_id;
    int price;
      public Product(String name,String pro_id,int price)
     {
        this.name=name;
        this.pro_id=pro_id;
        this.price=price;

     }
     public void details()
     {
      System.out.printf("Product Name :%s\nProduct ID :%s\nProduct Price :%d\n",name,pro_id,price);
     } 
     public String getname()
     {
        return name;
     }
    
}
