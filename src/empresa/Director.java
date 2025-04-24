package empresa;

class Director extends Empleado {
    double bonus;
    double getIngresos(double Ingresos) {
//        return salario + bonus;
        return super.getIngresos() + bonus;
    }

//
//    Director() {
//        super();
//        bonus = 0;
//    }
//    Director(double misalario, double mibonus) {
//        super(misalario);
//        bonus = mibonus;
//    }


}