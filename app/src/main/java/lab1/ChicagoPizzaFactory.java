package lab1;

public class ChicagoPizzaFactory extends PizzaFactory {
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
        System.out.println("Preparando pizza vegetariana estilo Chicago...");
        VeggiePizza p = new ChicagoVeggiePizza();
        return p;
    }
}
