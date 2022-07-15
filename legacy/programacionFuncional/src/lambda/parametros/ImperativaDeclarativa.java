
package lambda.parametros;

import java.util.ArrayList;
import java.util.List;

public class ImperativaDeclarativa {
    
    public static void main(String[] args) {
        
        List<User> users = new ArrayList<>();
        
        // Obtener la cantidad de usuarios con una edad mayor a 18
        
        users.add(new User("Francisco", 29));
        users.add(new User("Javier", 20));
        users.add(new User("Tania", 26));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 22));
        users.add(new User("Andrés", 21));
        
        // Imperativo
        int contador = 0;
        for (User user : users) {
            if (user.getAge() > 18) {
                contador++;
            }
        }
        System.out.println(contador);
        
        // Declarativo
        contador = (int)users.stream().filter(user -> user.getAge() > 18 ).count();
        System.out.println(contador);
        
    }
    
}
