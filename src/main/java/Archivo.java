public class Archivo extends Componente{
    private final String tipoArchivo;
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

    @Override
    public String verDetalles() {
        return "Archivo: " + nombre + ", Tamaño: " + tamanio + "KB, Tipo: " + tipoArchivo;
    }
}
