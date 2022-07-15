
package lambda.parametros;

public class Parametros {
    
    public static void main(String[] args) {
        
        // El compilador infiere el tipo de dato
        // Se puede modificar el nombre de los parametros
        // Si es un solo parámetro se puede omitir los parentesis
        // Si es una sola sentencia se puede omitir las llaves
        
        ISaludar saludar = (String usuario) -> { System.out.println("Hola " + usuario); };
        saludar.Saludar("Francisco");
        
        // Más de una sentencia
        
        ISaludar saludarDos = (nombre) -> {
            if (nombre.equals("Francisco")) {
                System.out.println("Hola Fco Javier");
            } else {
                System.out.println("Hola" + nombre);
            }
        };
        saludarDos.Saludar("Francisco");
        
        // Retorno de valores
        ISuma suma = (val1, val2) -> val1 + val2;
        int resultado = suma.suma(10, 22);
        System.out.println(resultado);
    
    }

}
