
package apistream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Orden2 {
    
    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();
        
        // Mostrar en consola los 3 títulos más vendidos
        // Ordenar por copias
        books.add(new Book("El señor de los anillos", 10));
        books.add(new Book("Don Quijote", 20));
        books.add(new Book("Historia de 2 ciudades", 15));
        books.add(new Book("El hobbit", 5));
        books.add(new Book("El principito", 13));
        
        // Ordenar a partir de un atributo
        Comparator<Book> comparatorCopies = Comparator
                .comparing(book -> book.getCopies());
        
        Comparator<Book> comparatorTitle = Comparator
                .comparing(book -> book.getTitle());
        
        books.stream()
                // Orden ascendente
                // .sorted(comparatorCopies)
                
                // Orden descendente
                .sorted(comparatorCopies.reversed())
                .limit(3)
                .forEach(book -> System.out.println(book.getTitle()));
        
        System.out.println("");
        
        
        /*
            if(books.stream.count>3)
                comparator = Comparator.comparing(book -> book.getCopies());
            else
                comparator = Comparator.comparing(book -> book.getTitle());
        */
        
        books.stream()
                // Orden ascendente
                // .sorted(comparatorCopies)
                
                // Orden descendente
                .sorted(comparatorTitle.reversed())
                .limit(3)
                // saltar elementos
                // .skip(1)
                .forEach(book -> System.out.println(book.getTitle()));
        
    }
    
}
