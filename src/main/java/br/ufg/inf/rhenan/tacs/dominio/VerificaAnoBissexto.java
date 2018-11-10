package br.ufg.inf.rhenan.tacs.dominio;

public class VerificaAnoBissexto {

    public static boolean isAnoBissexto(int ano) {
        if ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) ){
            return true;
        }
        else{
            return false;
        }
    }
}
