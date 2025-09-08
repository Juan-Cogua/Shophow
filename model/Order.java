package shophow.model;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Order {
    
    private String orderId;
    private List<Product> products = new arraylist<>();
    LocalDateTime buyDate;

    public Order (int orderId){
        this.orderId = orderId;
        this.buyDate = LocalDateTime.now();
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
    public void showOrder(){
        System.out.println("Pedido #"+orderId);
        for (Product p : products){
            System.out.println(" - "+p.getPtice());
        }
        System.out.println("Total: $"+TotalCost()+"La fecha maxima del pago de su orden es:"+buyDate.plusHours(24));
    }
}