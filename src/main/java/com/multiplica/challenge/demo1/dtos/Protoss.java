package com.multiplica.challenge.demo1.dtos;

import com.multiplica.challenge.demo1.interfaces.ProtossInterface;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Protoss extends Guerrero implements ProtossInterface {
    @Override
    public void correr() {
        log.info("PERSONAJE PUEDE CORRER");
    }

    @Override
    public void defender() {
        log.info("PERSONAJE PUEDE DEFENDER");
    }
}
