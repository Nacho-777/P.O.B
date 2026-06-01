public class Main {
    public static void main(String[] args){

        Curso curso = new Curso("5°2°");

        Estudiante Ignacio = new Estudiante(
            "Ignacio",
            "12345678",
            8.5
        );
        Estudiante Pepe = new Estudiante(
            "Pepe",
            "87654321",
            7.0
        );
        Estudiante Carlos = new Estudiante(
            "Carlos",
            "11111111",
            9.0
        );

        curso.Inscribir(Ignacio);
        curso.Inscribir(Pepe);
        curso.Inscribir(Carlos);
        
        System.out.println("Cantidad de alumnos: "+ curso.CantidadAlumnos());
        curso.DarDeBaja(1);
        curso.ListarAlumnos();
    }
}
