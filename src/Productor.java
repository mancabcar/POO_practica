import java.util.ArrayList;

public class Productor {
    private ArrayList<Producto> productos;
    private String tipoProductor;

    private float hectareasGranProductor;

    private float hectareasTotales;

    public float getHectareasTotales() {
        return hectareasTotales;
    }

    public void setHectareasTotales(float hectareasTotales) {
        this.hectareasTotales = hectareasTotales;
    }

    public float getHectareasGranProductor() {
        return hectareasGranProductor;
    }

    public void setHectareasGranProductor(float hectareasGranProductor) {
        this.hectareasGranProductor = hectareasGranProductor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getTipoProductor() {
        return tipoProductor;
    }

    public void setTipoProductor(String tipoProductor) {
        this.tipoProductor = tipoProductor;
    }

    public Productor(ArrayList<Producto> productos, int hectareasMaximas) {
        this.productos = productos;
        this.hectareasGranProductor = hectareasMaximas;
        this.hectareasTotales = 0;
        calcularHectareasTotales();
        decidirTipoProductor();
    }

    private void decidirTipoProductor() {
        if (getProductos().size() > 5) {
            setTipoProductor("Gran productor");
        } else if (getHectareasTotales() > 5) {
            setTipoProductor("Gran productor");
        } else {
            setTipoProductor("Pequeño productor");
        }
    }

    private void calcularHectareasTotales() {
        for (Producto producto : getProductos()) {
            setHectareasTotales(getHectareasTotales() + producto.getHectareas());
        }
    }

    private void anadirProducto(Producto producto) {
        this.productos.add(producto);
        setHectareasTotales(getHectareasTotales() + producto.getHectareas());
        decidirTipoProductor();
    }
}
