package aulas;

import java.util.Locale;

public class aula_001 {
    public static void main(String[] args) {

        String produto1 = "Computer";
        String produto2 = "Office desk";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n", produto1, preco1);
        System.out.printf("%s, which price is $ %.2f %n%n", produto2, preco2);
        System.out.printf("Record: %d years old, code %d and gender: %c %n%n", idade, codigo, sexo);
        System.out.printf("Measue with eight decimal places: %.8f %n", medida);
        System.out.printf("Rouded (three decimal places): %.3f %n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", medida);

    }   
}
