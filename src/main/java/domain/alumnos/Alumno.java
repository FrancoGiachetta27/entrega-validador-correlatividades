package domain.alumnos;

import domain.inscripciones.Inscripcion;
import domain.inscripciones.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Inscripcion inscripcion;
    private List<Materia> aprobadas;

    public Alumno(String nombre, Materia ... aprobadas) {
        this.nombre = nombre;
        this.aprobadas = new ArrayList<Materia>();

        Collections.addAll(this.aprobadas, aprobadas);
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void realizarInscripcion(List<Materia> materias) {
        inscripcion = new Inscripcion(this, materias);
   }

    public boolean puedeCursar(Materia materia) {
        return aprobadas.containsAll(materia.getCorrelativas());
    }
}
