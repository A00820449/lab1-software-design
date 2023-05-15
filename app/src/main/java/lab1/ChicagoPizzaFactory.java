package lab1;

public class ChicagoPizzaFactory extends PizzaStore {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo Chicago...");
        CheesePizza p = new CheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo Chicago...");
        HawaiianPizza p = new HawaiianPizza();
        return p;
    }

    @Override
    public VeganPizza createVeganPizza() {
        System.out.println("Preparando pizza vegana estilo Chicago...");
        VeganPizza p = new VeganPizza();
        return p;
    }
}
