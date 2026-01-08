package aulas;
import entities.Rectangle;
import java.util.Scanner;

public class exercicio_001_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Digite a base do retângulo: ");
        rectangle.base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        rectangle.altura = sc.nextDouble();

        System.out.println("Área: " + rectangle.Area());
        System.out.println("Perímetro: " + rectangle.Perimetro());
        System.out.printf("Diagonal: %.2f", rectangle.Diagonal());
        sc.close();
    }
}
