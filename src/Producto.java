public class Producto {
    String nombre;
    String codigo;
    double precio;
    int stock;
    String fechaVencimiento;
    String area;

void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Codigo: " + codigo);
    System.out.println("Precio: " + precio);
    System.out.println("Stock: " + stock);
    System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
    System.out.println("Area: " + area);
}

void venderProducto(int cantidad) {
            if (cantidad <= stock) {
                stock = stock - cantidad;
                System.out.println("Venta realizada");
                System.out.println("Stock restante: " + stock);
            } else {
                System.out.println("Stock insuficiente");
    }
}
}
