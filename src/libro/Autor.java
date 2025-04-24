package libro;

import java.util.Date;
import java.util.List;

public class Autor {
    private String nombre;
    private Libro libros[];
    //private List<Libro> libros;
    private int count;
    public Autor(String nombre, int maxLibros) {
        this.nombre = nombre;
        count = 0;
        this.libros = new Libro[maxLibros];
    }
    private void inicializarArray() {
        for (int i = 0; i< libros.length; i++) {
            libros[i] =  new Libro();
        }
    }

    public boolean anadirLibro(Libro libro){
        if(count < libros.length){
            libros[count] = libro;
            count++;
            return true;
        }
        return false;
    }
}
