    public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
String palabra, contrasena;
        System.out.println("Jugador 1: Introduzca una contraseña que adivinar");
        contrasena= sc.nextLine();
        System.out.println("La contraseña escrita tiene " + contrasena.length()+ " caracteres");
        System.out.println("Jagador 2: Pruebe a averiguar la contraseña");
        palabra=sc.nextLine();
        while (!contrasena.equals(palabra)){
            String pista= "";
            for (int i = 0; i<contrasena.length();i++){
                if(contrasena.charAt(i)== palabra.charAt(i)){
                    pista += contrasena.charAt(i);
                }else{
                    pista += "*";
                }
            }
            System.out.println(pista);
            System.out.println("Jugador 2: Intentelo con una nueva palabra");
            palabra = new Scanner (System.in).next();
        }
        System.out.println("Acertaste!");
    } 
}
