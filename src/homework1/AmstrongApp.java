/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class AmstrongApp implements Exercise {
    @Override
    public String getName() {
        return "Verificar si un número es de Armstrong";
    }

    @Override
    public void run(Scanner in) {
        System.out.print("Introduce un número entero: ");
        String input = in.nextLine().trim();

        try {
            int numero = Integer.parseInt(input);
            if (esArmstrong(numero)) {
                System.out.println(numero + " es un número de Armstrong.");
            } else {
                System.out.println(numero + " NO es un número de Armstrong.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir un número entero.");
        }
    }

    private boolean esArmstrong(int numero) {
        String s = String.valueOf(numero);
        int numCifras = s.length();
        int suma = 0;

        for (char c : s.toCharArray()) {
            int digito = c - '0';
            suma += Math.pow(digito, numCifras);
        }

        return suma == numero;
    }
}
