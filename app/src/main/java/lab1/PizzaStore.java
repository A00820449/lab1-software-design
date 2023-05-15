package lab1;

public abstract class PizzaStore {
    public Pizza orderPizza(String request) {
        Pizza p = null;
        if (request.equalsIgnoreCase("cheese")) {
            p = createCheesePizza();
        }
        else if (request.equalsIgnoreCase("vegan")) {
            p = createVeganPizza();
        }
        else if (request.equalsIgnoreCase("hawaiian")) {
            p = createHawaiianPizza();
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

    public abstract CheesePizza createCheesePizza();
    public abstract VeganPizza createVeganPizza();
    public abstract HawaiianPizza createHawaiianPizza();
}
