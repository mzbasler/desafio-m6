public class MEC {

    public static void imprimeUniversidades(Universidade[] arrayUniversidade) {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("UNIVERSIDADES CADASTRADAS");
        System.out.println("-----------------------------------------");

        // FOR QUE PERCORRE O ARRAYLIST E IMPRIME AS INFORMA��ES DAS UNIVERSIDADES
        for (int i = 0; i < arrayUniversidade.length; i++) {
            System.out.println("-----------------------------------------");
            arrayUniversidade[i].imprimeInfo();
            // SE � UMA INSTANCIA DE PRIVADA ELE IMPRIME INICIATIVA PRIVADA
            if (arrayUniversidade[i] instanceof Privada)
                System.out.println("Iniciativa: Privada");
            // SE � UMA INSTANCIA DE PRIVADA ELE IMPRIME INICIATIVA PUBLICA
            if (arrayUniversidade[i] instanceof Publica)
                System.out.println("Iniciativa: P�blica");
            System.out.println("-----------------------------------------");
        }
    }

    public static void maisCara(Universidade[] arrayUniversidade) {
        int index = 0;
        double universidadeMaisCara = 0;
        // FOR QUE PERCORRE O ARRAYLIST
        for (int i = 0; i < arrayUniversidade.length; i++) {
            // VERIFICA SE � UMA INSTANCIA DA CLASSE PRIVADA
            if (arrayUniversidade[i] instanceof Privada) {
                // VERIFICA SE VARI�VEL � MENOR QUE O VALOR DA MENSALIDADE INDEXADA
                if (universidadeMaisCara < ((Privada) arrayUniversidade[i]).getValorMensalidade()) {
                    // VARI�VEL RECEBE VALOR DA MENSALIDADE SE ESTE FOR MENOR QUE A MENSALIDADE DA POSI��O DO �NDICE
                    universidadeMaisCara = ((Privada) arrayUniversidade[i]).getValorMensalidade();
                    // RECEBE O VALOR DO �NDICE PARA IMPRIMIR AS INFOS DA UNIVERSIDADE EM QUEST�O.
                    index = i;
                }
            }
        }
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("UNIVERSIDADE PRIVADA MAIS CARA");
        System.out.println("-----------------------------------------");
        ((Privada) arrayUniversidade[index]).imprimeInfo();
        System.out.println("-----------------------------------------");
    }

    public static void universidadesDoSul(Universidade[] arrayUniversidade) {
        String aux;
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("UNIVERSIDADES PUBLICAS DO SUL");
        System.out.println("-----------------------------------------");
        // FOR QUE PERCORRE ARRAYLIST
        for (int i = 0; i < arrayUniversidade.length; i++) {
            // VERIFICA SE � UMA INSTANCIA DA CLASSE PUBLICA E AUX RECEBE O ESTADO
            if (arrayUniversidade[i] instanceof Publica) {
                aux = (((Publica) arrayUniversidade[i]).getEstado());
                // VERIFICA SE VARIAVEL AUX � IGUAL � RS, SC OU PR.
                if(aux.equalsIgnoreCase("RS") || aux.equalsIgnoreCase("SC") || aux.equalsIgnoreCase("PR")) {
                    System.out.println("-----------------------------------------");
                    //IMPRIME INFORMA��ES DO ARRAYLIST
                    ((Publica) arrayUniversidade[i]).imprimeInfo();
                    System.out.println("-----------------------------------------");
                }
            }
        }
    }
}