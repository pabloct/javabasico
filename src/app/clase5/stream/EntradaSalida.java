package app.clase5.stream;

import java.io.File;

public class EntradaSalida {

    public static void main(String[] args) {

        LecturaEscritura.escribirArchivo();
        LecturaEscritura.leerArchivo();
        //EntradaSalida.createDirectorio();
        //EntradaSalida.listarDirectorio2();
        //EntradaSalida.listarDirectorio();
        //EntradaSalida.verifyFile();
    }

    public static void createDirectorio() {
        File dir = new File("c:\\javaTecsup");
        
        if ((!dir.exists()) && (!dir.isDirectory())) {
            dir.mkdir();
            System.out.println("Directorio creado!!!");
        }
    }
    
    public static void listarDirectorio2() {
        File dir = new File("c:\\");

        if ((dir.exists()) && (dir.isDirectory())) {
            for (String subDir : dir.list()) {
                System.out.println(subDir);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public static void listarDirectorio() {
        File directorio = new File("c:\\");

        if ((directorio.exists()) && (directorio.isDirectory())) {
            String[] lista = directorio.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public static void verifyFile() {

        File file = new File("c:\\file.txt");

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta : " + file.getPath());
        System.out.println("Ruta Absoluta: " + file.getAbsolutePath());

        if (file.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((file.canRead()) ? "Sí se puede leer" : "");
            System.out.println((file.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + file.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
