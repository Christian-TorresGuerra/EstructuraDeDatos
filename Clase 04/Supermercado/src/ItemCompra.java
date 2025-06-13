public class ItemCompra {
    private Producto producto;
    private int cantidad;

    public ItemCompra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    public String toString() {
        return producto.getNombre() + " x" + cantidad + " = $" + getSubtotal();
    }
}
