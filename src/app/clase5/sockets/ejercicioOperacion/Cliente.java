package app.clase5.sockets.ejercicioOperacion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
            // Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            // COMUNICACION 1 recibiendo mensaje de servidor
            String msgServer = in.readLine();
            System.out.println(msgServer);

            // COMUNICACION 2
            out.println(obtenerOperacion());

            // COMUNICACION 3 recibiendo mensaje de servidor
            msgServer = in.readLine();
            System.out.println(msgServer);

            // COMUNICACION 4
            out.println(obtenerOperando(1));
            
            // COMUNICACION 5
            out.println(obtenerOperando(2));
            
            // COMUNICACION 6
            msgServer = in.readLine();
            System.out.println(msgServer);
            
            // Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }

    private String obtenerOperacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LADO CLIENTE - Elija operacion : ");
        //String operacion = scanner.nextString();
        return scanner.next();//Integer.toString(operacion);
    }

    private String obtenerOperando(int i) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LADO CLIENTE - ingresar operando "+i+ " : ");
        int operacion = scanner.nextInt();
        return Integer.toString(operacion);
    }
}
