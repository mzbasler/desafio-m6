public class Publica extends Universidade {
    private String estado, cidade;

    public Publica(String nome, int quantAlunosA, int quantProfessores, String estado, String cidade) {
        super(nome, quantAlunosA, quantProfessores);
        estado = estado;
        cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String e) {
        estado = e;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String c) {
        cidade = c;
    }

    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Estado: "+estado);
        System.out.println("Cidade: "+cidade);
    }

}
