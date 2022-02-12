
package apistream;

import java.util.Arrays;
import java.util.List;

public class ElementosUnicos {
    
    public static void main(String[] args) {
        
        // Imprimir en consola todos los nombre unicos de
        // la lista.
        
        List<String> names = Arrays.asList("Uno", "Dos", "Tres");
        
        names.stream()
                .distinct()
                .forEach(elemento -> System.out.println(elemento));
        
    }
    
}
