import javax.swing.*;

public class Productos {
    private String nombre;
    private String codigo;
    private String escritor;
    private String stock;
    private double precio;
    private int cantidadProducto;

    public Productos(String nombre, String codigo, String escritor, String stock, double precio, int cantidadProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escritor = escritor;
        this.stock = stock;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
    }

    // Getters y Setters

    public static Productos nuevosproductos() {
        double auxPrecio = 0;
        int auxCantidad = 0;
        String creadorProductoNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a añadir");
        String creadorProductoCodigo = JOptionPane.showInputDialog(null, "Ingrese el código del producto que quiere añadir");
        String creadorProductoEscritor = JOptionPane.showInputDialog(null, "Ingrese el nombre del escritor");
        String creadorProductoStock = JOptionPane.showInputDialog(null, "Existe stock: Si o No");
        String creadorProductoPrecio = JOptionPane.showInputDialog(null, "Ingrese el precio del producto");
        String creadorProductoCantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos que se añaden");
        auxPrecio = Double.parseDouble(creadorProductoPrecio);
        auxCantidad = Integer.parseInt(creadorProductoCantidad);
        return new Productos(creadorProductoNombre, creadorProductoCodigo, creadorProductoEscritor, creadorProductoStock, auxPrecio, auxCantidad);
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " - Código: " + codigo + " - Escritor: " + escritor + " - Stock: " + stock + " - Precio: $" + precio + " - Cantidad en stock: " + cantidadProducto;
    }
}
