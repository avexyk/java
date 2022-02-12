
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
   
    public static void main(String[] args) {
        // Obtener el cuadrado de todos los números en la lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9); // Lista 1
        
        numeros.stream()
                .map(num -> num * num)
                .forEach(num -> System.out.println(num));
        
        // Otra forma
        numeros.stream()
                .forEach(num -> {
                    int resultado = num * num;
                    System.out.println(resultado);
                });
        
    }
    
}
