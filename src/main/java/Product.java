public class Product {
    private String name, category, author, color;
    private double price;
    private int quantity;
    private char size;


    public Product(String name, double price,String category, int quantity, char size, String color) {
        this.name = name;
        this.category = category;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
    }

    public Product(String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, String category,  int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public boolean buy() {
        if (quantity>0) {
            quantity--;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", size=" + size +
                '}';
    }
}
