public class Principal {

    public static void main(String[] args){
        // Crie um array de Universidade com o n�mero de posi��es indicadas pelo usu�rio via teclado. (OK)
        int tamanhoArray = Teclado.leInt("Digite o numero de universidades que voc� deseja incluir: ");
        Universidade [] arrayUniversidade = new Universidade[tamanhoArray];


        for (int i = 0; i < arrayUniversidade.length; i++){
            System.out.println("Que tipo de universidade voc� deseja incluir? ");
            int publicaOuPrivada = Teclado.leInt("Digite uma op��o: 1 - P�blica | 2 - Privada: ");

            if(publicaOuPrivada == 1)
                arrayUniversidade[i] = new Publica("UFRGS", 30, 2, "RS", "POA");

            if( publicaOuPrivada == 2) arrayUniversidade[i] = new Privada("PUCRS", 60, 4, 1000);

        }

        for (int i = 0; i < arrayUniversidade.length; i++)
            System.out.println(arrayUniversidade[i].getNome());
    }

}

