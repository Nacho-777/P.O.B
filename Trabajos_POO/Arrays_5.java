import java.util.Scanner;
public class Arrays_5 {
        public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            if(numeros[i]%2==0){
                System.out.println("El número " + numeros[i] + " es par: ");
            }else{
                System.out.println("El número " + numeros[i] + " es impar: ");
            }
        }
        scanner.close();
    }
}
