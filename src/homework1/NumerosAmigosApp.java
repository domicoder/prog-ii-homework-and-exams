package homework1;

import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class NumerosAmigosApp implements Exercise {
    
    @Override
    public String getName() {
        return "Verificar si dos números son Amigos";
    }

    @Override
    public void run(Scanner in) {
        System.out.print("Introduce el primer número entero positivo: ");
        String input1 = in.nextLine().trim();
        System.out.print("Introduce el segundo número entero positivo: ");
        String input2 = in.nextLine().trim();

        try {
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Debes introducir números enteros positivos.");
                return;
            }

            if (sonAmigos(num1, num2)) {
                System.out.println(num1 + " y " + num2 + " son números amigos.");
            } else {
                System.out.println(num1 + " y " + num2 + " NO son números amigos.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir números enteros.");
        }
    }

    /** Calcula la suma de divisores propios de un número */
    private int sumaDivisores(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    /** Verifica si dos números son amigos */
    private boolean sonAmigos(int a, int b) {
        return sumaDivisores(a) == b && sumaDivisores(b) == a;
    }
    
}
