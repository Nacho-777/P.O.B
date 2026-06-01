import java.util.ArrayList;
public class Curso {
    private String Nombre;
    private ArrayList<Estudiante> alumnos;

    public Curso(String nombre) {
        this.Nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public void Inscribir(Estudiante e){
        alumnos.add(e);
    }
    public void DarDeBaja(int indice){
        alumnos.remove(indice);
    }
    public void ListarAlumnos(){
        for(Estudiante e : alumnos){
            e.MostrarFicha();
            System.out.println();
        }
    }
    public int CantidadAlumnos(){
        return alumnos.size();
    }
}
