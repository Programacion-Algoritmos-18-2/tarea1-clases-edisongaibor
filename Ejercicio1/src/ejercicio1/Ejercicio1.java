
package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudiantes a1 = new Estudiantes();
        System.out.println("Nombre del primer estudiante");
        a1.setNombre(entrada.nextLine());
        System.out.println("Edad del primer estudiante");
        a1.setEdad(entrada.nextLine());
        Estudiantes a2 = new Estudiantes();
        System.out.println("Nombre del segundo estudiante");
        a2.setNombre(entrada.nextLine());
        System.out.println("Edad del segundo estudiante");
        a2.setEdad(entrada.nextLine());
        System.out.println("Estudiante 1"+a1);
        System.out.println("Estudiante 2"+a2);
        
    }
    
}
