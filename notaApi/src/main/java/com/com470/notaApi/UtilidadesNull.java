package com.com470.notaApi;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesNull {

    private List<Persona> personas;

    public UtilidadesNull() {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("Carlos", "Perez"));
        personas.add(new Persona("Juan", "Lopez"));
        personas.add(new Persona("Hugo", "Vargas"));

    }

    public Persona buscaPersona(String nombre) {
        Persona p = null;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                p = persona;
            }
        }
        return p;
    }

    public Persona devuelveObjeto(Persona persona) {
        if (personas.contains(persona)) {
            return persona;
        } else {
            return new Persona("Maria", "Martinez");
        }
    }
}
