import java.util.ArrayList;
public class Inventario{
    private ArrayList<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public void AgregarProductos(Producto p){
        productos.add(p);
    }
    public void ListarProductos(){
        for(Producto p: productos){
            p.mostrar();
        }
    }
    public int CantidadProductos(){
        return productos.size();
    }
}

