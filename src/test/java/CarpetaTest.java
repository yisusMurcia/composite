import static org.junit.jupiter.api.Assertions.*;

class CarpetaTest {

    @org.junit.jupiter.api.Test
    void aniadir() {
        Carpeta carpeta = new Carpeta("root");
        Archivo archivo = new Archivo("file.txt", 10, "txt");
        Carpeta subcarpeta = new Carpeta("sub");

        carpeta.aniadir(archivo);
        assertEquals(10, carpeta.getTamanio()); // Size should be 10 after adding file

        carpeta.aniadir(subcarpeta);
        assertEquals(10, carpeta.getTamanio()); // Subfolder has size 0, total still 10

        subcarpeta.aniadir(new Archivo("subfile.txt", 5, "txt"));
        assertEquals(15, carpeta.getTamanio());
    }

    @org.junit.jupiter.api.Test
    void eliminar() {
        Carpeta carpeta = new Carpeta("root");
        Archivo archivo = new Archivo("file.txt", 10, "txt");
        carpeta.aniadir(archivo);
        assertEquals(10, carpeta.getTamanio());

        carpeta.eliminar(archivo);
        assertEquals(0, carpeta.getTamanio()); // Size should be 0 after removing

        carpeta.aniadir(archivo);
        carpeta.aniadir(new Archivo("subfile.txt", 5, "txt"));
        Componente subcarpeta = new Carpeta("sub");
        subcarpeta.aniadir(new Archivo("subsubfile.txt", 2, "txt"));
        carpeta.aniadir(subcarpeta);
        carpeta.eliminar(subcarpeta);
        assertEquals(15, carpeta.getTamanio()); // Removing subfolder should not affect size of files in root
    }

    @org.junit.jupiter.api.Test
    void verDetalles() {
        Carpeta carpeta = new Carpeta("root");
        Archivo archivo1 = new Archivo("doc.txt", 5, "txt");
        Archivo archivo2 = new Archivo("image.jpg", 20, "jpg");
        Carpeta subcarpeta = new Carpeta("docs");
        Archivo archivo3 = new Archivo("readme.md", 2, "md");
        subcarpeta.aniadir(archivo3);

        carpeta.aniadir(archivo1);
        carpeta.aniadir(archivo2);
        carpeta.aniadir(subcarpeta);

        String detalles = carpeta.verDetalles();
        System.out.println(detalles);
        assertTrue(detalles.contains("Carpeta: root, Tamaño Total: 27KB, Contiene: 3 elementos"));
        assertTrue(detalles.contains("Archivo: doc.txt, Tamaño: 5KB, Tipo: txt"));
        assertTrue(detalles.contains("Archivo: image.jpg, Tamaño: 20KB, Tipo: jpg"));
        assertTrue(detalles.contains("Carpeta: docs, Tamaño Total: 2KB, Contiene: 1 elementos"));
        assertTrue(detalles.contains("Archivo: readme.md, Tamaño: 2KB, Tipo: md"));
    }
}