package zoo;

public class Animal {
    private String nombre;
    private float peso;
    private int edad;
    private String especie;
    private int id;


    public Animal (String nombre, float peso, int edad, String especie, boolean tienePelo){
        this.nombre = this.nombre;
        this.peso = peso;
        this.edad = this.edad;
        this.especie = especie;
        this.id = id;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
