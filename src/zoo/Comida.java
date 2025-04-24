package zoo;


public class Comida {

    private String nombre;
    private int cantidad;

    public Comida(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String toString(){
        return "Nombre: " + nombre + " Cantidad: " + cantidad;
    }
}
