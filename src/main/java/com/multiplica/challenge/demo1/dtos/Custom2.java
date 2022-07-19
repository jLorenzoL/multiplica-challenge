package com.multiplica.challenge.demo1.dtos;

import com.multiplica.challenge.demo1.interfaces.TerranInterface;
import com.multiplica.challenge.demo1.interfaces.ZergInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Custom2 extends Guerrero implements TerranInterface, ZergInterface {

    public void sanar(){
        log.info("PERSONAJE PUEDE SANAR");
    };

    @Override
    public void atacar() {

    }

    @Override
    public void hechizar() {
        log.info("PERSONAJE PUEDE HECHIZAR");
    }

    @Override
    public void controlarMente() {
        log.info("PERSONAJE PUEDE CONTROLAR LA MENTE");
    }

    @Override
    public void volar() {

    }
}
