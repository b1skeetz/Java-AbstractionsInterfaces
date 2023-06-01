public class CheckingAccount extends Account{

    private double balance;

    public CheckingAccount(double balance) {
        if (balance < 0) {
            System.out.println("Баланс на сберегательном счету не может быть отрицательным!");
            setBalance(0);
            return;
        }
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Баланс на расчетном счету не может быть отрицательным!");
            setBalance(0);
            return;
        }
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        if (amount < 0) {
            System.out.println("Сумма платежа не может быть отрицательной!");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Сумма платежа не может быть больше вашего баланса: " + amount + " > " + getBalance());
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Статус платежа " + amount + ": успех");
        System.out.println("Доступно средств: " + getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount < 0) {
            System.out.println("Сумма перевода не может быть отрицательной!");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("Сумма перевода не может быть больше вашего баланса: " + amount + " > " + getBalance());
            return;
        }
        setBalance(getBalance() - amount);
        account.addMoney(amount);
        System.out.println("Статус перевода " + amount + ": успех");
        System.out.println("Доступно средств: " + getBalance());
    }

    @Override
    public void addMoney(int amount) {
        if (amount < 0) {
            System.out.println("Сумма пополнения не может быть отрицательной!");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Статус пополнения " + amount + ": успех");
        System.out.println("Доступно средств: " + getBalance());
    }
}
