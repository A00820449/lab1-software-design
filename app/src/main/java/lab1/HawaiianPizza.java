package lab1;

public class HawaiianPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Poniendo salsa, queso, jamón, y piña...");
    }
}
