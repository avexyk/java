/**
 * Búsqueda binaria.
 * 
 * Implemantación de un proceso recursivo que recibe el arreglo y el
 * valor que se desea buscar.
 * 
 * Se utiliza arreglos ordenados.
 **/
package busquedaBinaria;

public class BusquedaBinaria {
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        System.out.println("El arreglo original es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        BusquedaBinaria bb = new BusquedaBinaria();
        int indice = bb.busquedaBinaria(numeros, 40, 0, numeros.length-1);
        System.out.println("El índice del valor '40' es: " + indice);
    }
    
    public int busquedaBinaria(int[] arreglo, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial )/2;
        if (clave == arreglo[posMitad]) {
            return posMitad;
        } else if (clave < arreglo[posMitad]) {
            if (posMitad-1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(arreglo, clave, posInicial, posMitad-1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(arreglo, clave, posMitad+1, posFinal);
            }
        }
    }
}
