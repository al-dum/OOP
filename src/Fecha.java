public class Fecha {
    int dia;
    int mes;
    int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public boolean validarFecha(){
        boolean valid =true;
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || año < 0) {
            valid=  false;
        }
        return true;


    }

    public boolean validarPublico() {
        boolean bRet = true;
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || año < 0)
            bRet = false;
        return bRet;
        //return (month < 1 || month > 12 || day < 1 || day > 31 || year < 0)? false : true;
    }
    private void validar() {
        if (año < 0)
            año = 1;
        if  (mes < 1 || mes > 12)
            mes = 1;
        if (dia < 1 || dia > 31)
            dia = 1;
        //return (month < 1 || month > 12 || day < 1 || day > 31 || year < 0)? false : true;
    }
    public int getYear() {
        return año;
    }
    public void setYear(int y) {
        if (y < 0)
            this.año = 1;
        this.año = y;
    }
    public int getMonth() {
        return mes;
    }
    public void setMonth(int m) {
        if (mes < 1 || mes > 12)
            this.mes = 1;
        this.mes = m;
    }
    public int getDay() {
        return dia;
    }
    public void setDay(int d) {
        if (d < 1 || d > 31)
            this.dia = 1;
        this.dia = d;
    }

}
