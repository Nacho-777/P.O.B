import java.util.Random;
import java.util.Scanner;
public class Arrays_10 {

	public static void main(String[] args) {
		String[][] palabras = { {"m","u","n","d","o"},
								{"c","o","m","p","u","t","a","c","i","o","n"},
								{"r","o","b","o","t","s"},
								{"s","i","l","l","a","s"},
								{"c","o","m","p","u","t","a","d","o","r","a"},
								{"m","o","n","i","t","o","r"},
								{"t","e","c","l","a","d","o"}};

        Random random = new Random();
        int indice = random.nextInt(palabras.length) ;

        Scanner scanner = new Scanner(System.in);
        String[] palabraSeleccionada = palabras[indice];
        String[] UsuarioLetra = new String[palabraSeleccionada.length]; 
        int aciertos = 0;
		
		System.out.println("Juego de Adivinanzas");
        System.out.println("Primera letra: " + palabraSeleccionada[0]);

		for(int i = 0; i < palabraSeleccionada.length; i++){
		    System.out.println("Ingrese la letra en la posicion: "+i+":");
			UsuarioLetra[i] = scanner.nextLine();

			if(UsuarioLetra[i].equals(palabraSeleccionada[i])) {
                 aciertos++;
				System.out.println("Letra correcta en la posicion:"+i);
			}
            else {
                System.out.println("Error ");
                i --;
			}

		}
            if(aciertos == palabraSeleccionada.length) {
                     System.out.println("¡GANASTE, ADIVINASTE TODO! La palabra es: " + String.join("", palabraSeleccionada));
                } else {
                     System.out.println("Perdiste ");
                    }
        scanner.close();
	}

}



