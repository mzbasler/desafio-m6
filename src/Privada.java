public class Privada extends Universidade {
    private double valorMensalidade;

    public Privada(String nome, int quantAlunos, int quantProfessores, double valorMensalidade) {
        super(nome, quantAlunos, quantProfessores);
        this.valorMensalidade = valorMensalidade;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidadeM) {
        this.valorMensalidade = valorMensalidade;
    }

    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Valor da mensalidade: R$"+valorMensalidade);
    }

}
