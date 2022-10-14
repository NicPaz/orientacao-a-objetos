public class Meses {
    String[] meses = new String[12];

    //Método construtor
    //Executado automaticamente sempre que cria um objeto da classe
    public Meses(){ 
        atribuirValore();

    }

    private void atribuirValore(){
        meses[0]= "Janeiro";
        meses[1]= "Fevereiro";
        meses[2]= "Março";
        meses[3]= "Abril";
        meses[4]= "Maio";
        meses[5]= "Junho";
        meses[6]= "Julho";
        meses[7]= "Agosto";
        meses[8]= "Setembro";
        meses[9]= "Outubro";
        meses[10]= "Novembro";
        meses[11]= "Dezembro";
    }

    public String pegarNomeMes(int nro){
        if ((nro > 12) || (nro < 1)){
            return "Erro";
        }
        else{
            return meses[nro-1];
        }

    }
    
}
