public class Jugador {
    private String Nombre;
    private String Posicion;
    private int Edad;
    private String Equipo;
    private boolean Convocado;
    private String Seleccion;

    public Jugador(String Nombre, String Posicion, int Edad, String Equipo, boolean Convocado, String Seleccion){
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Edad = Edad;
        this.Equipo = Equipo;
        this.Convocado = Convocado;
        this.Seleccion = Seleccion;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getPosicion(){
        return Posicion;
    }
    public boolean isConvocado(){
        return Convocado;
    }
    public int getEdad(){
        return Edad;
    }
    public String getEquipo(){
        return Equipo;
    }
    public String getSeleccion(){
        return Seleccion;
    }
}
