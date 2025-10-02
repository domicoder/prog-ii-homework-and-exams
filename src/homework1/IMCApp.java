package homework1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sanchezyander
 */
public class IMCApp implements Exercise {

    @Override
    public String getName() {
        return "Cálculo de IMC";
    }

    @Override
    public void run(Scanner in) {
        Locale.setDefault(Locale.US);

        double peso = leerPositivo(in, "Introduce tu peso en kg: ");
        double estatura = leerPositivo(in, "Introduce tu estatura (m). Si escribes > 3 lo tomo como cm: ");
        if (estatura > 3) estatura /= 100.0;

        double imc = peso / (estatura * estatura);
        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Categoría: " + categoria(imc));
    }
    
    private double leerPositivo(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = in.nextLine().trim();
            try {
                double v = Double.parseDouble(s);
                if (v > 0) return v;
            } catch (NumberFormatException ignored) {}
            System.out.println("Valor inválido. Intenta de nuevo.");
        }
    }

    private String categoria(double imc) {
        if (imc < 16) return "Delgadez severa";
        if (imc < 17.0) return "Delgadez moderada";
        if (imc < 18.5) return "Delgadez leve";
        if (imc < 25.0) return "Peso normal";
        if (imc < 30.0) return "Sobrepeso";
        if (imc < 35.0) return "Obesidad leve";
        if (imc < 40.0) return "Obesidad media";
        return "Obesidad mórbida";
    }
}
