
package javabasico.clase2.animales;

// ejemplo de polimorfismo herencia y sobrecarga

public class Zoologico {
    public static void main(String[] args) {
        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();
        
        Gallina mamba = new Gallina("Mamba", 2);
        mamba.hacerRuido();
        mamba.comer();
        
        Vicuna vicu = new Vicuna("Vicu", 7);
        vicu.hacerRuido();
        vicu.comer();        
        
        //Animal nuevoAnimal = new Animal;  //NO SE PUEDE INSTANCIAR CLASE ANIMAL ABNSTRACTA
    }
}
