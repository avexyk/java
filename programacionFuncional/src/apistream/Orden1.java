
package apistream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Orden1 {
    
    public static void main(String[] args) {
        
        // Ordenar los números de la lista
        List<Integer> numbers = Arrays.asList(1,5,3,2,4);
        
        List<Integer> result = numbers.stream()
                // Ordenar de forma ascendente
                // .sorted()
                
                // Ordenar de forma descendente
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        System.out.println(result);
        
    }
    
}
