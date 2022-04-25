/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nom;
        int numCam;
        double pres;

        System.out.println("Ingrese el nombre del Hospital: ");
        nom = sc.nextLine();
        System.out.println("Ingrese el numero de camas: ");
        numCam = sc.nextInt();
        System.out.println("Ingrese el presupuesto del Hospital: ");
        pres = sc.nextDouble();

        Hospital h1 = new Hospital();
        h1.establecerNombre(nom);
        h1.establecerNumeroCamas(numCam);
        h1.establecerPresupuesto(pres);
        
        sc.nextLine(); //Limpieza de buffer
        
        System.out.println("Ingrese el nombre del Hospital(2): ");
        nom = sc.nextLine();
        System.out.println("Ingrese el numero de camas(2): ");
        numCam = sc.nextInt();
        System.out.println("Ingrese el presupuesto del Hospital(2): ");
        pres = sc.nextDouble();
        
        Hospital h2 = new Hospital();
        h2.establecerNombre(nom);
        h2.establecerNumeroCamas(numCam);
        h2.establecerPresupuesto(pres);

        //agregar valores a los atributos de h1 y h2, por teclado
        /*
        Hospital h1 = new Hospital();
        h1.establecerNumeroCamas(10);
        
        Hospital h2 = new Hospital();
        h2.establecerNumeroCamas(10);
         */
        
        System.out.println("-----------------------------------------------");
        System.out.printf("%s - %d - %.2f\n",
                h1.obtenerNombre(),
                h1.obtenerNumeroCamas(),
                h1.obtenerPresupuesto());
        
        System.out.println("-----------------------------------------------");
        System.out.printf("%s - %d - %.2f\n",
                h2.obtenerNombre(),
                h2.obtenerNumeroCamas(),
                h2.obtenerPresupuesto());
    }
}
