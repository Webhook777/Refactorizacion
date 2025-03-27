import java.util.List;

class ReporteSupermercado {
	    public static void main(String[] args) {
	        List<Producto> productos = List.of(
	            new Producto("Manzana", "Frutas", 1.5),
	            new Producto("Leche", "Lácteos", 2.0),
	            new Producto("Queso", "Lácteos", 5.0),
	            new Producto("Cereal", "Cereales", 3.5)
	        );

	        // Generar reporte de productos con precio mayor a 2€
	        System.out.println("Productos con precio mayor a 2€:");
	        for (Producto p : productos) {
	            if (p.getPrecio() > 2) {
	                System.out.println(p.getNombre() + " - " + p.getPrecio() + "€");
	            }
	        }

	        // Generar reporte de productos de la categoría "Lácteos"
	        System.out.println("\nProductos de la categoría Lácteos:");
	        for (Producto p : productos) {
	            if (p.getCategoria().equals("Lácteos")) {
	                System.out.println(p.getNombre() + " - " + p.getCategoria());
	            }
	        }
	    }
	}

