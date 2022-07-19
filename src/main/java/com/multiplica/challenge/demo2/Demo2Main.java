package com.multiplica.challenge.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class Demo2Main {

    @Data
    @AllArgsConstructor
    public static class Persona {
        private String nombre;
        private boolean donacion;
        private List<String> esposas;
    }

    public static void main(String[] args) {


        List<Persona> personas = Arrays.asList(new Persona("Pepe", true, Arrays.asList("Rosangela","Mayte")),
                                               new Persona("Juan", false, Collections.singletonList("Yahaira")),
                                               new Persona("Lalo", true, new ArrayList<>()));

        log.info("Retornar solo los NOMBRES de las personas que donan órganos y que tienen 1 o más esposas, cuyo nombre empiece con 'Y' o 'N'");
        List<String> resultado = personas.stream().filter(Persona::isDonacion)
                         .filter(x-> x.getEsposas().size()>=1)
                         .filter(x-> x.getEsposas().stream()
                                                   .anyMatch(s -> s.startsWith("Y") ||
                                                             s.startsWith("N")) )
                         .map(Persona::getNombre).collect(Collectors.toList());

        if(resultado.isEmpty()){
            log.info("NO SE ENCONTRARON RESULTADOS CON LOS CRITERIOS DE BÚSQUEDA");
        } else {
            log.info("Se encontró {} COINCIDENCIA(S) : {}", resultado.size(), Collections.singletonList(resultado));
        }



    }

}
