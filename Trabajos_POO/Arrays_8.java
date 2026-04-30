import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays_8 {
    public static void main(String[] args){
         String[] bancoPalabras = {"programacion", "java", "desarrollo", "computadora"};
         Random random = new Random();
         String palabraSecreta = bancoPalabras[random.nextInt(bancoPalabras.length)];
         String letra;

         System.out.println("¡Bienvenido al juego de adivinar la palabra!");
         System.out.println("La palabra secreta tiene " + palabraSecreta.length() + " letras");

         for (int i = 0; i < palabraSecreta.length(); i++) {
         System.out.println("Ingrese la letra de la posicion " + (i+1) + ": ");
            Scanner scanner = new Scanner(System.in);
            letra = scanner.nextLine();
            if(letra.equals(String.valueOf(palabraSecreta.charAt(i)))){
                System.out.println("¡Correcto! La letra " + letra + " está en la palabra.");
            }else{
                System.out.println("¡Incorrecto! La letra " + letra + " no está en la palabra.");
                i = i-1;
            }
    }
    System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
}
}
