package entities;

public class Funcionarios {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public double increaseSalary(double percent) {
        return this.salary *= 1 + (percent / 100.0); 
    }

    public Funcionarios(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



}
