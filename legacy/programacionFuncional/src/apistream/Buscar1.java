
package apistream;

import java.util.Arrays;
import java.util.List;

public class Buscar1 {
    
    public static void main(String[] args) {
        // Conocer si un alumno posee por lo menos una
        // calificación no aprobatoria.
        // La calificación mínima aprobatoria es 6
        
        List<Integer> calificaciones = Arrays.asList(10,10,9,2,4,9);
        
        boolean result = calificaciones.stream()
                //.filter(calificacion -> calificacion < 6)
                //.count() > 0;
                .anyMatch(calificacion -> calificacion < 6);
        
        System.out.println(result);
        
    }
    
}
