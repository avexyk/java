
package apistream;

import java.util.stream.Stream;

public class ReduccionElementos {
    
    public static void main(String[] args) {
        // Obtener la suma de todos los elementos
        // Reduce es parecido a un acumulador
        
        int result = Stream.of(1,2,3,4,5,6,7,8,9)
                .reduce(0, (acumulador,elemento) -> acumulador + elemento);
        System.out.println(result);
        
        // |
        String string = Stream.of("Java", "Cobol", "Go", "Ada")
                .reduce("", (acumulador,lenguaje)->acumulador+"|"+lenguaje);
        System.out.println(string);
        
    }
    
}
