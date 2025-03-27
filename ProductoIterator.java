import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
public class ProductoIterator {
	  private final Iterator<Producto> iterator;
	    private final Predicate<Producto> filtro;
	    private Producto siguiente;

	    public ProductoIterator(List<Producto> productos, Predicate<Producto> filtro) {
	        this.iterator = productos.iterator();
	        this.filtro = filtro;
	        avanzar();
	    }

	    private void avanzar() {
	        while (iterator.hasNext()) {
	            siguiente = iterator.next();
	            if (filtro.test(siguiente)) return;
	        }
	        siguiente = null;
	    }

	    @Override
	    public boolean hasNext() {
	        return siguiente != null;
	    }

	    @Override
	    public Producto next() {
	        Producto actual = siguiente;
	        avanzar();
	        return actual;
	    }
	}

