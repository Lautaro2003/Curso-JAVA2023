//ejercicio1
import java.util.Scanner;

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas del triángulo: ");
        int numFilas = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= numFilas; i++) {
            for (int j = 1; j <= numFilas - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
//ejercicio2
import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombresAmigos = new String[cantidadAmigos];

        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombresAmigos[i] = scanner.next();
        }

        scanner.close();

        System.out.println("Nombres de tus amigos:");
        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.println((i + 1) + ". " + nombresAmigos[i]);
        }
    }
}
//ejercicio3
import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado (" + numero + ") es PAR.");
        } else {
            System.out.println("El número ingresado (" + numero + ") es IMPAR.");
        }
    }
}
//ejercicio4
import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero > 0) {
            System.out.println("El número ingresado (" + numero + ") es POSITIVO.");
        } else if (numero < 0) {
            System.out.println("El número ingresado (" + numero + ") es NEGATIVO.");
        } else {
            System.out.println("El número ingresado (" + numero + ") es CERO.");
        }
    }
}
//ejercicio5
import java.util.Scanner;

public class SumaPrimerosNNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero (N): ");
        int N = scanner.nextInt();

        scanner.close();

        int suma = (N * (N + 1)) / 2;

        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}
//ejercicio6
public class NumerosPares {
    public static void main(String[] args) {
        int N = 10; 

        System.out.println("Los primeros " + N + " números pares son:");

        for (int i = 2; i <= 2 * N; i += 2) {
            System.out.println(i);
        }
    }
}
//ejercicio7
public class Calificaciones {
    public static void main(String[] args) {
        int N = 5; 
        double[] notas = { 85.5, 92.0, 78.5, 88.0, 95.5 }; 

        double suma = 0.0;
        for (int i = 0; i < N; i++) {
            suma += notas[i];
        }
        double promedio = suma / N;

        System.out.println("=== Resultado de Exámenes ===");

        System.out.print("Calificaciones: ");
        for (int i = 0; i < N; i++) {
            System.out.print(notas[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nPromedio: " + promedio);

        if (promedio >= 70.0) {
            System.out.println("¡Aprobaste! Con un promedio de " + promedio);
        } else {
            System.out.println("No aprobaste. Tu promedio es " + promedio);
        }
    }
}