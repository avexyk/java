
package string;

public class LenghtCharAt {
    
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        char character;
        System.out.println("La cadena tiene "+ cadena.length() + " caracteres");
        for (int i = 0; i < cadena.length(); i++) {
            character = cadena.charAt(i);
            System.out.println("El carácter en la posición " + i +" es: " + character);
        }
    }
    
}
