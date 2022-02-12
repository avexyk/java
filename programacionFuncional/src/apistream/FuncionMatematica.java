
package apistream;

import java.util.Arrays;
import java.util.List;

public class FuncionMatematica {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        Long cantidad = numeros.stream().count();
        System.out.println(cantidad);
        
        // Sumar elementos -> intStream -> mapToInt
        int suma = numeros.stream().mapToInt( n -> n )
                .sum();
        System.out.println(suma);
        
        // Promedio de elementos -> average -> intStream
        double promedio = numeros.stream().mapToInt(n -> n)
                .average().orElse(0);
        System.out.println(promedio);
        
        // Menor de la colección -> min -> intStream
        int minimo = numeros.stream()
                .mapToInt(n -> n)
                .min()
                .getAsInt();
        System.out.println(minimo);
        
        // Mayor de la colección -> max - intStream
        int maximo = numeros.stream()
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        System.out.println(maximo);
        
    }
    
}
