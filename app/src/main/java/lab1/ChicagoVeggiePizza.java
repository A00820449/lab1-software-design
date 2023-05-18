package lab1;

public class ChicagoVeggiePizza extends VeggiePizza{
    @Override
    public String createDough() {
        return "masa gruesa";
    }

    @Override
    public String createSauce() {
        return "mucha salsa";
    }

    @Override
    public String createCheese() {
        return "mucho queso";
    }
}
