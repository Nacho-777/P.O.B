import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Arrays_9 {
    public static void main(String[] args)throws InterruptedException{
        int salir = 0;
        Scanner scanner = new Scanner(System.in);
        while(salir==0){

        Random random = new Random();
        int [] numaleatorios = new int[5];
        for(int i = 0; i < numaleatorios.length; i++){
            numaleatorios[i] = random.nextInt(11) ;
        } 

        int [] Numadivinar = new int[5];

        System.out.println("Juego de memoria");
        for (int i = 0; i < numaleatorios.length; i++) {
            System.out.print(numaleatorios[i] + "\n");
        }
        System.out.println();
        TimeUnit.SECONDS.sleep(3);

        for(int i = 0; i < 50; i++) System.out.println();

        System.out.println("Ingresa los numeros que viste en el orden correcto");
        for (int i = 0; i < Numadivinar.length; i++) {
            Numadivinar[i] = scanner.nextInt();
            }
        int aciertos = 0;

        for (int i = 0; i < numaleatorios.length; i++) {
             if (numaleatorios[i] == Numadivinar[i]) {
                aciertos++;
                 }
            }

            if (aciertos == numaleatorios.length) {
                System.out.println("¡GANASTE, ADIVINASTE TODO!");
            } else {
                System.out.println("Perdiste , pero adivinaste " + aciertos + " de " + numaleatorios.length);
                }
        System.out.println("¿Quieres jugar de nuevo? (0 para sí, 1 para no)");
         salir = scanner.nextInt();
         if (salir > 1 ){
            System.out.println("Opción no válida. Sigue el juego");
            salir = 0;
}
}
}
}
