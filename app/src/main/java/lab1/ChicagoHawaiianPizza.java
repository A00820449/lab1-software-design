package lab1;

public class ChicagoHawaiianPizza extends HawaiianPizza {
    @Override
    public String createDough() {
        return "masa gruesa";
    }

    @Override
    public String createSauce() {
        return "mucha salsa";
    }

    @Override
    public String createCheese() {
        return "mucho queso";
    }
}
