package sec11;

public class DishDemo {
    public static void main(String[] args) {
        final Dish dish = new Dish();
        new Thread(new Customer(dish)).start();
        new Thread(new Cook(dish)).start();
    }
}
