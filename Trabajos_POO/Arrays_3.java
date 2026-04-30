import java.util.Scanner;
public class Arrays_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int NumMin = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            if(numeros[i]<NumMin){
                NumMin = numeros[i];
            }
        }
        System.out.println("El número mínimo ingresado es: " + NumMin);

        scanner.close();
    }
}
