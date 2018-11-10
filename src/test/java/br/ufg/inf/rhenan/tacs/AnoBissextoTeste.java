package br.ufg.inf.rhenan.tacs;

import br.ufg.inf.rhenan.tacs.dominio.VerificaAnoBissexto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnoBissextoTeste {

    @Test
    public void testeAnoBisexto() {
        //cenario
        int anoSimples = 2015;
        int anoBissexto = 2016;

        //dados
        boolean valid;
        boolean bissexto = true;
        boolean naoBissexto = false;

        //teste bisexto
        valid = VerificaAnoBissexto.isAnoBissexto(anoBissexto);
        assertEquals(bissexto, valid);

        //teste não bissexo
        valid = VerificaAnoBissexto.isAnoBissexto(anoSimples);
        assertEquals(naoBissexto, valid);
    }

    @Test
    public void testeConversorAlgarismos() {
        //cenario

    }
}
