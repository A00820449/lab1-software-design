package lab1;

public class PizzaStore {
    private PizzaFactory factory;
    PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String request) {
        Pizza p = null;
        if (request.equalsIgnoreCase("cheese")) {
            p = factory.createCheesePizza();
        }
        else if (request.equalsIgnoreCase("veggie")) {
            p = factory.createVeggiePizza();
        }
        else if (request.equalsIgnoreCase("hawaiian")) {
            p = factory.createHawaiianPizza();
        }
        else {
            System.err.println("Error: Pizza invalida...");
            return null;
        }

        p.prepare();
        p.cook();
        p.slice();
        p.box();
        return p;
    }
}
