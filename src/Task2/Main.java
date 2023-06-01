package Task2;

public class Main {
    public static void main(String[] args) {
        Account save = new SavingAccount(500);
        Account credit = new CreditAccount(-500);
        Account check = new CheckingAccount(500);

        save.pay(500);
        save.transfer(credit, 200);
        save.addMoney(1000);
        System.out.println("----------------------------");
        credit.pay(500);
        credit.transfer(save, 200);
        credit.addMoney(400);
        System.out.println("----------------------------");
        check.pay(100);
        check.transfer(credit, 200);
        check.addMoney(1000);
    }
}