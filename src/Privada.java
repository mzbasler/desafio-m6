public class Privada extends Universidade {
    private double valorMensalidade;
    public Privada(String n, int qA, int qP, double vM) {
        super(n, qA, qP);
        this.valorMensalidade = vM;
    }
    public double getValorMensalidade() {
        return valorMensalidade;
    }
    public void setValorMensalidade(double vM) {
        valorMensalidade = vM;
    }
    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Valor da mensalidade: R$"+valorMensalidade);
    }
}