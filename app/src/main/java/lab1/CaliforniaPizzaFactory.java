package lab1;

public class CaliforniaPizzaFactory extends PizzaFactory {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo California...");
        CheesePizza p = new CaliforniaCheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo California...");
        HawaiianPizza p = new CaliforniaHawaiianPizza();
        return p;
    }

    @Override
    public VeggiePizza createVeggiePizza() {
        System.out.println("Preparando pizza vegetariana estilo California...");
        VeggiePizza p = new CaliforniaVeggiePizza();
        return p;
    }
}
