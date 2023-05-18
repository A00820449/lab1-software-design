package lab1;

public abstract class Pizza {
    public String dough;
    public String sauce;
    public String cheese;
    public String name;
    public String[] toppings;

    public void prepare() {
        dough = createDough();
        sauce = createSauce();
        cheese = createCheese();
        toppings = createToppings();
    }

    public abstract String createCheese();

    public abstract String createSauce();

    public abstract String createDough();

    public abstract String[] createToppings();
    
    public void slice() {
        System.out.println("Cortando pizza en rebanadas...");
    }

    public void cook() {
        System.out.println("Poniendo pizza en el horno...");
        for (int i = 0; i < 1000000; i++) {}
    }

    public void box() {
        System.out.println("Poniendo pizza en su caja...");
    }

    public String toString() {
        return  "Nombre: " + name + '\n' +
                "Masa: " + dough + '\n' +
                "Salsa: " + sauce + '\n' +
                "Queso: " + cheese + '\n' +
                "Ingredientes: " + String.join(", ", toppings);
    }
}
