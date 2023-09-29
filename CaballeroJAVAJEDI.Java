//ejercicio1
public class BusquedaEnArreglo {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50}; 
        int numeroABuscar = 30; 

        boolean encontrado = false; 

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroABuscar) {
                encontrado = true;
                break; 
            }
        }

        if (encontrado) {
            System.out.println("Se encontró el número " + numeroABuscar);
        } else {
            System.out.println("No se encontró el número " + numeroABuscar);
        }
    }
}
//ejercicio2
import java.util.Scanner;

public class MaximoYMinimoEnArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

        scanner.close();
    }
}
//ejercicio3
import java.util.Scanner;

public class AmigosMayoresDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        String[] nombres = new String[cantidadAmigos];
        int[] edades = new int[cantidadAmigos];

        for (int i = 0; i < cantidadAmigos; i++) {
            scanner.nextLine(); 
            System.out.print("Ingrese el nombre del amigo " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
        }

        int indiceAmigoMayor = 0;
        int edadMayor = edades[0];

        for (int i = 1; i < cantidadAmigos; i++) {
            if (edades[i] > edadMayor) {
                edadMayor = edades[i];
                indiceAmigoMayor = i;
            }
        }

        System.out.println("Amigos mayores de edad:");
        for (int i = 0; i < cantidadAmigos; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
            }
        }

        System.out.println("El amigo más mayor es " + nombres[indiceAmigoMayor] + " con " + edadMayor + " años.");

        scanner.close();
    }
}
//ejercicio4
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        double[] numeros = new double[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Arrays.sort(numeros);

        System.out.println("Números ordenados de forma ascendente:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
//ejercicio5
import java.util.Arrays;

public class RestaDeArreglos {
    public static void main(String[] args) {
        double[] arreglo1 = {10.5, 20.3, 15.7, 8.2};
        double[] arreglo2 = {5.5, 25.8, 10.0, 12.0};

        if (arreglo1.length != arreglo2.length) {
            System.out.println("Los arreglos deben tener la misma longitud.");
            return;
        }

        double[] resultado = new double[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            double resta = arreglo1[i] - arreglo2[i];
            resultado[i] = (resta < 0) ? 0 : resta;
        }

        System.out.println("Resultado de la resta (con valores no negativos):");
        System.out.println(Arrays.toString(resultado));
    }
}