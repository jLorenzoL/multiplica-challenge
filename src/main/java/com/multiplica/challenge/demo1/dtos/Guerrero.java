package com.multiplica.challenge.demo1.dtos;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Guerrero {

    public void hablar(){
        log.info("PERSONAJE PUEDE HABLAR");
    }

    public void gritar(){
        log.info("PERSONAJE PUEDE GRITAR");
    };
}
