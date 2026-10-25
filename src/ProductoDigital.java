public class ProductoDigital extends Producto {
    private String enlaceDescarga;

    // Constructor
    public ProductoDigital(String codigo, String nombre, double precioBase, int stock, String enlaceDescarga) {
        super(codigo, nombre, precioBase, stock);
        this.enlaceDescarga = enlaceDescarga;
    }

    // R2: El costo de envió debe ser siempre cero ya que se entregan mediante un enlace de descarga
    @Override
    public double calcularCostoEnvio() {
        return 0.0;
    }

    // Getter y Setter de enlace de descarga
    public String getEnlaceDescarga() {
        return enlaceDescarga;
    }

    public void setEnlaceDescarga(String enlaceDescarga) {
        this.enlaceDescarga = enlaceDescarga;
    }
}