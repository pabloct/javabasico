/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

import app.clase3.universo.abstractas.Alienigena;

/**
 *
 * @author adriancl
 */

public class Melmakiano extends Alienigena{

    @Override
    public void comer() {
        System.out.println("comiendo gato");
    }

    @Override
    public void comunicarse() {
        System.out.println("gritando");
    }

    @Override
    public void sentir() {
        System.out.println("amando");
    }
        
}
