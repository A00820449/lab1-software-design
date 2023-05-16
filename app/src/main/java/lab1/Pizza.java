package lab1;

public abstract class Pizza {
    private String name;

    protected String dough;
    protected String sauce;
    protected String cheese;
    protected String[] toppings;

    abstract void prepare();

    public void cook() {
        System.out.println("Poniendo en el horno...");
    }

    public void slice() {
        System.out.println("Cortando en rebanadas...");
    }

    public void box() {
        System.out.println("Poniendo en la caja...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return  "Masa: " + dough + '\n' + 
                "Salsa: " + sauce + '\n' +
                "Queso: " + cheese + '\n' +
                "Ingredientes: " + String.join(", ", toppings);
    }
}
