package domain.inscripciones;

import domain.alumnos.Alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, Materia ... correlativas) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();

        Collections.addAll(this.correlativas, correlativas);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
