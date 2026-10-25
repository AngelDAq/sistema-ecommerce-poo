public class Main {

    public static void main(String[] args) {

        // 1. Crear el inventario
        Inventario inventario = new Inventario();

        // 2. Crear productos (físicos y digitales)
        ProductoFisico mouse = new ProductoFisico("P001", "Mouse Gamer", 80000.0, 10, 0.5);
        ProductoFisico teclado = new ProductoFisico("P002", "Teclado Mecanico", 150000.0, 5, 1.2);
        ProductoDigital curso = new ProductoDigital("P003", "Curso Java", 60000.0, 100, "www.cursos.com/java");

        // 3. Agregar productos al inventario
        inventario.agregarProducto(mouse, teclado, curso);

        // 4. Crear el cliente
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@correo.com");

        // 5. Crear el pedido (esto ya lo asocia al cliente automáticamente)
        Pedido pedido = new Pedido(100, cliente);

        // 6. Verificar stock antes de comprar (R1)
        if (inventario.hayStock("P001", 2)) {
            DetallePedido d1 = new DetallePedido(2, mouse);
            pedido.agregarDetalle(d1);
            mouse.actualizarStock(2);
        }

        if (inventario.hayStock("P002", 1)) {
            DetallePedido d2 = new DetallePedido(1, teclado);
            pedido.agregarDetalle(d2);
            teclado.actualizarStock(1);
        }

        if (inventario.hayStock("P003", 1)) {
            DetallePedido d3 = new DetallePedido(1, curso);
            pedido.agregarDetalle(d3);
            curso.actualizarStock(1);
        }

        // 7. Mostrar el total del pedido (con descuento del 10% si aplica - R3)
        System.out.println("Total del pedido: $" + pedido.getTotal());
        System.out.println("Estado del pedido: " + pedido.getEstado());

        // 8. Calcular costo de envio (R2)
        System.out.println("Costo envio mouse: $" + mouse.calcularCostoEnvio());
        System.out.println("Costo envio teclado: $" + teclado.calcularCostoEnvio());
        System.out.println("Costo envio curso: $" + curso.calcularCostoEnvio());

        // 9. Procesar el pago
        Pago pago = new Pago(1, pedido, "Tarjeta");
        pago.procesarPago();

        System.out.println("Estado final del pedido: " + pedido.getEstado());
    }
}






















