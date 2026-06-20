public class Libro {
    private String Titulo;
    private String isbn;
    private String CantidadPaginas;
      
    public Libro(String Titulo, String isbn, String CantidadPaginas){
        this.Titulo = Titulo;
        this.isbn = isbn;
        this.CantidadPaginas = CantidadPaginas;
    }
    public void mostrar(){
        System.out.println("Titulo: " + Titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Cantidad de paginas: " + CantidadPaginas);
        System.out.println("-------------------------");
    }
    public String getCantidadPaginas(){
        return CantidadPaginas;
    }
}
