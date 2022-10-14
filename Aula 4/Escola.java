public class Escola {
    private String nome;
    private String fone;
    private Turma[] vetTurmas;
    private int qtdeTurmas;

    public Escola(){
        this.vetTurmas = new Turma[20];
        this.qtdeTurmas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Turma getTurmas (int pos){
        return this.vetTurmas[pos];
    }    

    public void setTurma (Turma a){
        if (this.qtdeTurmas < 20){
            this.vetTurmas[this.qtdeTurmas] = a;
            this.qtdeTurmas++; 
        }
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }
}
