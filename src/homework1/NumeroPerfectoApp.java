package homework1;

import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class NumeroPerfectoApp implements Exercise{

    @Override
    public String getName() {
        return "Verificar si un número es Perfecto";
    }

    @Override
    public void run(Scanner in) {
        System.out.print("Introduce un número entero positivo: ");
        String input = in.nextLine().trim();

        try {
            int numero = Integer.parseInt(input);
            if (numero <= 0) {
                System.out.println("Debes escribir un número mayor que 0.");
                return;
            }

            if (esPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " NO es un número perfecto.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir un número entero.");
        }
    }

    private boolean esPerfecto(int numero) {
        int divisor = 1;
        int suma = 0;

        // usamos do-while para recorrer divisores
        do {
            if (numero % divisor == 0) {
                suma += divisor;
            }
            divisor++;
        } while (divisor <= numero / 2); 
        // no hace falta llegar hasta "numero" porque ningún divisor propio es igual al número

        return suma == numero;
    }
    
}
