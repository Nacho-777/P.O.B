import java.util.Scanner;
public class Arrays_4 {
    public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int NumProm = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            NumProm += numeros[i];
        }
        NumProm = NumProm / numeros.length;
        System.out.println("El número promedio ingresado es: " + NumProm);

        scanner.close();
    }
}
