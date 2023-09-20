import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta (Formato xxx-x): ");
        String conta = scanner.next();

        System.out.println("Digite o nome completo do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o valor do primeiro depósito (Formato 0.00, não utilizar vírgula): ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
