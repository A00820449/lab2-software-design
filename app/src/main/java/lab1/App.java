package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Beverage b = null;
        String option = null;
        String[] adds = null;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Escribre tu orden");

        option = s.nextLine().replaceAll("\\s+", "");

        if (option.equalsIgnoreCase("darkroast")) {
            b = new DarkRoast();
        }
        else if (option.equalsIgnoreCase("houseblend")) {
            b = new HouseBlend();
        }
        else if (option.equalsIgnoreCase("espresso")) {
            b = new Espresso();
        }
        else if (option.equalsIgnoreCase("decaf")) {
            b = new Decaf();
        }
        else {
            s.close();
            throw new Exception("Opcion invalida");
        }

        System.out.println("Aditamentos:");
        System.out.println("1 Leche.");
        System.out.println("2 Soya.");
        System.out.println("3 Café moca.");
        System.out.println("4 Crema batida.");

        System.out.println("Escribe tu lista de aditamentos (separados por espacio):");
        adds = s.nextLine().trim().split("\\s+");

        for (String add: adds) {
            Integer i = 0;
            try {
                i = Integer.parseInt(add);
            }
            catch (NumberFormatException e) {
                s.close();
                throw new Exception("Opcion invalida");
            }
            
            if (i == 1) {
                b = new MilkDecorator(b);
            }
            else if (i == 2) {
                b = new SoyDecorator(b);
            }
            else if (i == 3) {
                b = new MochaDecorator(b);
            }
            else if (i == 4) {
                b = new WhipDecorator(b);
            }
            else {
                s.close();
                throw new Exception("Opcion invalida");
            }
        }

        b.prepare();

        s.close();

    }
}
