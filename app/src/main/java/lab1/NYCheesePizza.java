package lab1;

public class NYCheesePizza extends CheesePizza {
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
