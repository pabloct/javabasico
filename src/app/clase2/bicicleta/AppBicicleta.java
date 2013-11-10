
package app.clase2.bicicleta;

public class AppBicicleta {
    public static void main(String[] args) {
        
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setMarca("Monark");
        bicicleta.setModelo("123");
        
        bicicleta.cambiarLlantas();
        System.out.println(bicicleta.getMarca());
    }
}
