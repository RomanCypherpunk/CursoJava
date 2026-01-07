package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class aula_005_todolist {
    // listas usadas
    private static final List<String> tasks = new ArrayList<>();
    private static final List<String> lixeira = new ArrayList<>();

    // lista tarefas atuais
    private static void listar() {
        System.out.println("\nLISTA DE TAREFAS:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + " | " + tasks.get(i));
        }
        System.out.println();
    }

    // adiciona tarefa nova
    private static void adicionar(String tarefa) {
        tasks.add(tarefa);
        lixeira.clear();
        listar();
    }

    // traz de volta a ultima tarefa desfeita
    private static void refazer() {
        if (lixeira.isEmpty()) {
            System.out.println("Nenhuma tarefa para refazer.\n");
            return;
        }
        String tarefa = lixeira.remove(lixeira.size() - 1);
        tasks.add(tarefa);
        System.out.println("\nTarefa: " + tarefa + " foi refeita.");
        listar();
    }

    // desfaz a ultima tarefa
    private static void desfazer() {
        if (tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa para desfazer.\n");
            return;
        }
        String tarefa = tasks.remove(tasks.size() - 1);
        lixeira.add(tarefa);
        System.out.println("\nTarefa: " + tarefa + " foi desfeita.");
        listar();
    }

    private static void operacao() {
        Scanner scanner = new Scanner(System.in);
        try {
            boolean rodando = true;
            while (rodando) {
                System.out.print("Comandos: listar, desfazer, refazer, fim\nDigite uma tarefa ou comando:\n");
                String cmd = scanner.nextLine().toLowerCase(Locale.ROOT).trim();

                switch (cmd) {
                    case "listar": listar();
                        break;
                    case "desfazer": desfazer();
                        break;
                    case "refazer": refazer();
                        break;
                    case "fim":
                        System.out.println("Fim da operacao.");
                        rodando = false;
                        break;
                    default:
                        if (!cmd.isEmpty()) {
                            adicionar(cmd);
                        }
                        break;
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        operacao();
    }
}
