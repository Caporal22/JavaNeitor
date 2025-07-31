package ventas;
/*  productos []
 *   agregarProducto()
 *   calcularTotal()
 *   mostrarOrden()
 * */
public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else System.out.println("Se ha superado el máximo de productos: "
            + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
//            var producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("ID Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("\tEl total de la orden: $" + totalOrden);
        System.out.println("\tProductos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++){
            System.out.println("\t\t" + this.productos[i]);
        }
    }

}
