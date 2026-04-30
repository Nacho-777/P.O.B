public class Arrays_13 {
    public static void main(String[] args){
        String nombres[] = {"Juan","Thiago","Luca","Luisa"};
        Double notas[] = {8.5, 3.4, 6.7, 5.5};
        for(int i = 0; i < nombres.length; i++){
            if(notas[i] >= 6.0){
                System.out.println("El alumno/a " + nombres[i] + " Aprobo");
            }
            else{
                System.out.println("El alumno/a " + nombres[i] + " Reprobo");
            }
        }
    }
}
