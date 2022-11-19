public class Principal {
    public static void main(String[] args) {

        int tamanhoArray = Teclado.leInt("Digite o número de Universidades que você deseja cadastrar: ");
        Universidade[] arrayUniversidade = new Universidade[tamanhoArray];

        for (int i = 0; i < arrayUniversidade.length; i++) {
            System.out.println();
            System.out.println("Que tipo de Universidade você deseja cadastrar? ");
            System.out.println("[ 1 ]- Pública");
            System.out.println("[ 2 ]- Privada");
            System.out.println();
            int publicaOuPrivada = Teclado.leInt("Digite uma numero: ");
            System.out.println();

            if (publicaOuPrivada == 1) {
                arrayUniversidade[i] = new Publica(
                        Teclado.leString("Insira o nome da Universidade: "),
                        Teclado.leInt("Insira a quantidade de alunos: "),
                        Teclado.leInt("Insira a quantidade de Professores: "),
                        Teclado.leString("Insira o Estado: "),
                        Teclado.leString("Insira a Cidade: ")
                );
                System.out.println("(*) Universidade cadastrada com sucesso!");
            }
            if (publicaOuPrivada == 2) {
                arrayUniversidade[i] = new Privada(
                        Teclado.leString("Insira o nome da Universidade: "),
                        Teclado.leInt("Insira a quantidade de alunos: "),
                        Teclado.leInt("Insira a quantidade de Professores: "),
                        Teclado.leDouble("Insira o valor da mensalidade: ")
                );
                System.out.println("(*) Universidade cadastrada com sucesso!");
            }
        }

        boolean aux = true;
        while(aux){
            System.out.println();
            System.out.println("------------------MENU-------------------");
            System.out.println("[ 1 ] - Imprimir universidades");
            System.out.println("[ 2 ] - Imprimir universidade mais cara");
            System.out.println("[ 3 ] - Imprimir universidades do Sul");
            System.out.println("[ 4 ] - Sair");
            System.out.println("-----------------------------------------");

            int sCase = Teclado.leInt("Digite um numero: ");

            switch(sCase) {
                case 1:
                    MEC.imprimeUniversidades(arrayUniversidade);
                    break;
                case 2:
                    MEC.maisCara(arrayUniversidade);
                    break;
                case 3:
                    MEC.universidadesDoSul(arrayUniversidade);
                    break;
                case 4:
                    System.out.println("(*) Logout realizado com sucesso!");
                    System.exit(0);
                    break;
                default:
            }
        }
    }
}