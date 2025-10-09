package homework1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Exercise> exercises = Arrays.asList(
            new IMCApp(),
            new AmstrongApp(),
            new NumeroPerfectoApp(),
            new NumerosAmigosApp(),
            new ArrayDuplicatedNumbersApp(),
            new EjercicioPositivoFactorial(), /** Ejercicio PRIMER PARCIAL - 1 OCT 2025 */
            new ClassExercise(),
            new ClassNationalityGenderExercise()
        );
        
        while (true) {
            System.out.println("\n=== Homework 1 ===");
            for (int i = 0; i < exercises.size(); i++) {
                System.out.printf("%d) %s%n", i+1, exercises.get(i).getName());
            }
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            
            String choice = in.nextLine().trim();
            if (choice.equals("0")) break;
            
            try {
                int idx = Integer.parseInt(choice) - 1;
                if (idx >= 0 && idx < exercises.size()) {
                    System.out.println("\n--- " + exercises.get(idx).getName() + " ---");
                    exercises.get(idx).run(in);
                } else {
                    System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes escribir un número.");
            }
        }
        in.close();
        System.out.println("¡Listo!");
    }
    
}
