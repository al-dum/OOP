package empresa;

class Ejemplo1 {
    public static void main(String[] arg) {
        Director director = new Director();
        director.salario = 1000;
        System.out.println("El salario del director es ahora: " + director.salario);
        director.setSalario(2000);
        System.out.println("El salario del director es ahora: " + director.salario);
    }



//    public static void main(String[] arg) {
//        Director director = new Director();
//        System.out.println("Los ingresos del director son: " + (director.salario + director.bonus));
//        director = new Director(1000, 500);
//        System.out.println("Los ingresos del director son: " + (director.salario + director.bonus));
//    }
}