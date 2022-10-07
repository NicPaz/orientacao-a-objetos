public class Exemplo5 {


    public static void main(String[] args) {
        int qtde = 5;

        //para
        System.out.println("Repetição do tipo for:");    
        for (int i = 0; i < qtde; i++) {
            System.out.println(i);
        }

        //enquanto 
        System.out.println("Repetição do tipo while");
        int cont = 0;
        while (cont <= qtde) {
            System.out.println(cont);
            cont++;
        }

        System.out.println("Repetição do tipo do...while");
        cont = 0;
        do {
            System.out.println(cont);
            cont++;
        }while (cont <= qtde);
    }



}