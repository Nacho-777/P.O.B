import java.util.ArrayList;
public class Seleccion {
    private ArrayList<Jugador> jugadores;
    public Seleccion(){
        jugadores = new ArrayList<Jugador>();
    }
    public void agregarJugador(Jugador convocado){
        jugadores.add(convocado);
    }
    public void eliminarJugador(String nombre){
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNombre().equals(nombre)) {
                jugadores.remove(i);
                break;
            }
        }
    }
    public void BuscarPorPosicion(String posicion){
        for(int i=0; i<jugadores.size(); i++){
            if(jugadores.get(i).getPosicion().equals(posicion)){
                System.out.println(jugadores.get(i).getNombre());
            }
        }
    }
    public void MostrarConvocados(){
        for(int i=0; i<jugadores.size(); i++){
            if(jugadores.get(i).isConvocado()){
                System.out.println(jugadores.get(i).getNombre());
            }
        }
    }
    public void MostrarNoConvocados(){
        for(int i=0; i<jugadores.size(); i++){
            if(!jugadores.get(i).isConvocado()){
                System.out.println(jugadores.get(i).getNombre());
            }
        }
    }
    public void falsecontarPorSeleccion(){
        int argentina=0;
        int francia=0;
        for(Jugador j: jugadores){
            if(j.getSeleccion().equals("Argentina")){
                argentina++;
            }else if(j.getSeleccion().equals("Francia")){
                francia++;
            }
        }
        System.out.println("Jugadores de Argentina: "+argentina);
        System.out.println("Jugadores de Francia: "+francia);
    }
    
    public void JugadorMasJoven(){
        Jugador jugadorMasJoven = jugadores.get(0);
        for(int i=0; i<jugadores.size();i++){
            if(jugadores.get(i).getEdad() < jugadorMasJoven.getEdad()){
                jugadorMasJoven = jugadores.get(i);
            }
        }
        System.out.println("El jugador mas joven es: " + jugadorMasJoven.getNombre() + " con" + jugadorMasJoven.getEdad() + " años");
    }
    public void JugadorMasVeterano(){
        Jugador jugadorMasVeterano = jugadores.get(0);
        for(int i=0; i<jugadores.size();i++){
            if(jugadores.get(i).getEdad()> jugadorMasVeterano.getEdad()){
                jugadorMasVeterano = jugadores.get(i);
            }
        }
        System.out.println("El jugador mas veterano es: " + jugadorMasVeterano.getNombre() + " con" + jugadorMasVeterano.getEdad() + " años");
    }
    public void buscarPorEquipo(String equipo){
        for(int i=0; i<jugadores.size();i++){
            if(jugadores.get(i).getEquipo().equals(equipo)){
                System.out.println(jugadores.get(i).getNombre());
            }
        }
    }
    public void OrdenarPorEdad(){
        for(int i=0; i<jugadores.size();i++){
            for(int j=0; j<jugadores.size()-1; j++){
                if(jugadores.get(j).getEdad()> jugadores.get(j+1).getEdad()){
                    Jugador temp = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j+1));
                    jugadores.set(j+1, temp);
                }
            }
            
        }
    }
    public void ContarPorPosicion(){
        int arqueros=0;
        int defensores=0;
        int mediocampistas=0;
        int delanteros=0;
        for(int i=0; i<jugadores.size();i++){
            if(jugadores.get(i).getPosicion().equals("Arquero")){
                arqueros++;
            }else if(jugadores.get(i).getPosicion().equals("Defensor")){
                defensores++;
            }else if(jugadores.get(i).getPosicion().equals("Mediocampista")){
                mediocampistas++;
            }else if(jugadores.get(i).getPosicion().equals("Delantero")){
                delanteros++;
            }
            }
            System.out.println("Cantidad de arqueros: "+arqueros);
            System.out.println("Cantidad de defensores: "+defensores);
            System.out.println("Cantidad de mediocampistas: "+mediocampistas);
            System.out.println("Cantidad de delanteros: "+delanteros);
        }
        
         String encontrarNombre;
        public void estaConvocado(){
            System.out.println("Ingrese el nombre del jugador para verificar si esta convocado: "+encontrarNombre);
            for(int i=0; i<jugadores.size();i++){
                if(jugadores.get(i).getNombre().equals(encontrarNombre)){
                    if(jugadores.get(i).isConvocado()){
                        System.out.println("El jugador " +encontrarNombre + " esta convocado");
                    } else {
                        System.out.println("El jugador " +encontrarNombre + " no esta convocado");
                    }
                }
            }
        }
        public void PromedioEdad(){
            int sumarEdad= 0;
            for(int i=0; i<jugadores.size();i++){
                sumarEdad += jugadores.get(i).getEdad();

            }
            double promedio = (double) sumarEdad / jugadores.size();
            System.out.printf("El promedio de edad de los jugadores es: %.2f%n" , promedio);
        }
    }
    
    


