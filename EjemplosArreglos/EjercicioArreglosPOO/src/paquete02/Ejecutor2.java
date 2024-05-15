package paquete02;

import paquete01.LibretaCalificacion;

public class Ejecutor2 {

    public static void main(String[] args) {
        
        double [] notas = {10, 9, 8, 10};
        
        String nombreEstudiante = " Rene Elizalde ";
        
        LibretaCalificacion libreta  = new LibretaCalificacion(nombreEstudiante,
                notas);
        
        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
        
    }  
}
