package lab1;

public class VeganPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Poniendo salsa, queso vegano, pimientos, y champiñones...");
    }
}
