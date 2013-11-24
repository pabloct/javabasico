package app.clase4.hilos;

public class Hilos {

    public static void main(String[] args) {
        
        Hilos.testProcesoDuo();
        //Hilos.testProcesosHiloMemoria();
        //Hilos.testProcesosHilos();
        //Hilos.testPrioridad();
        //Hilos.testSimple2Delay();
        //Hilos.testSimpleDelayHilo();
    }

    public static void testProcesoDuo() {
       ProcesosHiloMemoria procesoMemoria = new ProcesosHiloMemoria();
       ProcesosHilo proceso = new ProcesosHilo();
        
        procesoMemoria.start(); 
        proceso.start();  
    }
    
    public static void testProcesosHiloMemoria() {
        ProcesosHiloMemoria proceso = new ProcesosHiloMemoria();
        
        proceso.start();
    }
    
    public static void testProcesosHilos() {
        ProcesosHilo proceso = new ProcesosHilo();
        
        proceso.start();
    }

    public static void testPrioridad() {
        Simple2DelayThread delayAdrian = new Simple2DelayThread("Adrian", 0);
        Simple2DelayThread delayArianita = new Simple2DelayThread("Arianita", 0);

        delayAdrian.setPriority(Thread.MAX_PRIORITY);
        delayArianita.setPriority(Thread.MIN_PRIORITY);

        delayArianita.start();
        delayAdrian.start();

    }

    public static void testSimple2Delay() {

        long delay1 = (long) (Math.random() * 2000);

        Simple2DelayThread delay = new Simple2DelayThread("Adrian", delay1);
        delay.start();
    }

    public static void testSimpleDelayHilo() {
        SimpleDelayThread delay = new SimpleDelayThread();
        delay.start();
    }

    public static void testHiLowerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }
}
