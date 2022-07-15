
package apistream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertirAListas {
    
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();
        
        users.add(new User("Francisco", 29));
        users.add(new User("Javier", 20));
        users.add(new User("Tania", 26));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 22));
        users.add(new User("Andrés", 21));
        
        // Retornar un lista
        List<User> newUsers =  users.stream()
                .filter(user -> user.getAge() > 18)
                .collect(Collectors.toList());
        
        // Sobreescrimos el método toString
        System.out.println(newUsers);
        
    }
    
}
