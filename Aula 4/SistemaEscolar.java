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
            System.out.println("\n Nome do aluno:");
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

}
