public class Hello {
    public static void main(String[] args) {
        String java = "Java";
        System.out.println(java);
        System.out.println("java = " + java.toUpperCase());
        
        // Primitives

        // Número entero
        // entre -128 a 127
        byte enteroByte = 127;
        // entre -32768 a 32767
        short enteroShort = 32767;
        // entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        // entre -9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;

        // Numero reales
        // entre -1.4E-45 a 3.4028235E38
        float realFloat = 3.1416f;
        // entre -4.9E-324 a 1.7976931348623157E308
        double realDouble = 4.7029235E3;

        boolean confirmar = true;

        char a = 'a';
        char c = '\u0021';

        // Scape: \b Retroceso \n Salto de línea \r Retorno \t Tabulador \\ Diagonal invertida \" Comillas dobles

        System.out.println("enteroInt = " + enteroInt);
        
        // Objets: String, Integer etc porque tienen metodos e implicitamente se convierte en objetos

        // Tipo flexible
        var number1 = 0;

        String name;
        name = "Javier";

        // Comentarios
        /**/
        //
    }
}
