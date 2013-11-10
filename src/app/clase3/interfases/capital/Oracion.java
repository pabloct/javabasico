package app.clase3.interfases.capital;

public class Oracion implements Capitalizable {

    private String texto;

    public Oracion(String texto) {
        this.texto = texto;
    }
    public String agregaPalabra(String texto) {
        this.texto = this.texto.concat(" " + texto);
        return this.texto;
    }
    
    //metodos de Interfase
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
