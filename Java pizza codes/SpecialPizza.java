class SpecialPizza extends Pizza {
    private String specialToppings;
    public SpecialPizza(String name, String size, double price, String specialToppings) {
        super(name, size, price);
        this.specialToppings = specialToppings;
    }
    public String getSpecialToppings() {
        return specialToppings;
    }
    public void setSpecialToppings(String specialToppings) {
        this.specialToppings = specialToppings;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Special Toppings: " + specialToppings);
    }
}
