public class ProductoFisico extends Producto {
    private double peso;

    // Constructor
    public ProductoFisico(String codigo, String nombre, double precioBase, int stock, double peso) {
        super(codigo, nombre, precioBase, stock);
        this.peso = peso;
    }

    // Sobrescritura del método para calcular el costo de envío físico
    //Requsiito obligatorio de tener metodo abstracto para que funcione el sistema
    //R2: El sistema debe calcular el envió de los productos físicos multiplicando su peso por la tarifa establecida
    @Override
    public double calcularCostoEnvio() {
        double tarifaPorKilo = 5000.0; // Tarifa base de ejemplo
        return this.peso * tarifaPorKilo;
    }

    // Getter y Setter de peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
