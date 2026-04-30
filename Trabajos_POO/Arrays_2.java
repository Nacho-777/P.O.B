import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int NumMax = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            if(numeros[i]>NumMax){
                NumMax = numeros[i];
            }
        }
        System.out.println("El número máximo ingresado es: " + NumMax);

        scanner.close();
    }
}
