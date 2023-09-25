//ejercicio1
public class Contador {
    public static void main(String[] args) {
        int numero = 0; 

        for (int i = 0; i < 20; i++) {
            numero++; 
        }

        System.out.println("El número es: " + numero);
    }
}
//ejercicio2
public class Descontador {
    public static void main(String[] args) {
        int numero = 20; 

        for (int i = 0; i < 20; i++) {
            numero--; 
        }

        System.out.println("El número es: " + numero);
    }
}
//ejercicio3
public class CaracteresUnicode {
    public static void main(String[] args) {
        char letraA = '\u0041';  
        char letraB = '\u0042';  
        char letraC = '\u0043';  

        System.out.println("Caracter 1: " + letraA);
        System.out.println("Caracter 2: " + letraB);
        System.out.println("Caracter 3: " + letraC);
    }
}
//ejercicio4
import java.util.Scanner;

public class PromedioDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();

        String[] nombres = new String[cantidadPersonas];
        int[] edades = new int[cantidadPersonas];

        int sumaEdades = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();

            sumaEdades += edades[i];
        }

        scanner.close();

        double promedio = (double) sumaEdades / cantidadPersonas;

        System.out.println("Nombres y edades de las personas:");
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println(nombres[i] + ": " + edades[i] + " años");
        }

        System.out.println("El promedio de edades es: " + promedio);
    }
}
//ejercicio5
public class ConversionAKilogramos {
    public static void main(String[] args) {
        final double LIBRAS_A_KILOGRAMOS = 0.45359237;

        double libras = 10.0; 

        double kilogramos = libras * LIBRAS_A_KILOGRAMOS;

        System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos.");
    }
}