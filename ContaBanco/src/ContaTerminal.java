import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência: ");
        int numero  = scanner.nextInt();

        System.out.print("Por favor, digite a sua Agência: ");
        String agencia  = scanner.next();

        System.out.print("Por favor, digite o seu primeiro nome: ");
        String primeiroNome  = scanner.next();

        System.out.print("Por favor, digite o seu sobrenome: ");
        String sobrenome  = scanner.next();

        String nomeCliente = primeiroNome + " " + sobrenome;

        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
