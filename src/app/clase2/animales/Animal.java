
package app.clase2.animales;

//clase abstracta plantilla de clase que bno se puede instanciar
public abstract class Animal {
    private String nombre;
    private String color;
    private double peso;
    private int edad;

    public abstract void hacerRuido();  //definir metodos como plantillas a las clases que heredan de animal
    
    public abstract void comer();  //como hacerRuido obligan a las clases hijo implementar el metodo
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
