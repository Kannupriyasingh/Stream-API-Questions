// Given a Product class with attributes: id (int), name (String), price (double), and category (String).
// Create a list of products.
// Implement the following functionalities :
// 1) Print the names of products whose price is below a certain threshold (e.g., 100).
// 2) Create a new list containing products with a price reduction of 20%.
// 3) Calculate the average price of all products.
// 4) Find the product with the lowest price using Stream API.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    Double price;
    String category;
    
    public Product(int id, String name, Double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
    }
}

public class Question45 {
    public static void main(String[] args) {
       List<Product> products = Arrays.asList(
            new Product(101, "Laptop", 75000.00, "Electronics"),
            new Product(102, "Smartphone", 30000.00, "Electronics"),
            new Product(103, "Desk Chair", 4500.00, "Furniture"),
            new Product(104, "Monitor", 15000.00, "Electronics"),
            new Product(105, "Bookshelf", 3500.00, "Furniture"),
            new Product(106, "Pen", 50.00, "Stationery"),
            new Product(107, "Notebook", 150.00, "Stationery"),
            new Product(108, "Tablet", 20000.00, "Electronics")
        );

        // 1) Print the names of products whose price is below a certain threshold (e.g., 100).
        int threshold = 1000;
        List<String>nameOfProduct = products.stream()
                                            .filter(p->p.getPrice()<threshold)
                                            .map(Product::getName)
                                            .collect(Collectors.toList());
        System.out.println(nameOfProduct);

        // 2) Create a new list containing products with a price reduction of 20%.
        List<Product> reducedPrice = products.stream()
                                            .map(
                                                product-> {
                                                    double discountedPrice = product.getPrice()*0.8;
                                                    product.setPrice(discountedPrice);
                                                    return product;
                                                }
                                            )
                                            .collect(Collectors.toList());
        System.out.println(reducedPrice);

        // 3) Calculate the average price of all products.
        OptionalDouble averagePrice = products.stream()
                                            .mapToDouble(Product::getPrice)
                                            .average();
        System.out.println(averagePrice);


        // 4) Find the product with the lowest price using Stream API.
        Optional<Product> lowestPriceProduct = products.stream()
                                            .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        System.out.println(lowestPriceProduct);
    }
}
