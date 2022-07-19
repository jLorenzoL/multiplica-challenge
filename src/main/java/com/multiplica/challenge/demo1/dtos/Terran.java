package com.multiplica.challenge.demo1.dtos;

import com.multiplica.challenge.demo1.interfaces.TerranInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Terran extends Guerrero implements TerranInterface {

    @Override
    public void atacar() {
        log.info("PERSONAJE PUEDE ATACAR");
    }

    @Override
    public void hechizar() {
        log.info("PERSONAJE PUEDE HECHIZAR");
    }

}
