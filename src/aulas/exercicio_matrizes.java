package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_matrizes {
    public static void main(String[] args) {

        // cria um scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n recebe a quantidade de linhas e colunas que a matriz vai ter
        ArrayList<Integer> negative = new ArrayList<>(); // negative é uma lista que armazena os números negativos da matriz
        int[][] matriz = new int[n][n]; // matriz é uma matriz de inteiros que recebe o tamanho de n

        // laço for de i e j para receber os valores de linhas e colunas da matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // mostra a diagonal da matriz, que é o número que se encontra na posição i e j da matriz
        System.out.println("\nMain diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // usa a condicional para verificar se o número da matriz é negativo, e então adiciona ele a negative, percorrendo as linhas e colunas da matriz
        System.out.println("\nNegative numbers");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    negative.add(matriz[i][j]);
                }
            }
        }

        // mostra os numeros negativos através de cada negativeNumbers dentro da lista negative
        for (int negativeNumbers : negative) {
            System.out.print(negativeNumbers + " ");
        }

        sc.close();
    }
}
