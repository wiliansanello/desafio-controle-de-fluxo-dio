import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Contador de números inteiros entre dois números pré-determinados");
        System.out.println("Informe o número onde inicia a contagem ");
        int primeiroParametro = sc.nextInt();
        System.out.println("Informe o número onde a contagem finaliza");
        int segundoParametro = sc.nextInt();

        try {
            int contagem = efetuarContagem(primeiroParametro, segundoParametro);
            System.out.println("Iniciando iteração. Abaixo serão mostrados todos os números inteiros que estão entre os números informados.");
            for(int i = 0;i < contagem; i++){
                if (i != 0)
                    System.out.println("Número "+ (primeiroParametro + i));
            }            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior do que o primeiro");
        }
    }

    static int efetuarContagem(int primeiroNumeroInserido, int segundoNumeroInserido) throws ParametrosInvalidosException {
        int diferenca = segundoNumeroInserido - primeiroNumeroInserido;
        
        if(diferenca <= 0){
            throw new ParametrosInvalidosException();
        } 

        return diferenca;
    }
}
