package coches;

class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Ford", "Renault");
        System.out.println("Vehículo de marca " + vehiculo.marca);
        System.out.println("Su motor es de marca " + vehiculo.motor.marca);
    }

}