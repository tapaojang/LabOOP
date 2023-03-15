package pack7a;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product product, int price) { //pricelist
        productList.put(product.getpName(), product);
        priceList.put(product.getpName(), price);
    }

    public void showCatalog() {
        for(String entry : productList.keySet()){
            System.out.println(this.getProduct(entry).getpName() +" @ "+ this.getPrice(entry));
        }
    }

    public int getPrice(String productName) {
        int price = priceList.get(productName);
        return price;
    }

    public Product getProduct(String productName) {
        return productList.get(productName);
    }
}
