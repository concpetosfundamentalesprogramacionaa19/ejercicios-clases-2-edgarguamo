/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class MiEjercicio {
    public static void main (String[] arg){
    String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        double promedio;
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
        
        System.out.println("Ingrese el país donde vive");
       
        pais = entrada.nextLine();
        
        System.out.println("Ingrese su primera nota");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese su segunda nota");
        nota2 = entrada.nextInt();
        
        promedio = (nota1 + nota2)/2;
        
        System.out.printf("Sus nombres y apellidos son: %s %s \nEdad: %s "
                + "\nCiudad: %s \nPaís: %s \nNotas: %s, %s \nPromedio:"
                + " %s", nombre,
                apellido, edad, ciudad, pais, nota1, nota2, promedio);
}
    
}
