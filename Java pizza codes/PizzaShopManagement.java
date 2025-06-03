public class PizzaShopManagement {
    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop(5);
        shop.addPizza(new Pizza("Margherita", "Medium", 760));
        shop.addPizza(new Pizza("Pepperoni", "Large", 980));
        shop.addPizza(new SpecialPizza("BBQ Chicken", "Large", 1270, "BBQ Sauce, Chicken"));
        shop.addPizza(new SpecialPizza("Veggie Supreme", "Medium", 1300, "Olives, Bell Peppers, Mushrooms"));
        shop.displayMenu();
    }
}