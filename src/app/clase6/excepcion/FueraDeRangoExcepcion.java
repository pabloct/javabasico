package app.clase6.excepcion;

public class FueraDeRangoExcepcion extends Exception {

    FueraDeRangoExcepcion(int valor, int desde, int hasta) {
        super("Valor " + valor + " fuera de RANGO [" + desde + "," + hasta + "]");
    }
}
