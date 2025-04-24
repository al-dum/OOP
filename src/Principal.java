import libro.Direccion;
import libro.Editorial;

public class Principal {

    public static void main(String[] args) {
        Evento evento = new Evento(1, "evento 1", "url 1");
        Evento evento2 = evento;
        evento2.nombre = "SONO  ";
        //evento3;
        System.out.println(evento.id + ", " + evento.nombre + ", " + evento.url);

    Evento evento3 = new Evento(0,"Nombre0","URL0",new Fecha(2006,6,5));
        evento2.setNombre("evento2");
    Fecha f = new Fecha(-1,12,31);

        System.out.println(evento);
    int numElementos = 1000;
    Evento eventos[] = new Evento[numElementos];
    int i = 0;
        while (i<numElementos){
        eventos[i] = new Evento(i, "evento"+i, "url"+i, new Fecha (2000+i,i,i));

        i++;
    }
        System.out.println("Fin");
}

    public static void main(String[] args) {
        Direccion d1 = new Direccion("localidad 1", "calle 1");
        Editorial e1 = new Editorial()
    }

}
