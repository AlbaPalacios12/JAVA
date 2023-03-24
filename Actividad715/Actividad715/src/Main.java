import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendario c;

        System.out.println("Introduzca un año");
        int año = sc.nextInt();
        // c.setCalendario(año);
        System.out.println("Introduzca un mes");
        int mes = sc.nextInt();
        // c.setCalendario(mes);
        System.out.println("Introduzca un dia");
        int dia = sc.nextInt();
        c = new Calendario(año, mes, dia);
        c.setCalendario(año, mes, dia);

        c.incrementarDia();
        c.incrementarMes();
        System.out.println("indique la cantidad de años que quiere incrementar: ");
        int cantidad = sc.nextInt();
        c.incrementarAño(cantidad);
        System.out.print(c.incrementarAño(cantidad));
        // c.getFecha();
        System.out.println(c.getFecha());
        // c= new Calendario(año, mes, dia);

    }
}
