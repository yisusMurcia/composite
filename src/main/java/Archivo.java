public class Archivo extends Componente{
    private final String tipoArchivo;
    private final int tamanio;
     public Archivo(String nombre, int tamanio, String tipoArchivo) {
         this.nombre = nombre;
         this.tamanio = tamanio;
         this.tipoArchivo = tipoArchivo;
     }

    @Override
    public void aniadir(Componente c) {

    }

    @Override
    public void eliminar(Componente c) {

    }

    public int getTamanio() {
        return tamanio;
    }

    @Override
    public String verDetalles() {
        return "Archivo: " + nombre + ", Tamaño: " + tamanio + "KB, Tipo: " + tipoArchivo;
    }
}
