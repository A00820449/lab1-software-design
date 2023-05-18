package lab1;

public class CaliforniaHawaiianPizza extends HawaiianPizza{
    @Override
    public String createDough() {
        return "masa normal";
    }

    @Override
    public String createSauce() {
        return "salsa de tomate";
    }

    @Override
    public String createCheese() {
        return "queso normal";
    }
}
