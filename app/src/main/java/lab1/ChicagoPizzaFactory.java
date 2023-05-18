package lab1;

public class ChicagoPizzaFactory extends PizzaStore {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo Chicago...");
        CheesePizza p = new ChicagoCheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo Chicago...");
        HawaiianPizza p = new ChicagoHawaiianPizza();
        return p;
    }

    @Override
    public VeggiePizza createVeggiePizza() {
        System.out.println("Preparando pizza vegana estilo Chicago...");
        VeggiePizza p = new ChicagoVeggiePizza();
        return p;
    }
}
