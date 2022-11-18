public class MEC {

    public static void imprimeUniversidades(Universidade[] arrayUniversidade) {
        System.out.println();
        System.out.println("----------IMPRIME UNIVERSIDADES----------");
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

        for (int i = 0; i < arrayUniversidade.length; i++) {
            if (arrayUniversidade[i] instanceof Privada) {

            }
        }
    }
}