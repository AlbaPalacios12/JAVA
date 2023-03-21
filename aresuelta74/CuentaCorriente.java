/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta74;

/**
 *
 * @author 34625
 */
class CuentaCorriente {

    String dni;
    String nombre;
    double saldo;
    static private String nombreBanco ="International Java Bank";
    static void setBanco (String nuevoNombre){
        nombreBanco=nuevoNombre;
    }
    static String getBanco (){
        return nombreBanco;
    }
    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }

    boolean sacar(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            operacionPosible = false;
            System.out.println("No hay dinero suficiente");

        }
        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("Nombre " + nombre);
        System.out.println("DNI " + dni);
        System.out.println("Saldo " + saldo + " euros");
    }

    CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
}
