
package shophow;

import shophow.model.Customer;
import shophow.model.Product;
public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer("Andres Vargas","andrescamilo.vargas@uptc,edu,co");
        Product product = new Product("Laptop",2500.0);
        customer.shophowInfo();
        product.shophowInfo();
    }
}
