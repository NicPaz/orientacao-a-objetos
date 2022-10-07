import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

public class Exemplo4 {

    public static void main(String[] args) {
        Integer valor1, valor2, res;
        OperacoesMatematicas opMat = new OperacoesMatematicas();

        if (args.length < 2){
            System.out.println("O progresso precisa de 2 parâmetros");
            System.exit(0);
        }
        valor1 = Integer.parseInt(args[0]);
        valor2 = Integer.parseInt(args[1]);

        //IF-ELSE
        System.out.println("Primeiro teste");
        if (valor1 < 5) {
            res = opMat.multiplicar(valor1, valor2);
            System.out.println(valor1 + "x" + valor2 + "=" + res);
        }

        System.out.println("Segundo teste");
        if ((valor1 > valor2) && (valor2 != 0)){
            res = opMat.subtrair(valor1, valor2);
            System.out.println(valor1 + "-" + valor2 + "=" + res);
        } else if ((valor1 == valor2) ||(valor1 > 10)){
            res = opMat.multiplicar(valor1, valor2);
            System.out.println(valor1 + "x" + valor2 + "=" + res);
        } else {
            System.out.println("Nenhum critério atendido...");
        }


        // SWITCH CASE
        String resp = "s";
        switch(resp.toUpperCase()){
            case "S":
            System.out.println("Sim");
            break;

            case "N":
            System.out.println("Não");
            break;

            default:
            System.out.println("Outro valor");
        }
    }
}
