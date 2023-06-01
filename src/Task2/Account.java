package Task2;

public abstract class Account {

    public abstract double getBalance();

    public abstract void setBalance(double balance);

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
