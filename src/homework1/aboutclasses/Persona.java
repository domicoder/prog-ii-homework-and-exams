package homework1.aboutclasses;

import java.util.Calendar;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private String numeroDocumentoIdentidad;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;
    private int edad;
    
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", apellidos=" + apellidos + ", numeroDocumentoIdentidad=" + numeroDocumentoIdentidad + ", anioNacimiento=" + anioNacimiento + ", paisNacimiento=" + paisNacimiento + ", genero=" + genero + '}';
    }
    
    public void imprimir() {
        System.out.println("\nNueva Persona agregada");
        System.out.println("Nombre " + this.nombre);
        System.out.println("Apellidos "+ this.apellidos);
        System.out.println("Número documento de identiad " + this.numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento " + this.anioNacimiento);
        System.out.println("");
    }
    
    public void imprimirTodaInformacion() {
        System.out.println("\nNueva Persona agregada");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: "+ this.apellidos);
        System.out.println("Número Documento de identiad: " + this.numeroDocumentoIdentidad);
        System.out.println("Año de Nacimiento: " + this.anioNacimiento);
        System.out.println("País de nacimiento: " + this.paisNacimiento);
        System.out.println("Género: " + this.genero);
        System.out.println("Edad: " + this.calcularEdadPersona() + " años.");
    }
    
    private int calcularEdadPersona() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        
        return year - this.anioNacimiento;
    }
}
