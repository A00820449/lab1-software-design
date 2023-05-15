package lab1;

public class CaliforniaPizzaFactory extends PizzaStore {
    @Override
    public CheesePizza createCheesePizza() {
        System.out.println("Preparando pizza de queso estilo California...");
        CheesePizza p = new CheesePizza();
        return p;
    }

    @Override
    public HawaiianPizza createHawaiianPizza() {
        System.out.println("Preparando pizza Hawaiiana estilo California...");
        HawaiianPizza p = new HawaiianPizza();
        return p;
    }

    @Override
    public VeganPizza createVeganPizza() {
        System.out.println("Preparando pizza vegana estilo California...");
        VeganPizza p = new VeganPizza();
        return p;
    }
}
