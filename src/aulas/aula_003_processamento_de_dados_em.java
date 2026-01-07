package aulas;

public class aula_003_processamento_de_dados_em {
    public static void exemplo1(String[] args) {
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
    }

    public static void exemplo2(String[] args) {
        double b, B, h, area;

        b = 6.0;
        B = (int) 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.printf("AREA = %.4f%n", area);
    }

        public static void main(String[] args) {
        exemplo2(args);
    }
}
