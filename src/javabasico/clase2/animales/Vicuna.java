
package javabasico.clase2.animales;

public class Vicuna extends Animal {

    public Vicuna(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }
    public void hacerRuido() {
        System.out.println("ZZZZZZZ");
    }

    public void comer() {
        System.out.println("Pasto, Ichu");
    }
    
}
