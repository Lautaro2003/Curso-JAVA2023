//ejercicio1
import java.util.Scanner;

public class BucleDoWhileEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.print("Ingrese un número positivo: ");
            N = scanner.nextInt();
        } while (N <= 0);

        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }

        scanner.close();
    }
}
//ejercicio2
import java.util.Scanner;

public class BucleForEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
//ejercicio3
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es " + factorial);
        }

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}
//ejercicio4
public class SumaNumerosImpares {
    public static void main(String[] args) {
        int inicio = 1; 
        int fin = 10;  
        int suma = 0;

        for (int numero = inicio; numero <= fin; numero++) {
            if (numero % 2 != 0) { 
                suma += numero; 
            }
        }

        System.out.println("La suma de los números impares en el rango [" + inicio + ", " + fin + "] es: " + suma);
    }
}
//ejercicio5
public class NumerosDivisiblesPor7 {
    public static void main(String[] args) {
        System.out.println("Números enteros positivos divisibles por 7 menores que 100:");
        
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
//ejercicio6
import java.util.Scanner;

public class SumaDeEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int suma = 0;

            for (int i = 1; i <= numero; i++) {
                suma += i;
            }

            System.out.println("La suma de los enteros desde 1 hasta " + numero + " es: " + suma);
        }

        scanner.close();
    }
}
//ejercicio7
import java.util.Scanner;

public class AmigosMayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo #" + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            if (edad >= 18) {
                System.out.println("Nombre del amigo mayor de edad: " + nombre);
            } else {
                System.out.println("El amigo " + nombre + " es menor de edad y no se muestra.");
                System.out.println("Razón: " + nombre + " tiene " + edad + " años, y debe ser mayor de 18 años.");
            }
        }

        scanner.close();
    }
}
//ejercicio8
public class MenuDeOpciones {
    public static void main(String[] args) {
        int opcion; 

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Elija una opción (1-4): ");

            opcion = 2; 

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la Opción 1.");
                    break;
                case 2:
                    System.out.println("Ha elegido la Opción 2.");
                    break;
                case 3:
                    System.out.println("Ha elegido la Opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4); 
    }
}
//ejercicio9
public class MenuDeOpciones {
    public static void main(String[] args) {
        int opcion = 0; 

        while (opcion != 4) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");

            opcion = 2; 

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la Opción 1.");
                    break;
                case 2:
                    System.out.println("Ha elegido la Opción 2.");
                    break;
                case 3:
                    System.out.println("Ha elegido la Opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}
//ejercicio10
public class EquiposDeFutbol {
    public static void main(String[] args) {
        String equipo1 = "Equipo A";
        String entrenador1 = "Entrenador A";
        String jugador1Equipo1 = "Jugador 1A";
        String jugador2Equipo1 = "Jugador 2A";
        String jugador3Equipo1 = "Jugador 3A";

        String equipo2 = "Equipo B";
        String entrenador2 = "Entrenador B";
        String jugador1Equipo2 = "Jugador 1B";
        String jugador2Equipo2 = "Jugador 2B";
        String jugador3Equipo2 = "Jugador 3B";

        System.out.println("Información de los Equipos de Fútbol:");
        System.out.println("Equipo 1: " + equipo1);
        System.out.println("Entrenador 1: " + entrenador1);
        System.out.println("Jugadores del Equipo 1:");
        System.out.println("  - " + jugador1Equipo1);
        System.out.println("  - " + jugador2Equipo1);
        System.out.println("  - " + jugador3Equipo1);

        System.out.println();

        System.out.println("Equipo 2: " + equipo2);
        System.out.println("Entrenador 2: " + entrenador2);
        System.out.println("Jugadores del Equipo 2:");
        System.out.println("  - " + jugador1Equipo2);
        System.out.println("  - " + jugador2Equipo2);
        System.out.println("  - " + jugador3Equipo2);
    }
}
//ejercicio11
import java.util.Scanner;

public class MenuEquiposDeFutbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String equipo1 = "Equipo A";
        String entrenador1 = "Entrenador A";
        String jugador1Equipo1 = "Jugador 1A";
        String jugador2Equipo1 = "Jugador 2A";
        String jugador3Equipo1 = "Jugador 3A";

        String equipo2 = "Equipo B";
        String entrenador2 = "Entrenador B";
        String jugador1Equipo2 = "Jugador 1B";
        String jugador2Equipo2 = "Jugador 2B";
        String jugador3Equipo2 = "Jugador 3B";

        int opcion;

        do {
            System.out.println("Menú de Equipos de Fútbol:");
            System.out.println("1. Información del Equipo A");
            System.out.println("2. Información del Equipo B");
            System.out.println("3. Salir");
            System.out.print("Elija una opción (1-3): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Información del Equipo A:");
                    System.out.println("Equipo: " + equipo1);
                    System.out.println("Entrenador: " + entrenador1);
                    System.out.println("Jugadores:");
                    System.out.println("  - " + jugador1Equipo1);
                    System.out.println("  - " + jugador2Equipo1);
                    System.out.println("  - " + jugador3Equipo1);
                    break;
                case 2:
                    System.out.println("Información del Equipo B:");
                    System.out.println("Equipo: " + equipo2);
                    System.out.println("Entrenador: " + entrenador2);
                    System.out.println("Jugadores:");
                    System.out.println("  - " + jugador1Equipo2);
                    System.out.println("  - " + jugador2Equipo2);
                    System.out.println("  - " + jugador3Equipo2);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}

