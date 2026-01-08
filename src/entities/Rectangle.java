package entities;

public class Rectangle {
    public double diagonal, perimetro, area, altura, base;

    public double Area() {
        area = base * altura;
        return area;
    }

    public double Perimetro() {
        perimetro = 2 * (base + altura);
        return perimetro;
    }

    public double Diagonal() {
        diagonal = Math.sqrt((Math.pow(base, 2)) + Math.pow(altura, 2));
        return diagonal;
    }
}
