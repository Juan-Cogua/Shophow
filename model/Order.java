package shophow.model;
import java.util.ArrayList;

public class Order {
    
    private String orderId;
    private arraylist<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.array.products = new arraylist<>();
    }

    // Metodods 
    public void AddProduct(Product newproduct){
        this.products.add(newproduct);
    }
    public double TotalCost(){
        double total = 0.0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

}