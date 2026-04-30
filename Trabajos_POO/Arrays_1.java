import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}
