//ejercicio1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EliminacionDeElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {10, 20, 30, 40, 50};

        System.out.print("Ingrese el número a buscar y eliminar: ");
        int numeroABuscar = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();

        boolean encontrado = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroABuscar) {
                encontrado = true;
            } else {
                lista.add(arreglo[i]);
            }
        }

        if (encontrado) {
            arreglo = new int[lista.size()];
            for (int i = 0; i < lista.size(); i++) {
                arreglo[i] = lista.get(i);
            }
            System.out.println("Número encontrado y eliminado.");
        } else {
            System.out.println("Número no encontrado en el arreglo.");
        }

        System.out.println("Arreglo resultante después de la eliminación:");
        System.out.println(Arrays.toString(arreglo));

        scanner.close();
    }
}
//ejercicio2
import java.util.Arrays;
import java.util.Scanner;

public class EliminacionDeElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {10, 20, 30, 40, 50};

        System.out.print("Ingrese el número a buscar y eliminar: ");
        int numeroABuscar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroABuscar) {
                for (int j = i; j < arreglo.length - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                encontrado = true;
                break; 
            }
        }

        if (encontrado) {
            arreglo = Arrays.copyOf(arreglo, arreglo.length - 1);
            System.out.println("Número encontrado y eliminado.");
        } else {
            System.out.println("Número no encontrado en el arreglo.");
        }

        System.out.println("Arreglo resultante después de la eliminación:");
        System.out.println(Arrays.toString(arreglo));

        scanner.close();
    }
}
//ejercicio3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionDeArreglos {
    public static void main(String[] args) {
        String[] arreglo1 = {"Hola", "Mundo"};
        Integer[] arreglo2 = {1, 2, 3};

        Object[] arreglo3 = unirArreglos(arreglo1, arreglo2);

        System.out.println("Tercer arreglo después de la unión:");
        System.out.println(Arrays.toString(arreglo3));
    }

    public static Object[] unirArreglos(Object[] arreglo1, Object[] arreglo2) {
        List<Object> lista = new ArrayList<>();

        for (Object elemento : arreglo1) {
            lista.add(elemento);
        }

        for (Object elemento : arreglo2) {
            lista.add(elemento);
        }

        Object[] resultado = new Object[lista.size()];
        lista.toArray(resultado);

        return resultado;
    }
}
//ejercicio4
import java.util.Arrays;
import java.util.Scanner;

public class TrasladoEnArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));

        System.out.print("Ingrese la posición a trasladar (0 a " + (arreglo.length - 1) + "): ");
        int posicion = scanner.nextInt();

        System.out.print("Ingrese la cantidad de traslados: ");
        int cantidadTraslados = scanner.nextInt();

        if (cantidadTraslados > arreglo.length) {
            System.out.println("No es posible realizar la operación, la cantidad de traslados es mayor que el tamaño del arreglo.");
            return;
        }

        for (int i = 0; i < cantidadTraslados; i++) {
            int elemento = arreglo[posicion];

            for (int j = arreglo.length - 1; j > posicion; j--) {
                arreglo[j] = arreglo[j - 1];
            }

            arreglo[posicion] = elemento;
        }

        System.out.println("Arreglo después de los traslados:");
        System.out.println(Arrays.toString(arreglo));

        scanner.close();
    }
}
//ejercicio5
import java.util.Arrays;

public class InversionDeArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));

        invertirArreglo(arreglo);

        System.out.println("Arreglo invertido:");
        System.out.println(Arrays.toString(arreglo));
    }

    public static void invertirArreglo(int[] arreglo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;

            inicio++;
            fin--;
        }
    }
}
//ejercicio6
import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        char[] arreglo = palabra.toCharArray();

        boolean esPalindromo = verificarPalindromo(arreglo);

        if (esPalindromo) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }

        scanner.close();
    }

    public static boolean verificarPalindromo(char[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda < derecha) {
            if (arreglo[izquierda] != arreglo[derecha]) {
                return false; 
            }
            izquierda++;
            derecha--;
        }

        return true; 
    }
}
//ejercicio7