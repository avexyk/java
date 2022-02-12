
package apistream;

import java.util.ArrayList;
import java.util.List;

public class Buscar2 {
    
    public static void main(String[] args) {
        // Obtener nombre de un usuario que tenga
        // una edad igual a 25
        
        List<User> users = new ArrayList<>();
        
        users.add(new User("Francisco", 29));
        users.add(new User("Javier", 20));
        users.add(new User("Tania", 26));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 22));
        users.add(new User("Andrés", 21));
        
        User userDefault = new User("Sin nombre", 0);
        
        // Retorna un usuario
        User user =  users.stream()
                .filter(u -> u.getAge() == 26)
                
                // Algún elemento sin orden
                //.findAny()
                
                // El primer elemento
                .findFirst()
                
                // Returna un elemento y si no hay uno predefinido
                .orElse(userDefault);
                //.get();
        
        System.out.println(user.getUsername());
        
    }
    
}
