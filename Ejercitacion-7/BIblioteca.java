import java.util.ArrayList;
public class BIblioteca {
    private ArrayList<Libro> libros;

    public BIblioteca(){
        this.libros = new ArrayList<>();
    }
    public void AgregarLibro(Libro l){
        libros.add(l);
    }
    public void ListarLibros(){
        for(Libro l: libros){
            l.mostrar();
        }
    }
    public int CantidadLibros(){
        return libros.size();
    }
    public Libro getLibro(int indice){
        return libros.get(indice);
    }
}
