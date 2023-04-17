import java.util.ArrayList;

public class ProductorFederado {
    private ArrayList<Productor> productores;

    private final Producto productoFederado;

    private float sumaHectareas;

    public ProductorFederado(ArrayList<Productor> productores, Producto productoFederado) {
        this.productores = productores;
        this.productoFederado = productoFederado;
    }

    public ArrayList<Productor> getProductores() {
        return productores;
    }

    public void setProductores(ArrayList<Productor> productores) {
        this.productores = productores;
    }

    public Producto getProductoFederado() {
        return productoFederado;
    }

    public float getSumaHectareas() {
        return sumaHectareas;
    }

    public void setSumaHectareas(float sumaHectareas) {
        this.sumaHectareas = sumaHectareas;
    }

    private void anadirProductor(Productor productor, float hectareasCultivo) {
        this.productores.add(productor);
        setSumaHectareas(getSumaHectareas() + hectareasCultivo);
    }
}
