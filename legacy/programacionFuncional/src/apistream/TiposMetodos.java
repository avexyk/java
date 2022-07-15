
package apistream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TiposMetodos {
    
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();
        
        users.add(new User("Francisco", 29));
        users.add(new User("Javier", 20));
        users.add(new User("Tania", 26));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 22));
        users.add(new User("Andrés", 21));
        
        // Manejo de estructura de proceso
        // Manejo de iteración interna
        
        // Método que retorna nuevo stream
        // Método que retorna un valor en concreto
        
        Stream<User> stream = users.stream();
        // Filter -> Abstracción -> Nuevo Stream
        System.out.println(stream.filter(user -> user.getAge() > 18));
        
    }
    
}
