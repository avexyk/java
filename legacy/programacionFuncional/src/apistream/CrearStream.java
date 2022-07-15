
package apistream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CrearStream {
    
    public static void main(String[] args) {
        
        // Colección: Todos los List
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); // Retorna un nuevo stream -- Abstracción
        
        // Stream
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);
        
        // Arreglo
        int[] numbers = {1,2,3,4,5};
        Stream numbersStream =  Stream.of(numbers);
        
        // Secuencia
        Stream names = Stream.of("A","B","C","D");
        
        
    }
    
}
