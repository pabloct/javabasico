package app.clase3.interfases.capital;

public class Imprenta {

    public static void main(String[] args) {
        Capitalizable[] array = new Capitalizable[3];
        array[0] = new Palabra("Programacion en Java");
        array[1] = new Palabra("Tecsup");
        array[2] = new Oracion("Curso Java Basico - Tecsup");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Texto " + i + ": " + array[i].cambiaMayuscula());
            System.out.println("Texto " + i + ": " + array[i].cambiaMinuscula());

        }
    }
}
