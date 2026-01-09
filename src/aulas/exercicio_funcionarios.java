package aulas;

import java.util.Scanner;
import entities.Funcionarios;

public class exercicio_funcionarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double salary;
        int id, x, percent, idInformado;
        
        System.out.print("Quantos funcionários serão cadastrados? ");
        x = sc.nextInt();
        Funcionarios[] funcionarios = new Funcionarios[x];

        System.out.println("\nDigite abaixo as informações dos funcionários:\n");
        for (int i = 0; i < x; i++) {

            System.out.print("ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome completo: ");
            name = sc.nextLine();

            System.out.print("Salário: ");
            salary = sc.nextDouble();
            System.out.println();

            funcionarios[i] = new Funcionarios(id, name, salary);
        }

        System.out.print("Digite o ID do funcionário que terá um aumento de salário: ");
        idInformado = sc.nextInt();
 
        System.out.print("Digite a porcentagem de aumento de salário: ");
        percent = sc.nextInt();
        
        Funcionarios encontrado = null;

        for (int i = 0; i < x; i++) {
            if (funcionarios[i].getId() == idInformado) {
                encontrado = funcionarios[i];
                break;
            }
        }

        if (encontrado != null) {
            encontrado.increaseSalary(percent);
        }
        else {
            System.out.println("Funcionário não encontrado.");
        }

        System.out.println("\nLista de funcionários cadastrados:");
        for (int i = 0; i < x; i++) {
            Funcionarios f = funcionarios[i];
            System.out.println("ID " + f.getId() + " | Nome: " + f.getName() + " | Salário: " + f.getSalary());
        }
        sc.close();
    }
}
