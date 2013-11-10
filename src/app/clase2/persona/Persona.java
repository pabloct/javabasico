package app.clase2.persona;

public final class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    
    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.printNombreCompleto();
    }

    public void printNombreCompleto()  {
        System.out.println(nombres + " " +apellidos);
    }
    
    public void setNombresApellidos(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
