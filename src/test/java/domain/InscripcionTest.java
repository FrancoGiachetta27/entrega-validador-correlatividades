package domain;

import domain.alumnos.Alumno;
import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InscripcionTest {

    @Test
    public void noEstaAprobada() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia discreta = new Materia("Discreta");
        Materia syo = new Materia("SyO");
        Materia ads = new Materia("ADS", syo, algoritmos);

        Alumno alumno = new Alumno("Franco", discreta, algoritmos);

        ArrayList<Materia> materiasAInscribir = new ArrayList<Materia>();
        materiasAInscribir.add(syo);
        materiasAInscribir.add(ads);

        alumno.realizarInscripcion(materiasAInscribir);

        Assert.assertFalse(alumno.getInscripcion().aprobada());
    }
}
