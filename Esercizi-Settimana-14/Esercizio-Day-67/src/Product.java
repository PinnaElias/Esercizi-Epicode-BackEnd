public class Product {

    protected String name;
    protected Double price;
    protected String category;

    public Product(String category, String name, double price) {
    }

    public void product(String category, String name, Double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getName () {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}
