public class Universidade {
    private String nome;
    private int quantAlunos, quantProfessores;
    public Universidade(String n, int qA, int qP) {
        nome = n;
        quantAlunos = qA;
        quantProfessores = qP;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public int getQuantAlunos() {
        return quantAlunos;
    }
    public void setQuantAlunos(int qA) {
        quantAlunos = qA;
    }
    public int getQuantProfessores() {
        return quantProfessores;
    }
    public void setQuantProfessores(int qP) {
        quantProfessores = qP;
    }
    public void imprimeInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade de alunos: "+quantAlunos);
        System.out.println("Quantidade de professores: "+quantProfessores);
    }
}