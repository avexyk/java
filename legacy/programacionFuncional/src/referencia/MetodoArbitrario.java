
package referencia;

import java.util.ArrayList;
import java.util.List;

public class MetodoArbitrario {
    
    public static void main(String[] args) {
        // Referencia a métodos de instancia de forma arbitraria
        
        // Imprimir en consola el nombre de todos los usuarios
        
        List<User> users = new ArrayList<>();
        
        users.add(new User("Eduardo",29));
        users.add(new User("Uriel",22));
        users.add(new User("Marines",10));
        users.add(new User("Luis",25));
        
        users.stream()
                .map(User::getUsername)
                .forEach(System.out::println);
        
    }
    
}
