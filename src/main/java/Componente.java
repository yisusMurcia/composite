public abstract class Componente {
    protected String nombre;
    protected int tamanio;
    public abstract void aniadir(Componente c);
    public abstract void eliminar(Componente c);
    public abstract String verDetalles();
}
