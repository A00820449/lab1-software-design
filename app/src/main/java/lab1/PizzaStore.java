package lab1;

public class PizzaStore {
    PizzaFactory f;
    PizzaStore(PizzaFactory f) {
        this.f = f;
    }

    public Pizza orderPizza(String request) {
        Pizza p = null;
        if (request.equalsIgnoreCase("cheese")) {
            p = f.createCheesePizza();
        }
        else if (request.equalsIgnoreCase("veggie")) {
            p = f.createVeggiePizza();
        }
        else if (request.equalsIgnoreCase("hawaiian")) {
            p = f.createHawaiianPizza();
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
