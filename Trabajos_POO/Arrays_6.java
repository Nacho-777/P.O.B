import java.util.Scanner;

public class Arrays_6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numrandom = (int) (Math.random() * 100) + 1;
    int NumAdivinar = 0;

    while (numrandom != NumAdivinar) {
        System.out.print("Ingrese un número para adivinar: ");
        NumAdivinar = scanner.nextInt();
        if(NumAdivinar>numrandom){
            System.out.println("El número a adivinar es menor: ");
        }else{
            System.out.println("El número a adivinar es mayor: ");
        }
    }
    System.out.println("¡Felicidades! Has adivinado el número: " + numrandom);
    scanner.close();
}
}
 