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
public class EjemploClase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese sus nombres, por favor: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese sus apellidos, por favor: ");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor digite su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Limpieza de buffer de entrada de datos
        
        System.out.println("Ingrese la ciudad donde vive");
        ciudad = entrada.nextLine();
        
        System.out.println("Su nombre es: "+nombre+"\n\n\t Su apellido es: "
                +apellido+", edad: "+edad+"\n ciudad: "+ciudad);
    }
    
}
