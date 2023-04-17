public class Producto {
    private String nombre;
    private float hectareas;

    private float rendimientoHectareaMedio;

    private float valorKilogramo;

    public Producto(String producto, float hectareas, float rendimientoHectareaMedio, float valorKilogramo) {
        this.valorKilogramo = valorKilogramo;
        this.nombre = producto;
        this.hectareas = hectareas;
        this.rendimientoHectareaMedio = rendimientoHectareaMedio;
    }

    public float getValorKilogramo() {
        return valorKilogramo;
    }

    public void setValorKilogramo(float valorKilogramo) {
        this.valorKilogramo = valorKilogramo;
    }

    public float getRendimientoHectareaMedio() {
        return rendimientoHectareaMedio;
    }

    public void setRendimientoHectareaMedio(float rendimientoHectareaMedio) {
        this.rendimientoHectareaMedio = rendimientoHectareaMedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHectareas() {
        return hectareas;
    }

    public void setHectareas(float hectareas) {
        this.hectareas = hectareas;
    }

    public float getRendimientoHectareasReal() {
        return getHectareas() * getRendimientoHectareaMedio();
    }
}
