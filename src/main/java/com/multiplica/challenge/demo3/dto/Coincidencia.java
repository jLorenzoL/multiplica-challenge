package com.multiplica.challenge.demo3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Coincidencia {

    private Integer dog;
    private Integer cat;
    private Integer indoors;
    private Integer outdoors;
    private Integer sports;
    private Integer stem;

}
