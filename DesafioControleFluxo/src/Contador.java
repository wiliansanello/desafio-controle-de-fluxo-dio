import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Contador de números inteiros entre dois números pré-determinados");
        System.out.println("Informe o número onde inicia a contagem ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Informe o número onde a contagem finaliza");
        int segundoParametro = terminal.nextInt();

        try {
            efetuarContagem(primeiroParametro, segundoParametro);            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior do que o primeiro");
        }
    }

    static int efetuarContagem(int primeiroNumeroInserido, int segundoNumeroInserido) throws ParametrosInvalidosException {
        int diferenca = segundoNumeroInserido - primeiroNumeroInserido;
        
        if(diferenca <= 0){
            throw new ParametrosInvalidosException();
        } else {
            System.out.println("A diferença entre os números é " + diferenca + ". Iniciando contagem.");
            for(int i = 0;i < diferenca; i++){
                System.out.println("Número "+ i);
            }            
        }

        return diferenca;
    }
}
