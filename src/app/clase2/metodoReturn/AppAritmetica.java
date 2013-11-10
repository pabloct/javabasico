package app.clase2.metodoReturn;

public class AppAritmetica {

    public static void main(String[] args) {
        OperacionesAritmeticas operacion = new OperacionesAritmeticas();
        operacion.sumar(13.3, 15.2);
        double suma = operacion.sumar(13.3, 15.2);
        System.out.println(suma);

        suma = operacion.sumar(10d, 20d);
        System.out.println(suma);

        int mayor = operacion.getMax(10, 11);
        System.out.println("numero mayor " + mayor);

        float mayorFloat = operacion.getMax(10.67f, 11f);
        System.out.println("numero mayor float " + mayorFloat);
    }
}
