import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Importar class Scanner
        Scanner input = new Scanner(System.in);
        int numeroConta, agencia;
        Double saldoConta;
        String nomeCliente;
        //Exibir mensagem para o nosso usuário
        //Obter pelo Scanner os valores no terminarl
        System.out.println("Digite sua seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println("Digite número conta: ");
        numeroConta = input.nextInt();
        System.out.println("Digite agencia: ");
        agencia = input.nextInt();
        System.out.println("Digite saldo: ");
        saldoConta = input.nextDouble();
        //Exibir a mensajem conta criada
        System.out.println("olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta, " + numeroConta + " e seu saldo é: " + saldoConta);

    }
}