/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta75;

/**
 *
 * @author 34625
 */
class CuentaCorriente {

    String dni;
    String nombre;
    double saldo;
    static private String nombreBanco = "International Java Bank";

    static void setBanco(String nuevoNombre) {
        nombreBanco = nuevoNombre;
    }

    static String getBanco() {
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
    Gestor gestor;

    public CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this(dni, nombre);
        this.gestor = gestor;
    }

    //permite asignar un nuevo onjeto Gestor a la cuenta
    void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    void mostrarInformacion() { //muestra el estado de la cuenta, incluido el gestor
        //No podemos usar directamente gestor.mostrarInformacion (), ya que puede
        // que el gestor sea null. Al intentar acceder a los miembros de un objeto
        //nulo se produce una excepcion
        if (gestor == null) {
            System.out.println("Cuenta sin gestor");
        } else {
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion(); //no es posible mostrar directamente sus
            //atributos, ya que algunos no son visibles
        }
        System.out.println("Informacion de la cuenta");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);

    }
}
