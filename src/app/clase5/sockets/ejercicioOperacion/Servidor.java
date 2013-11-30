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
            out.println("SERVIDOR: Bienvenido, ...listo para realizar tus operaciones: [+]Suma [-]Resta [*]Multilicacion [/]Division ");

            // COMUNICACION 2
            String operacion = in.readLine();
            System.out.println("LADO SERVIDOR - Operacion escogida: " + operacion);//esta operacion no immprimri conservar para metodo

            // COMUNICACION 3
            out.println("SERVIDOR: enviame primer operando: ");

            // COMUNICACION 2
            String operando1 = in.readLine();
            System.out.println("LADO SERVIDOR - Primer operando recibido: " + operando1);

            // COMUNICACION 4
            out.println("SERVIDOR: enviame segundo operando: ");

            // COMUNICACION 5
            String operando2 = in.readLine();
            System.out.println("LADO SERVIDOR - Segundo operando recibido: " + operando2);

            
            String mensajeFinal = realizarOperacion(operacion, operando1, operando2);
            // COMUNICACION 6
            System.out.println("Calculando.........."+mensajeFinal);
            
            out.println(mensajeFinal);

            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String realizarOperacion(String operacion, String numero1, String numero2) {
        String mensaje = "";
        String operacionRealizada = "";
        boolean error = false;
        double operando1 = Double.parseDouble(numero1);
        double operando2 = Double.parseDouble(numero2);
        double resultado = 0.0;

        switch (operacion) {
            case "+":
                resultado = operando1 + operando2;
                operacionRealizada = "SUMA";
                break;
            case "-":
                resultado = operando1 - operando2;
                operacionRealizada = "RESTA";
                break;
            case "*":
                resultado = operando1 * operando2;
                operacionRealizada = "MULTIPLICACION";
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    operacionRealizada = "DIVISION";
                } else {
                    error = true;
                    mensaje = "error: NO EXISTE LA DIVISION CON CERO!!!";
                }

                break;
            default:
                error = true;
                mensaje = "error: OPERACION INDETERMINADA!!!";
                break;
        }
        if (error == false) {
            mensaje = "El resultado de la " + operacionRealizada +" "+ operando1 + " y " + operando2 + " es igual a "+resultado ;
        }
        return mensaje;
    }
}
