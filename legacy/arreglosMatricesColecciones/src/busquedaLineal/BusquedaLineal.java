/**
 * 
 * Busqueda lineal.
 * La búsqueda linea es un arreglo de implementación de un proceso
 * iterativo que recorre todo el arreglo. Inicia en 0 e incrementa
 * en cada iteración
 * 
 **/

package busquedaLineal;

public class BusquedaLineal {
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        
        System.out.println("El arreglo original es:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        BusquedaLineal bl = new BusquedaLineal();
        int indice = bl.busquedaLineal(numeros, 30);
        System.out.println("El indice del valor '30' es: " + indice);   
    }
    
    public int busquedaLineal(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==clave) {
                return i;
            }
        }
        return -1;
    }
}
