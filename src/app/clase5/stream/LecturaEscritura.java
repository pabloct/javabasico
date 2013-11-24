package app.clase5.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {

        EjemploStream addLineas = new EjemploStream("c:\\javaTecsup\\ejemplo.txt");
        
        addLineas.actualizarDatos();
        //LecturaEscritura.escribirArchivo();
        //LecturaEscritura.leerArchivo();
    }

    public static void escribirArchivo() {

        try {
            FileWriter fw = new FileWriter("c:\\javaTecsup\\ejemplo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Buenas noches TECSUP");
            bw.newLine();
            bw.write("... somos del programa integral de JAVA");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        String sInput;

        try {
            FileReader fr = new FileReader("c:\\javaTecsup\\ejemplo.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
