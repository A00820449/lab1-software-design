package lab1;

public abstract class HawaiianPizza extends Pizza {
    @Override
    public String[] createToppings() {
        return new String[]{"jamón", "piña"};
    }
}
