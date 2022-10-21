import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;

    public static void main(String[] args) throws Exception{
      
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Infome o nome da escola:");
        se.e1.setNome(se.reader.readLine());
        System.out.println("Telefone:");
        se.e1.setFone(se.reader.readLine());
        se.menu();
    }

    public void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("-----------");
            System.out.println("[1] Cadastrar nova turma");
            System.out.println("[2] Listar as turmas existentes");
            System.out.println("[3] Consultar turma");
            System.out.println("[4] Sair");

            opcao = this.reader.readLine();

            switch(opcao){
                case "1":
                this.cadastrarTurma();
                break;

                case "2":
                this.listarTurmas();
                break;

                case "3":
                this.consultarTurma();
                break;

                default:
                break;
            }

        }
    }


    
    public void cadastrarTurma() throws Exception{
        Turma t = new Turma();
        System.out.println("Cadastro de turma");
        System.out.println("Informe o número da turma");
        t.setNumeroTurma(Integer.parseInt(this.reader.readLine()));

        System.out.println("Nome do curso:");
        t.setNomeCurso (this.reader.readLine());

        System.out.println("Informe o ano ");
        t.setAno(Integer.parseInt(this.reader.readLine()));

        System.out.println("---- Alunos ----");
        for (int i=0; i < 40; i++){
            Aluno aluno = new Aluno();
            System.out.println("\n Nome do aluno: (Enter para sair)");
            String nome = this.reader.readLine();
            if(nome.equals("")){
                break;
            }

            aluno.setNome(nome);

            System.out.println("\n Matricula do aluno:");
            aluno.setMatricula(this.reader.readLine());

            System.out.println("\n Nota 1:");
            aluno.setNota1(Float.parseFloat(this.reader.readLine()));

            System.out.println("\n Nota 2:");
            aluno.setNota2(Float.parseFloat(this.reader.readLine()));

            System.out.println("\n Nota 3:");
            aluno.setNota3(Float.parseFloat(this.reader.readLine()));

            System.out.println("\n Nota 4:");
            aluno.setNota4(Float.parseFloat(this.reader.readLine()));

            t.setAluno(aluno);
        }
        this.e1.setTurma(t);

    }

    public void listarTurmas() throws Exception{
        System.out.println("\n-------------");
        System.out.println("Relatório de turmas");
        for (int i = 0; i < this.e1.getQtdeTurmas(); i++) {
            System.out.print("Número: " + this.e1.getTurmas(i).getNumeroTurma() + "\t");
            System.out.print("Nome do curso: " + this.e1.getTurmas(i).getNomeCurso() + "\t");
            System.out.print("Ano: " + this.e1.getTurmas(i).getAno() + "\n" );

        }
    }


    public void consultarTurma(){
        try{
            System.out.println("-----------------------");
            System.out.println("Consulta de turma");
            System.out.println("Informe o número da turma: ");
            int numTurma = Integer.parseInt(this.reader.readLine());
            boolean achou = false;

            for (int i = 0; i<this.e1.getQtdeTurmas(); i++) {
                Turma t = this.e1.getTurmas(i);
                if(t.getNumeroTurma() == numTurma){
                    System.out.println("Alunos da turma:");
                    int pos = 0;
                    while(t.getAluno(pos) != null){
                        String linha =  "Nome: " + t.getAluno(pos).getNome();
                        linha += " - Matrícula: " + t.getAluno(pos).getMatricula();
                        linha += " - Média: " + t.getAluno(pos).calcularMedia();
                        System.out.println(linha);
                        pos++;
                    }
                    achou = true;
                    break;
                }
            }if(!achou){
                System.out.println("Turma não encontrada.");
            }
        }catch(Exception e1){
            System.out.println("Formato inválido");
        }
    }

}
