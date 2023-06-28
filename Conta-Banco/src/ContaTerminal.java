import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo ao nosso banco! Estamos honrados em recebê-lo(a) como nosso novo(a) cliente e estamos aqui para oferecer todo o suporte necessário para que você alcance seus objetivos financeiros.");
        System.out.println("Para começarmos, é preciso que nos informe algumas informações.");
       
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agência");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o saldo");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente +"! Estamos felizes por recebê-lo(a) como nosso novo(a) cliente. Sua agência é " + numeroAgencia + " e o número da sua conta é " + numeroConta + ". Agradecemos a preferência e seu saldo (" + saldoCliente + ") já está disponível para saque.");


    

    }
}
