public class Paciente {
    private String nombre;
    private String DNI;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, String DNI, int edad, double peso, boolean estaHostpitalizado){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHostpitalizado;
    }
    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("¿Está hospitalizado? " + (this.estaHospitalizado ? "Sí" : "No"));
    }
}
