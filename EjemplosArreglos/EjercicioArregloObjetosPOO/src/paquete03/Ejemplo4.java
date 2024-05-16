/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo4 {
    public static void main(String[] args) {
        
        Profesor profesor1 = new Profesor("Franco", "nombramiento");
        Profesor profesor2 = new Profesor("Richard", "Contrato");
        
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - Profesor(%s - %s)\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
            /* 
            En la linea 31 podemos llamar al objeto Profesor, dentro del
            objetpo podemos acceder al metodo obtenerProfesor que retorna
            profesor de tipo Profesor, el nombre del profesor declarado
            anteriormente
            */
        }
        
    }
}
