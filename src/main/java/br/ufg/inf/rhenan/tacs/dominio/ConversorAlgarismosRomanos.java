package br.ufg.inf.rhenan.tacs.dominio;

public class ConversorAlgarismosRomanos {

    public static void main(String[] args) {

        int count = 0;
        String algarismo = "VMX";

        if (!algarismo.matches(".*IL|IC|ID|IM|VX|VL|VC|VD|VM|XD|XM|LC|LD|LM.*")) {
            System.out.println("<--ENTROU-->\n");
            if (algarismo.matches(".*X.*"))
                count += 10;

            System.out.println(count);
        } else System.out.println("Algarismo inválido");




    }


}
