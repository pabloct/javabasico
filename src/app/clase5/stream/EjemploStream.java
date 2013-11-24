package app.clase5.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EjemploStream {

    private List<String> lineas;
    private String filename;

    public EjemploStream(String file) {
        this.lineas = new ArrayList<String>();
        this.filename = file;
    }

    public void actualizarDatos() {
        leerArchivo();
        guardarArchivo();
    }

    public void leerArchivo() {
        try {
            String line;
            FileReader fr = new FileReader(this.filename);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                this.lineas.add(line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarArchivo() {
        try {
            FileWriter fw = new FileWriter(this.filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
            bw.write("Nuevo mensaje");
            bw.newLine();
            bw.write("bienvenido diciembre");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
