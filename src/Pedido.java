import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Se Controla la transacción de compra del cliente. Implementando
 * la composición con DetallePedido y aplicar las reglas de negocio
 * relacionadas con el cálculo de totales y descuentos (R3).
 */
public class Pedido {

    private int idPedido;
    private Date fecha;
    private String estado; // Ejemplo: "Pendiente", "Pagado", "Enviado"
    private double total;

    // Relación de composición con DetallePedido (1 a 1..*)
    private List<DetallePedido> detalles;

    // Referencia al cliente que realiza el pedido
    private Cliente cliente;

    // Constructor para inicializar el pedido con su respectivo cliente.
    public Pedido(int idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = new Date(); // Fecha actual por defecto
        this.estado = "Pendiente";
        this.total = 0.0;
        this.detalles = new ArrayList<>();
        this.cliente = cliente;

        // Sincroniza automáticamente la relación bidireccional
        if (cliente != null) {
            cliente.agregarPedido(this);
        }
    }

    // Se agrega una línea de detalle al pedido y se recalculan los valores.
    public void agregarDetalle(DetallePedido detalle) {
        if (detalle != null) {
            this.detalles.add(detalle);
            this.calcularTotal(); // Actualiza el total automáticamente al modificar los ítems
        }
    }

    /*
     * Se hace el calculo del valor total acumulado del pedido sumando los subtotales
     * de los detalles y aplicando la regla de descuento por compras grandes.
     */
    public double calcularTotal() {
        double subtotalAcumulado = 0.0;

        for (DetallePedido detalle : this.detalles) {
            subtotalAcumulado += detalle.calcularSubtotal();
        }

        // Aquí se aplica el 10% de descuento si supera de $200.000
        if (subtotalAcumulado > 200000.0) {
            double descuento = subtotalAcumulado * 0.10;
            this.total = subtotalAcumulado - descuento;
        } else {
            this.total = subtotalAcumulado;
        }

        return this.total;
    }

    public void aplicarDescuento() {
        this.calcularTotal();
    }






    // Métodos getters y setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}