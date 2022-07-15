
package listasEnlazadas;

public class Main {
    
    public static void main(String[] args) {
        
//        Nodo primero = new Nodo("primero");
//        Nodo segundo = new Nodo(45);
//        Nodo tercero = new Nodo("tercero");
//       
//        primero.enlazarSiguiente(segundo);
//        primero.obtenerSiguiente().enlazarSiguiente(tercero);
//        
//        System.out.println(primero.obtenerSiguiente().obtenerSiguiente().obtenerValor());

          ListaEnlazada lista = new ListaEnlazada();
          
          System.out.println("¿Está vacía?: " + lista.estaVacia());
          
          lista.addPrimero(64);
          lista.addPrimero(65);
          lista.addPrimero(66);
          lista.addPrimero(67);
          lista.addPrimero(5.7);
          lista.addPrimero("Un nodo");
          lista.addPrimero("Otro nodo");

          System.out.println("¿Está vacía?: " + lista.estaVacia());
          
          System.out.println("Primer elemento: " + lista.obtener(0));
          System.out.println("Último elemento: " + lista.obtener(lista.size()-1));
          System.out.println("Tamaño de la lista: " + lista.size());
          
          lista.eliminarPrimero();
          
          lista.cortar(3);
          
          System.out.println("Primer elemento: " + lista.obtener(0));
          System.out.println("Último elemento: " + lista.obtener(lista.size()-1));
          System.out.println("Tamaño de la lista: " + lista.size());
    
    }
    
}
