/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FileManager implements Exercise {

    @Override
    public String getName() {
        return "Lector y creador de Archivos .txt";
    }

    @Override
    public void run(Scanner in) {
        int choice;
        boolean validInput;

        do {
            validInput = true;
            System.out.println("\nSelecciona: ");
            System.out.println("1: Leer archivo de logs.");
            System.out.println("2: Crear/Modificar archivo de logs.");
            System.out.println("3: Salir.");

            // Hardcode for now
            String logs = "Nov 17 04:20:53 domain name, using 192.168.1.101. Execute 'cd payments'";

            System.out.print("Opcion: ");

            try {
                choice = in.nextInt();
                if (choice < 1 || choice > 3) {
                    System.out.println("Opción inválida, seleccione 1 al 3.");
                    validInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida.");
                in.next();
                choice = 0;
                validInput = false;
            }

            if (validInput && choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1 ->
                        readFile();
                    case 2 ->
                        writeFile(logs);
                    case 3 -> {
                        break;
                    }
                }
            }

        } while (choice != 3 || !validInput);

    }

    private void readFile() {
        String fileName = "transactions-logs.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. " + fileName);
        } catch (Exception e) {
            System.out.println("Ocurrio un problma leyendo el archivo de logs " + fileName + " " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void writeFile(String transactionLogs) {
        String fileName = "transactions-logs.txt";
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(transactionLogs);
            System.out.println("Archivo log creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrio un problma creando el archivo de logs " + fileName + " " + e.getMessage());
            e.printStackTrace();
        }

    }

}
