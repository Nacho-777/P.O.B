import java.util.Scanner;
public class Arrays_7 {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int jugador = 0;
        int salir = 0;
        int puntuacionJugador = 0;
        int puntuacionComputadora = 0;
        System.out.println("---JUEGO PIEDRA PAPEL O TIJERA---");
while(salir == 0){
      int computadora = (int) (Math.random() * 3) + 1;
        System.out.println("Elige tu opción: 1. Piedra, 2. Papel, 3. Tijera");
        jugador = scanner.nextInt();
        if(jugador == computadora){
            System.out.println("Empate! Ambos eligieron la misma opción.");
        } else if (jugador == 1 && computadora == 3){
            System.out.println("¡Ganaste! La computadora eligió Tijera.");
            puntuacionJugador++;
        } else if (jugador == 2 && computadora == 1){
            System.out.println("¡Ganaste! La computadora eligió Piedra.");
            puntuacionJugador++;
        } else if (jugador == 3 && computadora == 2){
            System.out.println("¡Ganaste! La computadora eligió Papel.");
            puntuacionJugador++;
        } else if (jugador == 1 && computadora == 2){
            System.out.println("¡Perdiste! La computadora eligió Papel.");
            puntuacionComputadora++;
        } else if (jugador == 2 && computadora == 3){
            System.out.println("¡Perdiste! La computadora eligió Tijera.");
            puntuacionComputadora++;
        } else if (jugador == 3 && computadora == 1){
            System.out.println("¡Perdiste! La computadora eligió Piedra.");
            puntuacionComputadora++;
        }
         System.out.println("Puntuación - Jugador: " + puntuacionJugador + " | Computadora: " + puntuacionComputadora);
         System.out.println("¿Quieres jugar de nuevo? (0 para sí, 1 para no)");
         salir = scanner.nextInt();
         if (salir > 1 ){
            System.out.println("Opción no válida. Sigue el juego");
            salir = 0;
   }
}
}
}
