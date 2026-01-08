package aulas;
import entities.Account;
import java.util.Scanner;

public class exercicio_account {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        String number = sc.nextLine();
        System.out.print("Digite o nome do proprietário: ");
        String name = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial? (S/N) ");
        char deposit = sc.nextLine().toLowerCase().charAt(0);
        double balance = 0.0;

        if (deposit == 's') {
            System.out.print("Digite o valor de depósito: ");
            balance = sc.nextDouble();
        }

        Account account = new Account(number, name, balance);

        System.out.println("Dados da conta bancária: ");
        System.out.println(account);

        System.out.print("Digite um valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        account.addBalance(valorDeposito);
        System.out.println("\nDados atualizados da conta bancária: ");
        System.out.println(account);

        System.out.print("Digite um valor de retirada: ");
        double valorRetirada = sc.nextDouble();
        account.removeBalance(valorRetirada);
        System.out.println("\nDados atualizados da conta bancária: ");
        System.out.println(account);

        sc.close();
    }
}
