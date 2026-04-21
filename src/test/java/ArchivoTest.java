import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArchivoTest {

    @Test
    void aniadir() {
        Archivo archivo = new Archivo("test.txt", 10, "txt");
        Componente dummy = new Archivo("dummy.pdf", 5, "pdf");
        archivo.aniadir(dummy); // Leaves do nothing on add
        // No assertion needed as method is void and does nothing
    }

    @Test
    void eliminar() {
        Archivo archivo = new Archivo("test.txt", 10, "txt");
        Componente dummy = new Archivo("dummy.pdf", 5, "pdf");
        archivo.eliminar(dummy); // Leaves do nothing on remove
        // No assertion needed as method is void and does nothing
    }

    @Test
    void verDetalles() {
        Archivo archivo = new Archivo("documento.txt", 15, "txt");
        String expected = "Archivo: documento.txt, Tamaño: 15KB, Tipo: txt";
        assertEquals(expected, archivo.verDetalles());
    }
}