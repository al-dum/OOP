import java.util.ArrayList;

public class Evento {

     int id;
    private String nombre;
    protected String url;
    private Fecha fecha;
    private String username;



    /**
     * Constructor de la clase Evento
     * @param id numero para identificar el evento
     * @param nombre
     * @param url
     */
    public Evento(int id, String nombre, String url) {

        this.id = id;
        this.nombre = nombre;
        this.url = url;
        fecha = new Fecha(0,0,0);
    }

    /**
     * Constructor de la clase Evento
     * @param id
     * @param nombre
     * @param url
     * @param fecha
     */
    public Evento(int id, String nombre, String url, Fecha fecha) {

        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.fecha = fecha;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public String toString() {

        return "Evento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", fecha=" + fecha +
                '}';
    }



}
