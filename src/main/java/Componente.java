public abstract class Componente {
    protected String nombre;
    public abstract void aniadir(Componente c);
    public abstract void eliminar(Componente c);
    public abstract String verDetalles();
    public abstract int getTamanio();
}
