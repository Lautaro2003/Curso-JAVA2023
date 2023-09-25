//ejercicio1
import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);
    }
}
//ejercicio2
import java.util.Scanner;

public class SumaDosNumerosConParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int suma = numero1 + numero2;

        String paridad = (suma % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado es " + suma + " y es " + paridad + ".");
    }
}
//ejercicio3
public class CaracteresNombre {
    public static void main(String[] args) {
        char letra1 = 'T';
        char letra2 = 'o';
        char letra3 = 'm';
        char letra4 = 'á';
        char letra5 = 's';

        System.out.print(letra1);
        System.out.print(letra2);
        System.out.print(letra3);
        System.out.print(letra4);
        System.out.println(letra5);
    }
}
//ejercicio4
import java.util.Scanner;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int suma = numero1 + numero2;

        boolean esDivisible = numero1 % numero2 == 0;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);

        if (esDivisible) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }
    }
}
//ejercicio5
import java.util.Scanner;

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int altura = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
//ejercicio6
import java.util.Scanner;

public class NombreDeBebida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de su última mascota: ");
        String nombreMascota = scanner.nextLine();

        System.out.print("Ingrese el nombre de la última película vista: ");
        String nombrePelicula = scanner.nextLine();

        scanner.close();

        String nombreBebida = "Nombredelapróximabebida:" + nombreMascota + nombrePelicula;

        System.out.println(nombreBebida);
    }
}
//ejercicio7
public class MultiplicacionSuma {
    public static void main(String[] args) {
        double numeroReal1 = 2.5;
        double numeroReal2 = 3.0;
        double resultadoReal = numeroReal1 * numeroReal2;

        int numeroEntero1 = 4;
        int numeroEntero2 = 5;
        int resultadoEntero = numeroEntero1 * numeroEntero2;

        double suma = resultadoReal + resultadoEntero;

        System.out.println("Resultado de la multiplicación de números reales: " + resultadoReal);
        System.out.println("Resultado de la multiplicación de números enteros: " + resultadoEntero);
        System.out.println("Resultado de la suma entre las dos multiplicaciones: " + suma);
    }
}
//ejercicio8
import java.util.Scanner;

public class NombreYEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombreApellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        scanner.close();

        System.out.println("Mi nombre es " + nombreApellido + " y mi edad es " + edad + " años.");
    }
}
//ejercicio9
import java.util.Scanner;

public class PotenciaDeDosYTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        scanner.close();

        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("El número elevado al cuadrado es: " + cuadrado);
        System.out.println("El número elevado al cubo es: " + cubo);
    }
}
//ejercicio10
import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        double acumulador = 0.0;

        for (int i = 1; i <= 15; i++) {
            double producto = numero1 * numero2;
            double resultado = producto / i;
            acumulador += resultado;
        }

        System.out.println("El resultado acumulado es: " + acumulador);
    }
}
