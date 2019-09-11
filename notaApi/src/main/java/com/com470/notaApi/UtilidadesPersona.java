
package com.com470.notaApi;


public class UtilidadesPersona {
    private Persona juan;
    private Persona carlos;

    public UtilidadesPersona() {
        //se instancia en el contrutor
        carlos = new Persona("Carlos", "Perez");
        juan = new Persona("Juan", "Lopez");
    }

    public Persona getJuan() {
        return juan;
    }

    public Persona getCarlos() {
        return carlos;
    }
        
}
