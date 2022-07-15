
package apistream;

import java.util.ArrayList;
import java.util.List;

public class Filtrar {
    // Filtrar!
    // Username comience con F
    
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();
        
        users.add(new User("Francisco", 29));
        users.add(new User("Javier", 20));
        users.add(new User("Tania", 26));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 22));
        users.add(new User("Andrés", 21));
        
        // Tiene todos los elementos de la colección
        long cantidad  = users.stream() //1
                .filter(user -> user.getAge() > 18) //2
                .filter(user -> user.getUsername().startsWith("F")) //3
                .count(); // 4

        System.out.println(cantidad);
        
    }
    
}
