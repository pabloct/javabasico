package javabasico.clase2.estatico;

public class AppEstatico {

    public static void main(String[] args) {
        
        AppEstatico.runMetodoEstatico();
        AppEstatico.runAtributoEstatico();
    }

    public static void runMetodoEstatico() {
        double euro = Estatico.dolaraEuro(10d);
        System.out.println(euro);
        
        System.out.println(Estatico.dolaraEuro(25d));
    }

    public static void runAtributoEstatico() {
        System.out.println(Estatico.contador);

        Estatico estaUn = new Estatico();
        Estatico estaDo = new Estatico();
        Estatico estaTre = new Estatico();

        System.out.println(Estatico.contador);

    }
}
