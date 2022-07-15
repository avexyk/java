
package integer;

public class toBinaryStringtoOctalStringtoHexString {
    
    public static void main(String[] args) {
        int decimal = 1000;
        String binario = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexa = Integer.toHexString(decimal);
        
        System.out.println("El número decimal es: " + decimal);
        System.out.println("El número binario es: " + binario);
        System.out.println("El número octal es: " + octal);
        System.out.println("El número en hexadecimal es: " + hexa);
    }
}
