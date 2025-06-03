class PizzaShop {
    private Pizza[] menu;
    private int pizzaCount;
    public PizzaShop(int capacity) {
        menu = new Pizza[capacity];
        pizzaCount = 0;
    }
    public void addPizza(Pizza pizza) {
        if (pizzaCount < menu.length) {
            menu[pizzaCount++] = pizza;
        } else {
            System.out.println("Menu is full, cannot add more pizzas.");
        }
    }
    public void displayMenu() {
        System.out.println("Pizza Shop Menu:");
        for (int i = 0; i < pizzaCount; i++) {
            menu[i].displayDetails();
            System.out.println();
        }
    }
}
