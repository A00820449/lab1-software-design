package lab1;

public class NYPizzaFactory extends PizzaFactory {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo NY...");
        CheesePizza p = new NYCheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo NY...");
        HawaiianPizza p = new NYHawaiianPizza();
        return p;
    }

    @Override
    public VeggiePizza createVeggiePizza() {
        System.out.println("Preparando pizza vegetariana estilo NY...");
        VeggiePizza p = new NYVeggiePizza();
        return p;
    }
}