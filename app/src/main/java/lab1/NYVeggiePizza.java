package lab1;

public class NYVeggiePizza extends VeggiePizza {
    @Override
    public String createCheese() {
        return "un poco de queso";
    }

    @Override
    public String createSauce() {
        return "salsa estilo New York";
    }

    @Override
    public String createDough() {
        return "masa delgada";
    }
}
