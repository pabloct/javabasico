package app.clase6.excepcion;

import java.util.Scanner;

public class Util {

    public static void main(String[] args) throws FueraDeRangoExcepcion {
        int valor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un muero entero:");
        valor = scanner.nextInt();

        Util.estaEnRango(valor, 10, 15);
    }

    public static void estaEnRango(int valor, int desde, int hasta) throws FueraDeRangoExcepcion {

        System.out.println("Incio de rango " + desde);
        System.out.println("Fin de rango " + hasta);

        if ((desde > valor) || (valor > hasta)) {
            throw new FueraDeRangoExcepcion(valor,desde,hasta);
        } else {
            System.out.println(valor + " dentro del rango.");
        }
    }
}
