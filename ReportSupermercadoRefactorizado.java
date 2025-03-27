import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
public class ReportSupermercadoRefactorizado {
	public static void main(String[] args) {
        List<Producto> productos = List.of(
            new Producto("Manzana", "Frutas", 1.5),
            new Producto("Leche", "Lácteos", 2.0),
            new Producto("Queso", "Lácteos", 5.0),
            new Producto("Cereal", "Cereales", 3.5)
        );

        // Reporte: Productos con precio mayor a 2€
        System.out.println("Productos con precio mayor a 2€:");
        Iterator<Producto> itPrecio = new ProductoIterator(productos, p -> p.getPrecio() > 2);
        while (itPrecio.hasNext()) {
            Producto p = itPrecio.next();
            System.out.println(p.getNombre() + " - " + p.getPrecio() + "€");
        }

        // Reporte: Productos de la categoría "Lácteos"
        System.out.println("\nProductos de la categoría Lácteos:");
        Iterator<Producto> itLacteos = new ProductoIterator(productos, p -> p.getCategoria().equals("Lácteos"));
        while (itLacteos.hasNext()) {
            Producto p = itLacteos.next();
            System.out.println(p.getNombre() + " - " + p.getCategoria());
        }
    }
}

