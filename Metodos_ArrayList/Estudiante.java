public class Estudiante {
    private String Nombre;
    private String DNI;
    private double Promedio;

    public Estudiante(String nombre, String dni, double promedio) {
        this.Nombre = nombre;
        this.DNI = dni;
        this.Promedio = promedio;
    }
    public String getNombre(){
        return Nombre;
    }
    public double getPromedio(){
        return Promedio;
    }
    public void MostrarFicha(){
        System.out.println("Nombre: "+ Nombre);
        System.out.println("DNI: "+ DNI);
        System.out.println("Promedio: "+ Promedio);
    }
}
