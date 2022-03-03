package java_act6;

import java.util.Scanner;

public class Java_Act6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        calculos c = new calculos();
        int[] calificaciones = new int[5];
        
        System.out.println("***EL PROGRAMA ESPERA CALIFICACIONES PONDERADAS DE 0 A 100***\n");
        
        System.out.println("Indique el nombre del alumno");
        String nombre = entrada.nextLine();
        c.setNombre(nombre);
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Indique la calificacion " + (i+1));
            calificaciones[i] = entrada.nextInt();
        }
        System.out.println("");
        c.setCalificaciones(calificaciones);
        
        int promedio = c.obtenerPromedio(calificaciones);
        String calificacion = c.calificacion(promedio);
        c.imprimir(nombre, calificacion, promedio);
    }
    
}
