public class CreditAccount extends Account{

    private double balance;
    public CreditAccount(double balance) {
        if (balance > 0) {
            System.out.println("Баланс на кредитном счету не может быть положительным!");
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
        if (balance > 0) {
            System.out.println("Баланс на кредитном счету не может быть положительным!");
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
        setBalance(getBalance() - amount);
        System.out.println("Статус платежа " + amount + ": успех");
        System.out.println("В долгу средств: " + getBalance());
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount < 0) {
            System.out.println("Сумма перевода не может быть отрицательной!");
            return;
        }
        setBalance(getBalance() - amount);
        account.addMoney(amount);
        System.out.println("Статус перевода " + amount + ": успех");
        System.out.println("В долгу средств: " + getBalance());
    }

    @Override
    public void addMoney(int amount) {
        if(amount > Math.abs(getBalance())){
            System.out.println("Кредитный счет не может выйти в плюс. Пополните сумму: " + getBalance() + " чтобы " +
                    "перекрыть кредит!");
            return;
        }
        if (amount < 0) {
            System.out.println("Сумма пополнения не может быть отрицательной!");
            return;
        }
        setBalance(getBalance() + amount);
        System.out.println("Статус пополнения " + amount + ": успех");
        System.out.println("В долгу средств: " + getBalance());
    }
}
