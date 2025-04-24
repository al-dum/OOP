package libro;

public class Direccion {
    private String localidad;
    private String calle;

    public Direccion(String localidad, String calle) {
        this.localidad = localidad;
        this.calle = calle;
    }

    public Direccion(){
        localidad = calle = "";
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
