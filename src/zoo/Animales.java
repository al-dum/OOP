package zoo;

import java.util.ArrayList;
import java.util.List;

public class Animales {

    protected int id;
    protected String nombre;
    private List<Localizacion> historial;
    protected List<Comida> alimentacion;

    public Animales(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        alimentacion = new ArrayList<>();
        historial = new ArrayList<>();
    }

    public void AgregarComida(Comida c) {
        alimentacion.add(c);
    }

    public void AgregarLocalizacion(Localizacion f) {
        historial.add(f);
    }

    public String toString() {
        String res = "Historial: \r\n";

        for (int i=0; i<historial.size(); i++) {
            res += "\t- " + historial.get(i) + "\r\n";
        }

        return res;
    }



}

