import java.util.ArrayList;

public class Carpeta extends Componente{
    private final ArrayList<Componente> contenido;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.contenido = new ArrayList<>();
        this.tamanio = 0;
    }

    @Override
    public void aniadir(Componente c) {
        contenido.add(c);
        tamanio += c.tamanio;
    }

    @Override
    public void eliminar(Componente c) {
        if(contenido.remove(c)){
            tamanio -= c.tamanio;
        }
    }

    @Override
    public String verDetalles() {
        StringBuilder detalles= new StringBuilder("Carpeta:" + nombre + ", Tamaño Total: " + tamanio + "KB, Contiene: " + contenido.size() + " elementos");
        for(Componente c: contenido){
            detalles.append("\n").append(c.verDetalles());
        }
        return detalles.toString();
    }

}
