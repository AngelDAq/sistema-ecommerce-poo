import java.util.Date;

/*
 * Se registra la transacción de pago asociada a un pedido.
 * Se guarda el método de pago usado y el estado de la transacción.
 */
public class Pago {

    private int idPago;
    private Pedido pedido;
    private double monto;
    private String metodoPago; // Ejemplo: "Efectivo", "Tarjeta", "PSE"
    private String estado;     // Ejemplo: "Aprobado", "Rechazado", "Pendiente"
    private Date fechaPago;

    public Pago(int idPago, Pedido pedido, String metodoPago) {
        this.idPago = idPago;
        this.pedido = pedido;
        this.metodoPago = metodoPago;
        this.estado = "Pendiente";
        this.fechaPago = new Date();

        // El monto se toma del total calculado del pedido
        if (pedido != null) {
            this.monto = pedido.calcularTotal();
        } else {
            this.monto = 0.0;
        }
    }

    // Se procesa el pago y se actualiza el estado del pedido si es aprobado
    public boolean procesarPago() {
        if (this.monto > 0 && this.pedido != null) {
            this.estado = "Aprobado";
            this.pedido.setEstado("Pagado");
            System.out.println("Pago aprobado por $" + this.monto);
            return true;
        } else {
            this.estado = "Rechazado";
            System.out.println("Pago rechazado: monto invalido o pedido nulo");
            return false;
        }
    }

    // Getters y Setters
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }
}
