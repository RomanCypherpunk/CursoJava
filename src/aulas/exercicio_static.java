package aulas;

import java.util.Scanner;
import entities.Potencia;

public class exercicio_static {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número para calcular a potência dele: ");
        numero = sc.nextDouble();
        double potencia = Potencia.potencia(numero);

        System.out.printf("A potência de %.2f é %.2f", numero, potencia);

        sc.close();
    }
}
