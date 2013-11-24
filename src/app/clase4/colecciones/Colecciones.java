package app.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        Colecciones.ejemploMap();
    }

    public static void ejemploMap() {
        Estudiante jose = new Estudiante("José", "Eusebio Alderete");
        Estudiante gomez = new Estudiante("Jean", "Gomez Gutierrez");
        Estudiante jorge = new Estudiante("Jorge", "Ortiz Pisco");
        Estudiante rafa = new Estudiante("Rafael", "Lopez Ponce");

        HashMap<String, Estudiante> listado = new HashMap<String, Estudiante>();
        listado.put("123", rafa);
        listado.put("124", gomez);
        listado.put("125", jorge);
        listado.put("126", jose);

        listado.get("125").printEstudiante();

        //Collection<Estudiante> listadoMap = listado.values();
        for (Estudiante estudiante : listado.values()) {
            estudiante.printEstudiante();
        }
    }

    public static void ejemploHashSet() {
        Estudiante jose = new Estudiante("José", "Eusebio Alderete");
        Estudiante gomez = new Estudiante("Jean", "Gomez Gutierrez");
        Estudiante jorge = new Estudiante("Jorge", "Ortiz Pisco");
        Estudiante rafa = new Estudiante("Rafael", "Lopez Ponce");
        Estudiante lui = new Estudiante("Luis", "Gutierrez Paloma");

        Set<Estudiante> listado = new HashSet<Estudiante>();
        listado.add(lui);
        listado.add(lui);
        listado.add(jose);
        listado.add(jose);
        listado.add(rafa);
        listado.add(rafa);
        listado.add(jorge);
        listado.add(gomez);
        listado.add(gomez);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }

        System.out.println(listado.size());


    }

    public static void ejemploLinkedList() {

        Estudiante jose = new Estudiante("José", "Eusebio Alderete");
        Estudiante gomez = new Estudiante("Jean", "Gomez Gutierrez");
        Estudiante jorge = new Estudiante("Jorge", "Ortiz Pisco");

        LinkedList<Estudiante> listado = new LinkedList<Estudiante>();
        listado.add(jose);
        listado.add(gomez);
        listado.add(jorge);

        ListIterator<Estudiante> ite = listado.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) listado.poll();
            e.printEstudiante();
        }

        System.out.println(listado.size());


    }

    public static void ejemploEstudiantes() {

        Estudiante jose = new Estudiante("José", "Eusebio Alderete");
        Estudiante gomez = new Estudiante("Jean", "Gomez Gutierrez");
        Estudiante jorge = new Estudiante("Jorge", "Ortiz Pisco");
        Estudiante rafa = new Estudiante("Rafael", "Lopez Ponce");
        Estudiante lui = new Estudiante("Luis", "Gutierrez Paloma");

        List<Estudiante> listado = new ArrayList<Estudiante>();
        listado.add(lui);
        listado.add(jose);
        listado.add(jose);
        listado.add(rafa);
        listado.add(jorge);
        listado.add(jorge);
        listado.add(gomez);
        listado.add(gomez);

        Collections.sort(listado);

        for (Estudiante estudiante : listado) {
            estudiante.printEstudiante();
        }
        System.out.println(listado.size());

        Estudiante luis = listado.get(1);
        luis.printEstudiante();


    }
}