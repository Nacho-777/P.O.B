import java.util.Scanner;
public class Main_4 {
    public static void main(String[] args){
            String [ ] [ ] datos = {
                // Argentina
                {"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true", "Argentina"},
                {"Cristian Romero", "Defensor", "28", "Tottenham", "true", "Argentina"},
                {"Nicolas Otamendi", "Defensor", "38", "Benfica", "true", "Argentina"},
                {"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true", "Argentina"},
                {"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true", "Argentina"},
                {"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true", "Argentina"},
                {"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true", "Argentina"},
                {"Lionel Messi", "Delantero", "39", "Inter Miami", "true", "Argentina"},
                {"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true", "Argentina"},
                {"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true", "Argentina"},
                {"Paulo Dybala", "Delantero", "33", "Roma", "false", "Argentina"},
                // Francia
                {"Mike Maignan", "Arquero", "31", "Milan", "true", "Francia"},
                {"William Saliba", "Defensor", "25", "Arsenal", "true", "Francia"},
                {"Theo Hernandez", "Defensor", "29", "Milan", "true", "Francia"},
                {"Jules Kounde", "Defensor", "28", "Barcelona", "true", "Francia"},
                {"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true", "Francia"},
                {"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true", "Francia"},
                {"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true", "Francia"},
                {"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true", "Francia"},
                {"Ousmane Dembele", "Delantero", "29", "PSG", "true", "Francia"},
                {"Marcus Thuram", "Delantero", "29", "Inter Milan", "true", "Francia"},
                {"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false", "Francia"}
                };
                Seleccion seleccion = new Seleccion();
                for(int i=0; i<datos.length; i++){
                    String nombre = datos[i][0];
                    String posicion = datos[i][1];
                    int edad = Integer.parseInt(datos[i][2]);
                    String equipo = datos[i][3];
                    boolean convocado = Boolean.parseBoolean(datos[i][4]);
                    String pais = datos[i][5];
                    Jugador jugador = new Jugador(nombre, posicion, edad, equipo, convocado, pais);
                    seleccion.agregarJugador(jugador);
                }
                Scanner teclado = new Scanner(System.in);
                int opcion = -1;
                do{
                    System.out.println("\n===== MENU SELECCION =====");
                    System.out.println("1. Eliminar jugador");
                    System.out.println("2. Buscar por posicion");
                    System.out.println("3. Mostrar convocados");
                    System.out.println("4. Mostrar no convocados");
                    System.out.println("5. Contar por seleccion");
                    System.out.println("6. Mostrar jugador mas joven");
                    System.out.println("7. Mostrar jugador mas veterano");
                    System.out.println("8. Buscar por equipo");
                    System.out.println("9. Ordenar por edad");
                    System.out.println("10. Contar por posicion");
                    System.out.println("11. Verificar si un jugador esta convocado");
                    System.out.println("12. Mostrar promedio de edad");
                    System.out.println("0. Salir");
                    System.out.print("Ingrese una opcion: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine(); 

                    switch (opcion) {
                        case 1:
                        System.out.print("Nombre del jugador a eliminar: ");
                        String eliminar = teclado.nextLine();
                        seleccion.eliminarJugador(eliminar);
                        break;
                        case 2:
                        System.out.println("Posicion a buscar:");
                        String posicion = teclado.nextLine();
                        seleccion.BuscarPorPosicion(posicion);
                        break;
                        case 3:
                        seleccion.MostrarConvocados();
                        break;
                        case 4:
                            seleccion.MostrarNoConvocados();
                            break;
                        case 5:
                            seleccion.falsecontarPorSeleccion();
                            break;
                        case 6:
                            seleccion.JugadorMasJoven();
                            break;
                        case 7:
                            seleccion.JugadorMasVeterano();
                            break;
                        case 8:
                            System.out.println("Equipo a buscar:");
                            String equipo = teclado.nextLine();
                            seleccion.buscarPorEquipo(equipo);
                            break;
                        case 9:
                            seleccion.OrdenarPorEdad();
                            break;
                        case 10:
                            seleccion.ContarPorPosicion();
                            break;
                        case 11:
                            seleccion.estaConvocado();
                            break;
                        case 12:
                            seleccion.PromedioEdad();
                            break;
                        case 0:
                            System.out.println("Saliendo del programa...");
                            opcion = 0;
                            break;
                        default:
                            System.out.println("Opcion no valida, intente nuevamente.");
                            break;
                    }
                }while (opcion !=0);
    }
}
