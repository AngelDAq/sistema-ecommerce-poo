import java.util.ArrayList;
import java.util.List;

/*
 * Aquí se hace interacción con la plataforma de comercio electrónico.
 * Se organiza la información personal manteniendo la relación de asociación con sus pedidos.
 */
public class Cliente {

    // Atributos privados orientados al encapsulamiento
    private int idCliente;
    private String nombre;
    private String correo;
    private List<Pedido> listaPedidos; // Relación 1 a * con Pedido

    // Constructor principal para inicializar el cliente.
    public Cliente(int idCliente, String nombre, String correo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.listaPedidos = new ArrayList<>();
    }

    // En esta parte se permite asociar un nuevo pedido al historial del cliente.
    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            this.listaPedidos.add(pedido);
        }
    }

    // --- GETTERS Y SETTERS ---
    // (Nota: Te los agrego aquí abajo porque tu clase Pedido los necesita
    // para funcionar bien, aunque en tu texto no los tenías).

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}