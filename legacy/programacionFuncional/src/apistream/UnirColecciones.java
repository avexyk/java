
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnirColecciones {
    
    public static void main(String[] args) {
        
        // FlatMap: Combina colecciones
        List<String> name1 = Arrays.asList("Uno", "Dos");
        List<String> name2 = Arrays.asList("Tres", "Cuatro");
        List<String> name3 = Arrays.asList("Cinco", "Seis");
        
        // Of retorna un nuevo stream
        List<String> result = Stream.of(name1,name2,name3)
                .flatMap(elemento -> elemento.stream())
                .collect(Collectors.toList());
        
        System.out.println(result);
        
    }
    
}
