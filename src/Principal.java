public class Principal {

    public static void main(String[] args){

        int tamanhoArray = Teclado.leInt("Digite o numero de universidades que você deseja cadastrar: ");
        Universidade [] arrayUniversidade = new Universidade[tamanhoArray];


        for (int i = 0; i < arrayUniversidade.length; i++){

            System.out.println("Que tipo de universidade você deseja incluir? ");
            int publicaOuPrivada = Teclado.leInt("Digite uma opção: 1 - Pública | 2 - Privada: ");

            if(publicaOuPrivada == 1)
                arrayUniversidade[i] = new Publica(
                    Teclado.leString("Insira o nome da Universidade: "),
                    Teclado.leInt("Insira a quantidade de alunos: "),
                    Teclado.leInt("Insira a quantidade de Professores: "),
                    Teclado.leString("Insira o Estado: "),
                    Teclado.leString("Insira a Cidade: ")
                );

            if( publicaOuPrivada == 2)
                arrayUniversidade[i] = new Privada(
                    Teclado.leString("Insira o nome da Universidade: "),
                    Teclado.leInt("Insira a quantidade de alunos: "),
                    Teclado.leInt("Insira a quantidade de Professores: "),
                    Teclado.leDouble("Insira o valor da mensalidade: ")
                );
        }

        MEC.imprimeUniversidades(arrayUniversidade);
        //MEC.maisCara(arrayUniversidade);
        MEC.universidadesDoSul(arrayUniversidade);

    }
}