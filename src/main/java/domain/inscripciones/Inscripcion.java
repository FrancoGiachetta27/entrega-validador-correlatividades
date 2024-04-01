package domain.inscripciones;

import domain.alumnos.Alumno;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.materias = materias;
        this.alumno = alumno;
    }

    public boolean aprobada() {
        return materias.stream().allMatch(m -> alumno.puedeCursar(m));
    }
}
