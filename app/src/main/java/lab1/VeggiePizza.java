package lab1;

public abstract class VeggiePizza extends Pizza {
    @Override
    public String[] createToppings() {
        return new String[]{"champiñones", "pimientos", "aceitunas"};
    }
}
