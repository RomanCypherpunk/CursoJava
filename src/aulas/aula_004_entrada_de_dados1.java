package aulas;

import java.util.Scanner;

public class aula_004_entrada_de_dados1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double preco = 20;
        int desconto = ((int) preco < 20) ? 5 : 10;

        System.out.println("Digite seu nome completo: ");
        nome = sc.next();
        System.out.println("Seu nome completo é : " + nome);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        sc.close();
    }
}
