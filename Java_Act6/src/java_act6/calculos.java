/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_act6;

/**
 *
 * @author julia
 */
public class calculos {
    
    private String nombre;
    private int[] calificaciones = new int[4];
    
    public int obtenerPromedio(int[] calificaciones){
        int promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        promedio = (promedio/calificaciones.length);
        return promedio;
    }
    
    public String calificacion(int promedio){
        String calificacion = "";
        
        //int promedio = obtenerPromedio();
        
        if (promedio >= 91) {
            calificacion = "A";
            return calificacion;
        }
        if (promedio >= 81) {
            calificacion = "B";
            return calificacion;
        }
        if (promedio >= 71) {
            calificacion = "C";
            return calificacion;
        }
        if (promedio >= 61) {
            calificacion = "D";
            return calificacion;
        }
        if (promedio >= 51) {
            calificacion = "E";
            return calificacion;
        }
        calificacion = "F";
        return calificacion;
    }
    
    public void imprimir(String nombre, String calificacion,int promedio){
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}
