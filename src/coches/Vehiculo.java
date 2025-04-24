package coches;

public class Vehiculo {
    Motor motor;
    String marca;
    Vehiculo(String marcaV, String marcaM) {
        motor = new Motor(marcaM);
        marca = marcaV;
    }


//    Motor motor;
//    String marca;
//    Vehiculo(String marcaV, String marcaM) {
//        motor = new Motor(marcaM, this);
//        this.marca = marcaV;
//    }

//    static int NUM_RUEDAS = 4;
//    Rueda[] rueda;
//    Rueda ruedaDeRepuesto;
//    String marca;
//    Vehiculo(String marcaV, String marcaR) {
//        rueda = new Rueda[NUM_RUEDAS];
//        for (int i = 0; i < NUM_RUEDAS; ++i)
//            this.rueda[i] = new Rueda(marcaR);
//        this.ruedaDeRepuesto = new Rueda(marcaR);
//        this.marca = marcaV;
//    }
}
