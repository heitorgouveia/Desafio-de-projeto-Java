import java.util.Scanner;

public class ContaTerminal {

    

    public static void main(String[] args) {
       

        double saldo=510.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");









    }
}