import java.util.ArrayList;
public class Hospital {
    ArrayList<Paciente> pacientes;
    public Hospital(){
        this.pacientes = new ArrayList<>();
    }
    public void agregarPaciente(Paciente p){
        this.pacientes.add(p);
    }
    public void mostrarPacientes(){
        for(Paciente p : this.pacientes){
            p.mostrar();
            System.out.println("--------------------------------------------------");
        }
    }
    public int CantidadPacientes(){
        return this.pacientes.size();
    }
    public Paciente obtenerPaciente(int indice){
        return this.pacientes.get(indice);
    }

}
