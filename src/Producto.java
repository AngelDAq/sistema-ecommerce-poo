public abstract class Producto {
        private String codigo;
        private String nombre;
        private double precioBase;
        private int stock;

        // Constructor
        public Producto(String codigo, String nombre, double precioBase, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precioBase = precioBase;
            this.stock = stock;
        }

        // Método abstracto para implementar en las clases hijas (Polimorfismo) se da la orden el contrato

        public abstract double calcularCostoEnvio();


        //R1.El sistema debe verificar que la cantidad solicitada de un producto esté disponible en el inventario. Si el cliente intenta comprar más unidades de las existentes, la operación debe rechazarse y mostrar un error de inventario insuficiente.



        // Método para actualizar el stock (restar cuando se compra)
        public void actualizarStock(int cantidad) {
            this.stock -= cantidad;
        }

        // Getters y Setters (para mantener el encapsulamiento privado)

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {

            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(double precioBase) {
            this.precioBase = precioBase;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }


}
