public class Main {
    public static void main(String[] args) {

        System.out.println("===== SISTEMA DE GESTION DE SUPERMERCADO =====");
        System.out.println("1. Productos");
        System.out.println("2. Clientes");
        System.out.println("3. Empleados");
        System.out.println("4. Ventas");
        System.out.println("5. Salir");

        Producto arroz = new Producto();
        arroz.nombre = "Arroz";
        arroz.codigo = "A001";
        arroz.precio = 1.50;
        arroz.stock = 50;
        arroz.fechaVencimiento = "2027-01-15";
        arroz.area = "Granos";

        arroz.mostrarInformacion();
        System.out.println();
        arroz.venderProducto(20);
        System.out.println();
        arroz.mostrarInformacion();


    }
}
