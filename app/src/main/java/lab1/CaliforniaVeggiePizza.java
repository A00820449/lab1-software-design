package lab1;

public class CaliforniaVeggiePizza extends VeggiePizza{
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
