package lab1;

public class CaliforniaCheesePizza extends CheesePizza {
    @Override
    public String createDough() {
        return "masa normal";
    }

    @Override
    public String createSauce() {
        return "salsa de tomate";
    }

    @Override
    public String createCheese() {
        return "queso normal";
    }
}
