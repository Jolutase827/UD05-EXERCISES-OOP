package es.ieslavereda.ejercicio2;

import java.util.Scanner;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password[] passwords;
        boolean[] esFuerte;
        System.out.println("Dime cuantas contraseñas quieres crear");
        passwords = new Password[Integer.parseInt(sc.nextLine())];
        esFuerte = new boolean[passwords.length];
        for (int i = 0; i< passwords.length; i++){
            System.out.println("Quieres ponerle longitud a la contraseña " +(i+1)+" di si si no pon lo que sea, si no quieres se creara una contraseña segura de longitud 10");
            if (sc.nextLine().compareToIgnoreCase("si")==0){
                System.out.println("Dime longitud de la Password");
                passwords[i] = new Password(Integer.parseInt(sc.nextLine()));
            }else {
                passwords[i] = new Password();
            }

            esFuerte[i] = passwords[i].esFuerte();
        }

        System.out.println();
        for (int i = 0; i< passwords.length; i++){
            System.out.println(esFuerte[i]+" -> "+passwords[i].getContrasenya());
        }
    }
}
