public class DetallePedido {
    private int cantidad;
    private Producto producto;




    public DetallePedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //El sistema debe aplicar automáticamente un descuento de 10% cuando el subtotal de los productos supere los $200.000 COP.
    public double calcularSubtotal() {
        double subtotal = this.cantidad * this.producto.getPrecioBase();
        System.out.println(subtotal);
        return subtotal;
    }


    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
         this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}