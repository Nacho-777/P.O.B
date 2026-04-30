import java.util.Scanner;
public class Arrays_11 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeros[] = new int[5];


    for(int i = 0; i < numeros.length; i++){
        System.out.println("Ingrese el numero en la posicion: "+i+":");
        numeros[i] = scanner.nextInt();
    }
    System.out.println("Los numeros en orden inverso son:");
        for(int i = 5; i>0; i--){
        System.out.println(numeros[i-1]);
    }
    scanner.close();
}
}

