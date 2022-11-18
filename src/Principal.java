public class Principal {

    public static void main(String[] args){

        int tamanhoArray = Teclado.leInt("Digite o numero de universidades que você deseja incluir: ");
        Universidade [] arrayUniversidade = new Universidade[tamanhoArray];


        for (int i = 0; i < arrayUniversidade.length; i++){

            System.out.println("Que tipo de universidade você deseja incluir? ");
            int publicaOuPrivada = Teclado.leInt("Digite uma opção: 1 - Pública | 2 - Privada: ");

            if(publicaOuPrivada == 1)
                arrayUniversidade[i] = new Publica("UFRGS", 30, 2, "RS", "Porto Alegre");

            if( publicaOuPrivada == 2)
                arrayUniversidade[i] = new Privada("PUCRS", 60, 4, 1000);
        }

        MEC.imprimeUniversidades(arrayUniversidade);
        MEC.maisCara(arrayUniversidade);
        MEC.universidadesDoSul(arrayUniversidade);

    }
}