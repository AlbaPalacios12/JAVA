
public class Calendario {
    public int año;
    public int mes;
    public int dia;

    // comprobamos que los datos son correctos
    public void setCalendario(int año, int mes, int dia) {
        if (año < 0 && año > 2023) {
            System.out.println("año incorrecto");
        } else {
            if (mes < 0 && mes > 12) {
                System.out.println("mes incorrecto");
            } else {
                if (dia < 0 && dia > 31) {
                    System.out.println("dia incorrecto");
                } else {
                    this.año = año;
                    this.mes = mes;
                    this.dia = dia;
                }
            }
        }
    }

    // creamos un objeto Calendario
    public Calendario(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        System.out.println("Fecha creada");
    }

    // métodos
    //
    public void incrementarDia() {
        this.dia++;
        if (this.dia > 31) {
            this.dia = 1;
            this.mes++;
        }
    }

    public void incrementarMes() {
        boolean incrementar = false;
        if (this.mes > 12) {
            this.mes = 1;
            incrementar = true;
        } else {
            this.mes++;
        }
    }

    public boolean incrementarAño(int cantidad) {
        boolean incrementar = false;
        if (this.año < 0) {
            return incrementar = false;
        } else {
            this.año += cantidad;
            return incrementar = true;
        }
    }

    public String getFecha() {
        return (this.año + "/" + this.mes + "/" + this.dia);
    }

}
