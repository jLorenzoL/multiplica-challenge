package com.multiplica.challenge.demo1;

import com.multiplica.challenge.demo1.dtos.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo1Main {

    public static void main(String[] args) {


        log.info("<<<=== Se agrega personaje 1 - Custom con las siguientes caracteristicas ===>>>");
        Custom1 custom = new Custom1();
        custom.correr();
        custom.defender();
        custom.atacar();
        custom.gritar();
        custom.hablar();

        log.info("<<<=== Se agrega personaje 2 - Custom con las siguientes caracteristicas ===>>>");
        Custom2 custom2 = new Custom2();
        custom2.controlarMente();
        custom2.hechizar();
        custom2.sanar();
        custom2.gritar();
        custom2.hablar();

        log.info("<<<=== Se agrega PROTOSS con las siguientes caracteristicas ===>>>");
        Protoss protoss = new Protoss();
        protoss.defender();
        protoss.correr();
        protoss.gritar();
        protoss.hablar();

        log.info("<<<=== Se agrega TERRAN con las siguientes caracteristicas ===>>>");
        Terran terran = new Terran();
        terran.hablar();
        terran.gritar();
        terran.hechizar();
        terran.atacar();

        log.info("<<<=== Se agrega ZERG con las siguientes caracteristicas ===>>>");
        Zerg zerg = new Zerg();
        zerg.hablar();
        zerg.gritar();
        zerg.controlarMente();
        zerg.volar();

    }
}
