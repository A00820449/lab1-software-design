package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String storeOption = "";
        if (args.length > 0) {
            storeOption = args[0];
        }

        PizzaFactory factory = null;
        if (storeOption.equalsIgnoreCase("ny")) {
            factory = new NYPizzaFactory();
        }
        else if (storeOption.equalsIgnoreCase("chicago")) {
            factory = new ChicagoPizzaFactory();
        }
        else if (storeOption.equalsIgnoreCase("california")) {
            factory = new ChicagoPizzaFactory();
        }
        else {
            System.err.println("Sucursal invalida");
            return;
        }
        PizzaStore store = new PizzaStore(factory);

        Scanner s = new Scanner(System.in);
        System.out.println("Escribe tu orden:");
        String answer = s.nextLine().toLowerCase();
        s.close();

        Pizza p = store.orderPizza(answer);

        if (p != null) {
            System.out.println("Pizza lista!");
            System.out.println(p.toString());
        }
    }
}
