public class MEC {

    public static void imprimeUniversidades(Universidade[] arrayUniversidade){
        for (int i = 0; i < arrayUniversidade.length; i++){
            arrayUniversidade[i].imprimeInfo();
        }
    }

    public static void maisCara(Privada [] arrayUniversidade){
        for (int i = 0; i < arrayUniversidade.length; i++)
            arrayUniversidade[i].getValorMensalidade();
    }

    public static void universidadesDoSul(){

    }

}
