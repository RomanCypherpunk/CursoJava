package aulas;
import entities.Triangle;
import java.util.Scanner;

public class aula_006_compareAreas {
    
    public static void main(String[] args) {

        // cria o scanner para ler input
        Scanner sc = new Scanner(System.in);

        // declara as variaveis dos lados dos triangulos 1 e 2
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // inicia o programa que recebe os dados dos triangulos
        System.out.println("COMPARANDO ÁREAS");
        System.out.println("Digite as medidas do TRIÂNGULO 1 em metros, separando por espaços: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do TRIÂNGULO 2 em metros, separando por espaços: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // calcula a area dos dois triangulos
        double areaX = x.a * x.b * x.c;
        double areaY = y.a * y.b * y.c;

        // saida de dados apresentando os valores para o ususario
        System.out.printf("A área do TRIÂNGULO 1 é %.2f metros %n", areaX);
        System.out.printf("A área do TRIÂNGULO 2 é %.2f metros %n", areaY);

        // calcula e apresenta o maior triângulo
        if (areaX > areaY) {
            System.out.printf("O TRIÂNGULO 1 é maior que o TRIÂNGULO 2.");
        }

        else {
            System.out.printf("O TRIÂNGULO 2 é maior que o TRIÂNGULO 1.");
        }

        sc.close();
    }
}
