import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        int conta = 1021;
        String agencia = "067-8";
        String nome = "Mario Jorge";
        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-Vindo a Banco Dio");
        System.out.println("Digite o  numero da sua conta: ");
        int numeroConta = scanner.nextInt();
            if(numeroConta == conta){
                System.err.println("Ola " + nome + " é um prazer ter o senhor como cliente do nosso banco ");
                System.out.println("sua agencia é: " + agencia + " e o seu salto atual é: "+ saldo +" ."  );
            }
            else{
                System.err.println("Numero não encotrado; ");
            }
        }
    }
