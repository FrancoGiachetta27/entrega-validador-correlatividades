package domain;

import domain.alumnos.Alumno;
import domain.inscripciones.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class AlumnoTest {
    @Test
    public void cumpleCorrelatividades() {
        Materia algoritmos = new Materia("Algoritmos");
        Materia discreta = new Materia("Discreta");
        Materia syo = new Materia("SyO");
        Materia ads = new Materia("ADS", syo, algoritmos);
        Materia so = new Materia("SO", discreta, algoritmos);
        Materia dds = new Materia("DDS", ads, discreta);

        Alumno alumno = new Alumno("Franco", algoritmos, discreta);

        ArrayList<Materia> materias = new ArrayList<Materia>();
        materias.add(syo);
        materias.add(ads);
        materias.add(so);
        materias.add(dds);

        int cantPuedeCursar = (int) materias.stream().filter(alumno::puedeCursar).count();

        Assert.assertEquals(2, cantPuedeCursar);
    }
}
