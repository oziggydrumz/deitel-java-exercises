package tdd;

public class Account {
    private int balance;

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getDeposit() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int getwithdraw() {
        return balance;
    }
}
