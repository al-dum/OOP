package libro;

import java.util.Date;

public class Libro {
    private int id;
    private Date fecha;
    private Editorial editorial;
    public Libro(int id, Date fecha, Editorial editorial) {
        this.id = id;
        this.fecha = fecha;
        this.editorial = editorial;
    }
    public Libro() {
        this.id = 0;
        this.fecha = new Date();
        this.editorial = new Editorial();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }


}
