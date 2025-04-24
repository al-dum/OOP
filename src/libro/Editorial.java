package libro;

public class Editorial {
    private String nombre; // variable global
    private Direccion direccion;

    public Editorial(String nombre , Direccion direccion) { //variable del metodo
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Editorial() {
        this.nombre = "";
        this.direccion = new Direccion("","");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


}
