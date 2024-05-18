import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente = "";
        String agencia = "";
        int numeroConta;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, por favor, infrome o seu nome:");
        nomeCliente = teclado.next();

        System.out.println("Ótimo, agora o a agencia do seu banco, por favor:");
        agencia = teclado.next();

        System.out.println("Agora o número da sua conta:");
        numeroConta = teclado.nextInt();

        System.out.println("Por último, informe o seu saldo:");
        saldo = teclado.nextDouble();

        teclado.close();
        
        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        

    
    }
}
