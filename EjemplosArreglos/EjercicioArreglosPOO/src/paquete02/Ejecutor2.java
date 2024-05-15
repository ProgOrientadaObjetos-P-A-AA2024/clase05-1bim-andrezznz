package paquete02;

// Realizado Por Andres Cardenas
import paquete01.LibretaCalificacion;

public class Ejecutor2 {

    public static void main(String[] args) {

        double[] notas = {10, 9, 8, 10};

        String nombreEstudiante = " Rene Elizalde ";

        LibretaCalificacion libreta = new LibretaCalificacion(nombreEstudiante,
                notas);

        libreta.establecerPromedio();
        /* Si se lo muestra como comentado al metodo establecerPromedio
        no se envia las notas, por lo tanto no calcula el promedio y por defecto 
        nos muestra en pantalla 0
         */
        
        libreta.establecerPromedioCualitativo();
        /* Si se lo muestra como comentado al metodo establecerPromedioCualitativo
        no se envia el promedio del metodo anterior, por lo tanto nos muestra 
        un Mensaje Null
         */
        
        System.out.printf("\n%s\n", libreta);

    }
}
