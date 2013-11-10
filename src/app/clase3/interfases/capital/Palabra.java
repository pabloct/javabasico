package app.clase3.interfases.capital;

public class Palabra implements Capitalizable {

    private String texto;

    public Palabra(String texto) {
        this.texto = texto.replaceAll(" ","");
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
