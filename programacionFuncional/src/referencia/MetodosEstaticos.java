
package referencia;

import java.util.Arrays;
import java.util.List;

public class MetodosEstaticos {
    
    public static void main(String[] args) {
        // Referencia a métodos estáticos
        
        // Imprimir el cubo de la siguinte lista
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        list.stream()
                //.map(valor -> MetodosEstaticos.toCube(valor))
                //.forEach(valor -> System.out.println(valor));
                .map(MetodosEstaticos::toCube)
                .forEach(System.out::println);
                
    }
    
    public static int toCube(int numero) {
        return numero * numero * numero;
    }
    
}
