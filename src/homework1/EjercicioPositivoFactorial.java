package homework1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author sanchezyander
 * Primer Parcial – Yander Sanchez
 * Mat. 2020-30-3-0021
 * UNICDA
 * Docente: Yessi Jimenez
 */
public class EjercicioPositivoFactorial implements Exercise {

    @Override
    public String getName() {
        return "Determine si un número es positivo, negativo o cero y si es positivo que calcule el factorial de un número entero positivo";
    }

    @Override
    public void run(Scanner in) {
        System.out.print("Introduce un número entero: ");
        String input = in.nextLine().trim();

        try {
            int numero = Integer.parseInt(input);

            if (numero > 0) {
                System.out.println(numero + " es un número positivo.");
                BigInteger factorial = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es: " + factorial);
            } else if (numero < 0) {
                System.out.println(numero + " es un número negativo.");
            } else {
                System.out.println("El número es cero.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir un número entero.");
        }
    }

    /** calcular el factorial de un número entero positivo */
    private BigInteger calcularFactorial(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}