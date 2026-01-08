package entities;

public class Account {
    private String number, holder;
    private double balance;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double addBalance(double balance) {
        return this.balance += balance;
    }

    public double removeBalance(double balance) {
        if (this.balance <= 0) {
            return 0;
        }

        else {
            return this.balance -= balance;
        }
    }

    public Account(String number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Conta número: " + number + ", proprietário: " + holder + ", saldo: " + String.format("%.2f", balance) + "\n";
    }
}
