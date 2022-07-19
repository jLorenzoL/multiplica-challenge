package com.multiplica.challenge.demo3;

import com.multiplica.challenge.demo3.dto.Coincidencia;
import com.multiplica.challenge.demo3.dto.Estudiante;
import com.multiplica.challenge.demo3.dto.Position;
import com.multiplica.challenge.demo3.util.UtilFormulas;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
public class Demo3Main {

    /* Se carga la informacion */
    public static List<Estudiante> data = poblarData();

    public static void main(String[] args) throws ParseException {

        Long idA = 1L;
        Long idB = 2L;

        float resultado = Demo3Main.hallarCompatibilidad(idA, idB);

        log.info("La compatibilidad entre estudiantes es {}", resultado);

    }

    public static List<Estudiante> poblarData() {

        return Arrays.asList
                (new Estudiante(1L, "Bar", "Reboul", "2002-06-12",
                        new Position(23.2096864, -82.2364632),
                        new Coincidencia(1,0,1,1,1,0)),
                 new Estudiante(2L, "Rosa", "Maines", "2001-02-27",
                        new Position(32.874735, 117.531622),
                        new Coincidencia(1,1,0,1,1,0)),
                 new Estudiante(3L, "Delcine", "Trosdall", "2000-01-06",
                        new Position(28.797983, 116.070639),
                        new Coincidencia(0,0,0,0,0,0)),
                 new Estudiante(4L, "Julienne", "Elt", "2000-12-05",
                        new Position(-2.804472, 129.484497),
                        new Coincidencia(0,1,1,1,1,0)),
                 new Estudiante(4L, "Jelene", "Oakenford", "2002-06-15",
                        new Position(30.0747701, 129.484497),
                        new Coincidencia(0,0,0,1,1,0)));
    }

    public static float hallarCompatibilidad(Long idA, Long idB) throws ParseException {

        /* Se obtiene informacion de los estudiantes según el id enviado */
        Estudiante estudianteA = Demo3Main.obtenerInfoEstudiante(idA).orElseThrow(() -> new IllegalArgumentException("No existe estudiante con el id [" + idA + "]"));
        Estudiante estudianteB = Demo3Main.obtenerInfoEstudiante(idB).orElseThrow(() -> new IllegalArgumentException("No existe estudiante con el id [" + idB + "]"));

        log.info("<=== Hallar la compatibilidad entre estudiantes {} y {} ===>", estudianteA.getFirstName(), estudianteB.getFirstName());
        /* Se calcula la distancia */
        double distGeografica = UtilFormulas.calculaDistanciaGeo(estudianteA.getPosition().getLatitude(), estudianteA.getPosition().getLongitude(),
                                                                   estudianteB.getPosition().getLatitude(), estudianteB.getPosition().getLongitude());

        /* La formula de compatibilidad es C = primerFactor + segundoFactor + tercerFactor */

        float primerFactor = (float) Math.pow(Math.log10(distGeografica), -1);

        float segundoFactor = UtilFormulas.calcularDiferenciaEdad(estudianteA.getBirth(), estudianteB.getBirth());

        float tercerFactor = calcularConcidencias(estudianteA.getCoincidencia(), estudianteB.getCoincidencia());


        return primerFactor + segundoFactor + tercerFactor;

    }

    public static Optional<Estudiante> obtenerInfoEstudiante (Long id) {

        return data.stream().filter(x->id.equals(x.getId())).findFirst();
    }

    public static Integer calcularConcidencias (Coincidencia coincidenciaA, Coincidencia coincidenciaB) {

        List<Integer> coincidencias = Arrays.asList(calcularCoincidenciaTipo(coincidenciaA.getDog(), coincidenciaB.getDog()),
                                                    calcularCoincidenciaTipo(coincidenciaA.getCat(), coincidenciaB.getCat()),
                                                    calcularCoincidenciaTipo(coincidenciaA.getIndoors(), coincidenciaB.getIndoors()),
                                                    calcularCoincidenciaTipo(coincidenciaA.getOutdoors(), coincidenciaB.getOutdoors()),
                                                    calcularCoincidenciaTipo(coincidenciaA.getSports(), coincidenciaB.getSports()),
                                                    calcularCoincidenciaTipo(coincidenciaA.getStem(), coincidenciaB.getStem()));

       return coincidencias.stream().reduce(0 , Integer::sum);

    }

    public static Integer calcularCoincidenciaTipo(Integer coincA, Integer coincB) {

        if (coincA.equals(coincB)) return 1;

        return 0;

    }


}
