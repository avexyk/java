
// Implementación mulithilos mediante la clase Thread

package hilos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HiloThread extends Thread {
    private int iteraciones;
    private Calendar calendario;
    
    public HiloThread(String nombre, int iteraciones) {
        super(nombre);
        this.iteraciones=iteraciones;
    }
    
    public void run() {
        System.out.println("Hilo: "+this.getName()+" iniciado");
        for (int i = this.iteraciones; i >= 1; i--) {
            this.calendario = new GregorianCalendar();
            int hora = this.calendario.get(Calendar.HOUR);
            int minuto = this.calendario.get(Calendar.MINUTE);
            int segundo = this.calendario.get(Calendar.SECOND);
            int milisegundo = this.calendario.get(Calendar.MILLISECOND);
            System.out.println("\nIteracion numero "+i+" del hilo denominado "+this.getName());
            System.out.println("Hora de ejecución: "+hora+":"+minuto+":"+segundo+":"+milisegundo);
            try {
                sleep(i*50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        HiloThread hilo1 = new HiloThread("uno", 5);
        HiloThread hilo2 = new HiloThread("dos", 3);
        HiloThread hilo3 = new HiloThread("tres", 6);
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
