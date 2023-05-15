package lab1;

public class NYPizzaFactory extends PizzaStore {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo NY...");
        CheesePizza p = new CheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo NY...");
        HawaiianPizza p = new HawaiianPizza();
        return p;
    }

    @Override
    public VeganPizza createVeganPizza() {
        System.out.println("Preparando pizza vegana estilo NY...");
        VeganPizza p = new VeganPizza();
        return p;
    }
}