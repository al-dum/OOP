package zoo;

import java.util.List;

public class Mamifero extends Animal {

    private int numMamas;
    private boolean tienePelo;
    private List<String> alimentacion;

    public Mamifero(int id, String nombre, int edad, boolean tienePelo, int numMamas, List<String> alimentacion) {
        super(id, nombre, edad, tienePelo);
        this.numMamas = numMamas;
        this.tienePelo = tienePelo;
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        String resultado = "Mamifero Nombre " + getNombre() + " Id Mamifero " + getId() + " Numero Mamas " + numMamas + "\r\n";
        resultado += super.toString();
        resultado += "Comida: \r\n";

        for (String comida : alimentacion) {
            resultado += "\t- " + comida + "\r\n";
        }

        return resultado;
    }
}

