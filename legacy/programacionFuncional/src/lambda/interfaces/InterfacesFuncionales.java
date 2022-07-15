
package lambda.interfaces;

public class InterfacesFuncionales {
    
    public static void main(String[] args) {
        
        ISaludar saludar = () -> { System.out.println("Saludo"); };
        saludar.Saludar();

    }
    
}
