import java.util.ArrayList;

public class Carpeta extends Componente{
    private final ArrayList<Componente> contenido;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
    }

    public int getTamanio() {
        int tamanio = 0;
        for(Componente c: contenido){
            tamanio += c.getTamanio();
        }
        return tamanio;
    }

    @Override
    public void aniadir(Componente c) {
        contenido.add(c);
    }

    @Override
    public void eliminar(Componente c) {
        contenido.remove(c);
    }

    @Override
    public String verDetalles() {
        StringBuilder detalles= new StringBuilder("Carpeta: " + nombre + ", Tamaño Total: " + getTamanio() + "KB, Contiene: " + contenido.size() + " elementos");
        for(Componente c: contenido){
            detalles.append("\n").append(c.verDetalles());
        }
        return detalles.toString();
    }

}
