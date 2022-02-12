// Lista Simplemente Enlazada

// La lista enlazada es una estructura que tiene la ventaja que puede ir creciendo
// indefinidadamente. Esta utiliza nodos para poder funcionar y crecer

package listasEnlazadas;

public class Nodo {
    
    // Guarda cualquier tipo valor
    Object valor;
    Nodo siguiente;
    
    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public Object obtenerValor() {
        return valor; 
    }
    
    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }
    
    public Nodo obtenerSiguiente() {
        return siguiente;
    }
    
    
    
}
