/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase2;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class EjemploClase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese sus nombres, por favor: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos, por favor: ");
        apellido = entrada.nextLine();
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido es: "
                +apellido);
    }
    
}
