
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformarValores {
    
    public static void main(String[] args) {
        // Obtener el cuadrado de todos los números en la lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9); // Lista 1
        
        // Map retorna un nuevo Stream
        List<Integer> result = numeros.stream() // Lista 2
                .map(num -> num * num) // Lista 3
                .collect(Collectors.toList()); // Lista 4
        
        System.out.println(result);
        
    }
    
}
