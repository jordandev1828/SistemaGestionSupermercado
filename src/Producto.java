public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int stock;
    private String fechaVencimiento;
    private String area;

    // CONSTRUCTOR
        public Producto(
                String nombre,
                String codigo,
                double precio,
                int stock,
                String fechaVencimiento,
                String area
        ) {
            this.nombre = nombre;
            this.codigo = codigo;
            setPrecio(precio);
            setStock(stock);
            this.fechaVencimiento = fechaVencimiento;
            this.area = area;
        }

        // Aquí siguen los getters, setters y métodos...


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }
    }



    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento= fechaVencimiento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void agregarStock(int cantidad) {
        if (cantidad >= 0) {
            this.stock += cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa");
        }
    }

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
