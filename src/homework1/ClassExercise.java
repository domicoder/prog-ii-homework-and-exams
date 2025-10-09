package homework1;

import homework1.aboutclasses.Persona;
import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class ClassExercise implements Exercise {

    @Override
    public String getName() {
        return "Modelar concepto de una persona con Nombre, Apellidos, Número de identidad, Año de nacimiento.";
    }

    @Override
    public void run(Scanner in) {
        Persona cliente = new Persona("Juan", "Pérez", "40299900774", 1980, null, 'M');
        cliente.imprimir();
        Persona suplidor = new Persona("Pedro", "Suárez", "01066633992", 1975, null, 'M');
        suplidor.imprimir();
    }
    
}
