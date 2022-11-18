public class MEC {

    public static void imprimeUniversidades(Universidade[] arrayUniversidade) {
        System.out.println();
        System.out.println    ("----------IMPRIME UNIVERSIDADES----------");
        for (int i = 0; i < arrayUniversidade.length; i++) {
            System.out.println("Universisdade "+(i+1));
            System.out.println("-----------------------------------------");
            arrayUniversidade[i].imprimeInfo();
            if (arrayUniversidade[i] instanceof Privada)
                System.out.println("Iniciativa: Privada");
            if (arrayUniversidade[i] instanceof Publica)
                System.out.println("Iniciativa: Pública");
            System.out.println("-----------------------------------------");
        }
    }

    public static void maisCara(Universidade[] arrayUniversidade) {
        int index = 0;
        double universidadeMaisCara = 0;
        for (int i = 0; i < arrayUniversidade.length; i++) {
            if (arrayUniversidade[i] instanceof Privada) {
                universidadeMaisCara = ((Privada) arrayUniversidade[i]).getValorMensalidade();
                index = i;
            }
        }
        System.out.println();
        System.out.println("---------UNIVERSIDADE MAIS CARA----------");
        ((Privada) arrayUniversidade[index]).imprimeInfo();
        System.out.println("-----------------------------------------");
    }

    public static void universidadesDoSul(Universidade[] arrayUniversidade) {
        String aux;
        System.out.println();
        System.out.println("----------UNIVERSIDADES DO SUL-----------");
        for (int i = 0; i < arrayUniversidade.length; i++) {
            if (arrayUniversidade[i] instanceof Publica) {
                aux = (((Publica) arrayUniversidade[i]).getEstado());
                if(aux.equals("RS") || aux.equals("SC") || aux.equals("PR")) {
                    System.out.println("-----------------------------------------");
                    ((Publica) arrayUniversidade[i]).imprimeInfo();
                    System.out.println("-----------------------------------------");
                }
            }
        }
    }
}