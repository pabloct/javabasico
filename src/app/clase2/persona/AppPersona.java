package app.clase2.persona;

public class AppPersona {

    public static void main(String[] args) {
        Persona adrian = new Persona("Adrian Rodrigo Arturo", "Campos Liberato", 9);

        System.out.println("Atruibutos del objeto");
        System.out.println("Nombres: " + adrian.getNombres());
        System.out.println("Apellidos: " + adrian.getApellidos());
        System.out.println("Edad: " + adrian.getEdad());
        
        Persona ariana = new Persona();
        ariana.setNombresApellidos("Ariana Valeria Constanza", "Campos Liberato");
        ariana.printNombreCompleto();
        ariana.setEdad(1);
        System.out.println("Edad: " + ariana.getEdad());
        
    }
}
