import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("==============//================");
        System.out.println("Bem vindo a central de consulta!\n  Siga as instruções abaixo:");
        System.out.println("==============//================");

        System.out.println("Infome o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do Saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("=========================================================");
        System.out.println("Ola, " + nomeCliente + ". Obrigada por criar uma conta em nosso banco!!\n-> Sua agência é a: " +
        agencia + "\n-> Seu numero da conta é: " + numeroConta + "\n-> Seu saldo de " + saldoConta + " já está disponível para saque!");
        System.out.println("=========================================================");
    }
}
