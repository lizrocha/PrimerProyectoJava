package bootcamp;

import java.util.Scanner;

public class Main {
    //psvm
    public static void main(String[] args) {

        Scanner teclado =  new Scanner(System.in);

        System.out.print("Ingrese nombre:");
        String nombre =  teclado.nextLine();

        System.out.print("Ingrese su edad:");
        int edad =  teclado.nextInt();

        System.out.print("¿Te gusta desarrollar?:");
        boolean desarrollo =  teclado.nextBoolean();

        System.out.println("Bienvenido " + nombre + ", "+edad+" años");

        if(desarrollo==true){
            System.out.println("Que bueno que te guste desarrollar.");
        }else{
            System.out.println("Deberias desarrollar.");
        }

    }
}
