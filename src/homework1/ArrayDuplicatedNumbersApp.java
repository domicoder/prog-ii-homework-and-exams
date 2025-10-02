package homework1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sanchezyander
 */
public class ArrayDuplicatedNumbersApp implements Exercise {
    
    @Override
    public String getName() {
        return "Encontrar elementos duplicados en un arreglo";
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Introduce números enteros separados por espacios:");
        String input = in.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("No ingresaste ningún número.");
            return;
        }

        String[] parts = input.split("\\s+");
        int[] numeros = new int[parts.length];

        try {
            for (int i = 0; i < parts.length; i++) {
                numeros[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debes escribir solo números enteros.");
            return;
        }

        Set<Integer> vistos = new HashSet<>();
        Set<Integer> duplicados = new HashSet<>();

        for (int num : numeros) {
            if (!vistos.add(num)) {
                duplicados.add(num);
            }
        }

        if (duplicados.isEmpty()) {
            System.out.println("No hay elementos duplicados.");
        } else {
            System.out.println("Elementos duplicados encontrados: " + duplicados);
        }
    }
    
}
