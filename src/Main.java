import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Se crea objeto scanner
        Scanner sc = new Scanner(System.in);


        System.out.print("Datos del cliente: ");


        System.out.print("Escribe tu ID de cliente: ");
        int idCliente = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea pendiente

        System.out.print("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escribe tu correo: ");
        String correo = sc.nextLine();





        //Se instancia objeto para Cliente



        Cliente cliente =new Cliente(idCliente, nombre, correo);


        //inventario almacenado previamente en el sistema
        // Productos fisicos
        ProductoFisico p1 = new ProductoFisico("A01", "Honor", 1200000, 10, 1.50); // El que ya tenías
        ProductoFisico p2 = new ProductoFisico("A02", "iPhone 14 Pro", 4500000, 5, 0.20);
        ProductoFisico p3 = new ProductoFisico("A03", "Samsung Galaxy Tab S8", 2800000, 8, 0.50);
        ProductoFisico p4 = new ProductoFisico("A04", "Xiaomi Redmi Note 12", 850000, 15, 0.18);

        //Productos digitales
        ProductoDigital d1 = new ProductoDigital("A05", "Video juego", 300000, 4, "https://steam.com/download/12345");
        ProductoDigital d2 = new ProductoDigital("A06", "Cyberpunk 2077 (PC)", 180000, 10, "https://gog.com/cyberpunk");
        ProductoDigital d3 = new ProductoDigital("A07", "FIFA 24 (PS5)", 250000, 5, "https://store.playstation.com/fifa24");



        Inventario inventario=new Inventario();



        int opcion = 0;

        while (opcion != 4) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Mostrar inventario Productos fisicos");
            System.out.println("2. Mostrar inventario Productos Digitales");
            System.out.println("3. Buscar productos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Productos Fisicos:");
                    inventario.agregarProducto(p1, p2, p3, p4);
                    break;
                case 2:
                    System.out.println("Productos Digitales:");
                    inventario.agregarProducto(d1, d2,d3);

                    break;
                case 3:
                    System.out.println("Escribe el codigo del producto: ");
                    String codigoProducto=sc.nextLine();
                    sc.nextLine();
                    inventario.buscarProductoPorCodigo(codigoProducto);


                    System.out.println("Cuantos productos desea seleccionar:");

                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

























    }
}

