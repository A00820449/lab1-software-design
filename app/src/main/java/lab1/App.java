package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String storeOption = "";
        if (args.length > 0) {
            storeOption = args[0];
        }

        PizzaStore factory = null;
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

        Scanner s = new Scanner(System.in);
        System.out.println("Escribe tu orden:");
        String answer = s.nextLine().toLowerCase();

        Pizza p = factory.orderPizza(answer);

        if (p != null) {
            System.out.println("Listo!");
        }
        s.close();
    }
}
