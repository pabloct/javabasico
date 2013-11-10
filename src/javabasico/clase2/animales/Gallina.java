package javabasico.clase2.animales;

public class Gallina extends Animal {

    public Gallina(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public void hacerRuido() {
        System.out.println("COC COCO LO CLOC");
    }

    public void comer() {
        System.out.println("Maiz");
    }
}
