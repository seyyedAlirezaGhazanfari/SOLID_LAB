import java.util.ArrayList;

public class Order {
    String customerName;
    ArrayList<Product> foods = new ArrayList<>();

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addItem(Product food) {
        this.foods.add(food);
    }

    public int getTotalPrice() {
        int price = this.foods.stream().mapToInt(food -> food.getPrice()).sum();
        return price;
    }

    @Override
    public String toString() {
        String orders = "";
        for (Product food : this.foods) {
            orders += food.getFoodName() + " -> " + food.getPrice() + "\n";
        }
        return "Customer : " + customerName + "\nOrders are : \n" + orders + "\nTotal Price : " + this.getTotalPrice();
    }
}
