import java.util.Dictionary;

public class ListaProductoresFederados {
    Dictionary<Producto, ProductorFederado> productoresFederados;

    public Dictionary<Producto, ProductorFederado> getProductoresFederados() {
        return productoresFederados;
    }

    public ListaProductoresFederados(Dictionary<Producto, ProductorFederado> productoresFederados) {
        this.productoresFederados = productoresFederados;
    }

    private void addProductorFederado(ProductorFederado productorFederado) {
        if (productoresFederados.get(productorFederado.getProductoFederado()) != null) {
            System.out.println("Ya existe productor federado para este producto");
        } else {
            productoresFederados.put(productorFederado.getProductoFederado(), productorFederado);
        }
    }
}
