
package string;

public class Split {
    
    public static void main(String[] args) {
        String cadena = "Hola planeta tierra";
        String cadenas[] = cadena.split(" ");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println("La cadena " + i + " es: " + cadenas[i]);
        }
    }
    
}
