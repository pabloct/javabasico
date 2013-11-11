/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase3.universo;

import app.clase3.universo.abstractas.Humano;

/**
 *
 * @author alumno
 */
public class Terricola extends Humano {

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void comunicarse() {
        System.out.println("comunicandose en Ingles");
    }

    @Override
    public void sentir() {
        System.out.println("confundido");
    }
}
