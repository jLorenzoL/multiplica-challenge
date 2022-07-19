package com.multiplica.challenge.demo3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private Long id;
    private String firstName;
    private String lastName;
    private String birth;
    private Position position;
    private Coincidencia coincidencia;

}
