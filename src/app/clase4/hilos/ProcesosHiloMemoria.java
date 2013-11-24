
package app.clase4.hilos;

public class ProcesosHiloMemoria extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecucion "+i);
            listProcess();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    public void listProcess() {
            long mem0 = Runtime.getRuntime().totalMemory();
            long mem1 = Runtime.getRuntime().freeMemory();
            long mem2 = Runtime.getRuntime().availableProcessors();
            long mem3 = Runtime.getRuntime().maxMemory();  
            
            System.out.println("Memoria total: "+mem0);
            System.out.println("Memoria libre: "+mem1);
            System.out.println("Procesador disponible: "+mem2);
            System.out.println("Memoria maxima: "+mem3);
    }
}
