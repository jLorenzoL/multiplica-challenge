package com.multiplica.challenge.demo1.dtos;

import com.multiplica.challenge.demo1.interfaces.ZergInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zerg extends Guerrero implements ZergInterface {
    @Override
    public void controlarMente() {
        log.info("PERSONAJE PUEDE CONTROLAR LA MENTE");
    }

    @Override
    public void volar() {
        log.info("PERSONAJE PUEDE VOLAR");
    }
}
