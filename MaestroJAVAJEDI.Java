//ejercicio1
public class CalculoAreaCirculo {
    public static void main(String[] args) {
        double radio = 5.0;

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " unidades es: " + area + " unidades cuadradas.");
    }
}
//ejercicio2
import java.util.Scanner;

public class ConversionCelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        scanner.close();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}
//ejercicio3
import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        scanner.close();

        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
//ejercicio4
import java.util.Scanner;

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de elementos: ");
        int k = scanner.nextInt();

        double suma = 0.0;

        for (int i = 1; i <= k; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double media = suma / k;

        scanner.close();

        System.out.println("La media aritmética de los números ingresados es: " + media);
    }
}
//ejercicio5
import java.util.Scanner;

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto en kilogramos: ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del objeto en metros por segundo: ");
        double velocidad = scanner.nextDouble();

        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

        scanner.close();

        System.out.println("La energía cinética del objeto es: " + energiaCinetica + " julios");
    }
}
//ejercicio6
import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la velocidad inicial en metros por segundo (v_i): ");
        double velocidadInicial = scanner.nextDouble();

        System.out.print("Ingrese la aceleración de la gravedad en metros por segundo al cuadrado (g): ");
        double aceleracionGravedad = scanner.nextDouble();

        System.out.print("Ingrese el tiempo transcurrido en segundos (t): ");
        double tiempoTranscurrido = scanner.nextDouble();

        double velocidadFinal = velocidadInicial + (aceleracionGravedad * tiempoTranscurrido);

        scanner.close();

        System.out.println("La velocidad final del objeto es: " + velocidadFinal + " metros por segundo");
    }
}
//ejercicio7
import java.util.Scanner;

public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la masa del objeto en kilogramos (m): ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la velocidad angular en radianes por segundo (v): ");
        double velocidadAngular = scanner.nextDouble();

        System.out.print("Ingrese el radio de la trayectoria en metros (r): ");
        double radio = scanner.nextDouble();

        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

        scanner.close();

        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " newtons");
    }
}