package app.clase3.cadenas;

public class Cadena {
    public static void main(String[] args) {
        // Cadena.reemplazo();
        // Cadena.extraccion2();
        // Cadena.buffer1();
        Cadena.buffer2();
    }

    public static void buffer2() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11, " en");
        sb.delete(21, sb.length());
        System.out.println(sb);
    }

    public static void buffer1() {
        StringBuffer buffer = new StringBuffer("Tecsup");
        buffer.append(" - ");
        buffer.append("Java");
        buffer.insert(0, "Instituto ");

        System.out.println(buffer);

        buffer.delete(buffer.indexOf("Java"), buffer.length());

        System.out.println(buffer);

        System.out.println(buffer.reverse());
    }

    public static void metodosString() {

    }

    public static void reemplazo() {
        String palabras = "java permite crear applets, javabeans y servlets";

        palabras = palabras.replaceAll("java", "php");

        System.out.println(palabras);
    }

    public static void extraccion2() {
        String texto = "tecsup";
        System.out.println(texto.subSequence(1, 3));

        System.out.println(texto.substring(2));
    }

    public static void extraccion() {
        System.out.println(" ");
    }

    public static void concatenar() {
        System.out.println("");
    }
}
