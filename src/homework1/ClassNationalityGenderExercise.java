package homework1;

import homework1.aboutclasses.Persona;
import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class ClassNationalityGenderExercise implements Exercise {

    @Override
    public String getName() {
        return "Avanzado 2: Modelar concepto de una persona con Nombre, Apellidos, Número de identidad, Año de nacimiento, Pais nacimiento, Género, Edad.";
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Introduce los datos de la persona.");
        System.out.println("Introduce el Nombre: ");
        String nombre = in.nextLine().trim();
        System.out.println("Introduce los Apellidos: ");
        String apellidos = in.nextLine().trim();
        System.out.println("Introduce Número documento de identidad: ");
        String numeroDocumentoIdentidad = in.nextLine().trim();
        System.out.println("Introduce Año de nacimiento: ");
        int anioNacimiento = Integer.parseInt(in.nextLine().trim());
        System.out.println("Introduce el País de nacimiento: ");
        String nacionalidad = in.nextLine().trim();
        System.out.println("Introduce Género (M, F): ");
        String valorCapturado = in.nextLine().trim();
        char genero = valorCapturado.charAt(0);
        Persona nuevaPersona = new Persona(nombre, apellidos, numeroDocumentoIdentidad, anioNacimiento, nacionalidad, genero);
        nuevaPersona.imprimirTodaInformacion();
    }
    
}
