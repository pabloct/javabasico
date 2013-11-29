
package app.clase5.sockets.ejercicioOperacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {
        try {
            // Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            Socket cliente = server.accept();
            
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            
            // COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ...listo para realizar tus operaciones: [1]Suma [2]Resta [3]Multilicacion [4]Division ");
            
            // COMUNICACION 2
            String operacion = in.readLine();
            //System.out.println(operacion);//esta operacion no immprimri conservar para metodo
            
            // COMUNICACION 3
            out.println("SERVIDOR: enviame primer operando: ");
            
            // COMUNICACION 2
            String operando1 = in.readLine();
            System.out.println(operando1);
            
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}