package com.multiplica.challenge.demo1.dtos;

import com.multiplica.challenge.demo1.interfaces.ProtossInterface;
import com.multiplica.challenge.demo1.interfaces.TerranInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Custom1 extends Guerrero implements ProtossInterface, TerranInterface {

    @Override
    public void correr() {

        log.info("PERSONAJE PUEDE CORRER");
    }

    @Override
    public void defender() {
        log.info("PERSONAJE PUEDE DEFENDER");
    }

    @Override
    public void atacar() {
        log.info("PERSONAJE PUEDE ATACAR");
    }

    @Override
    public void hechizar() {

    }
}
