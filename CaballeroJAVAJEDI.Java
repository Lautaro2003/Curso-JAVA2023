//ejercicio1
import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número real: ");
        double numeroReal = scanner.nextDouble();

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        scanner.close();

        double porcentaje = (numeroReal / numeroEntero) * 100;

        System.out.println(numeroReal + " es el " + porcentaje + "% de " + numeroEntero);
    }
}
//ejercicio2
import java.util.Scanner;

public class ConversionDolaresAPesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDeCambio = 20.0; 

        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        scanner.close();

        double pesos = dolares * tasaDeCambio;

        System.out.println(dolares + " dólares equivalen a " + pesos + " pesos.");
    }
}
//ejercicio3
import java.util.Scanner;

public class ConversionEurosADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDeCambio = 1.20; 

        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();

        scanner.close();

        double dolares = euros * tasaDeCambio;

        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
    }
}
//ejercicio4
import java.util.Scanner;

public class ConversionLibrasEsterlinasADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDeCambio = 1.40; 

        System.out.print("Ingrese la cantidad en libras esterlinas: ");
        double librasEsterlinas = scanner.nextDouble();

        scanner.close();

        double dolares = librasEsterlinas * tasaDeCambio;

        System.out.println(librasEsterlinas + " libras esterlinas equivalen a " + dolares + " dólares.");
    }
}
//ejercicio5
import java.util.Scanner;

public class ConversionPesosAEuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDeCambio = 0.05; 

        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        scanner.close();

        double euros = pesos * tasaDeCambio;

        System.out.println(pesos + " pesos equivalen a " + euros + " euros.");
    }
}
//ejercicio6
import java.util.Scanner;

public class ConversionBitcoinsADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tasaDeCambio = 50000.0; 

        System.out.print("Ingrese la cantidad en bitcoins: ");
        double bitcoins = scanner.nextDouble();

        scanner.close();

        double dolares = bitcoins * tasaDeCambio;

        System.out.println(bitcoins + " bitcoins equivalen a " + dolares + " dólares.");
    }
}