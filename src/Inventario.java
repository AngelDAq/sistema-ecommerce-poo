import java.util.ArrayList;
import java.util.List;

public class Inventario {

    // Lista que guardará todos los productos (sean físicos o digitales)
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }


    // 1. Agregar un producto nuevo al catálogo

    public void agregarProducto(Producto... productos) {
        for (Producto p : productos) {
            if (p != null) {
                this.productos.add(p);
                System.out.println(p.getCodigo() + "---"  + p.getNombre());

            }
        }
    }


    // 2. Buscar un producto por su código especifico

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto p : this.productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Producto encontrado" );
                return p; // Lo encontró
            }
        }
        return null; // No existe
    }



    // R1: Sistema debe verificar que la cantidad solicitada de un producto este disponible en el inventario
    public boolean hayStock(String codigo, int cantidadRequerida) {
        Producto p = buscarProductoPorCodigo(codigo);
        if (p != null && p.getStock() >= cantidadRequerida) {
            System.out.println("Hay stock");
        }
        //Si el cliente intenta comprar mas unidades de las existentes la operación se rechaza y muestra error de inventario insuficiente

        return false;
    }



}
