/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase4.hilos;

public class Simple2DelayThread extends Thread {

    private String nombre;
    private long delay;

    public Simple2DelayThread(String nombre, long delay) {
        this.nombre = nombre;
        this.delay = delay;
    }


    @Override
    public void run() {
        //
        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: " + nombre + " Delay :" + delay);
            try {
                // 1000 ms
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }
        }
    }
}
