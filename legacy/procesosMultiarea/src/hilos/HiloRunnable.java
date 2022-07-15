
// Creación mediante la interfaz Runnable

package hilos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HiloRunnable implements Runnable {
    private int iteraciones;
    private Calendar calendario;
    private String nombre;
    
    public HiloRunnable(String nombre, int iteraciones) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
    }
    
    @Override
    public void run() {
        System.out.println("Hilo: "+this.nombre+" iniciado");
        for (int i = this.iteraciones; i >= 1; i--) {
            this.calendario = new GregorianCalendar();
            int hora = this.calendario.get(Calendar.HOUR);
            int minuto = this.calendario.get(Calendar.MINUTE);
            int segundo = this.calendario.get(Calendar.SECOND);
            int milisegundo = this.calendario.get(Calendar.MILLISECOND);
            System.out.println("\nIteración número "+i+" del hilo denominado "+this.nombre);
            System.out.println("Hora de ejecución: "+hora+":"+minuto+":"+segundo+":"+milisegundo);
        }
    }
    
    public static void main(String[] args) {
        HiloRunnable hilo1 = new HiloRunnable("uno", 5);
        Thread t1 = new Thread(hilo1);
        t1.start();
        HiloRunnable hilo2 = new HiloRunnable("dos", 3);
        Thread t2 = new Thread(hilo2);
        t2.start();
        HiloRunnable hilo3 = new HiloRunnable("tres", 6);
        Thread t3 = new Thread(hilo3);
        t3.start();
    }
    
}
