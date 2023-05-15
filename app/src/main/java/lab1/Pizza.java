package lab1;

public abstract class Pizza {
    public abstract void prepare();
    
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
}
