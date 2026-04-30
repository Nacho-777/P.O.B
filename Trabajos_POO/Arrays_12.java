public class Arrays_12 {
    public static void main(String[] args) {
        int numeros[] = {100,777,50,-27,7,4,33,433};
        int mayor = 0;
        int menor = 0;
        for(int i = 0;i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
    
}
