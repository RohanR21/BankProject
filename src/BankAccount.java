import java.util.UUID;

public class BankAccount {
    private final Person person;
    private double balance;
    private UUID uuid;


    public BankAccount(Person person, double balance) {
        this.person = person;
        this.uuid = UUID.randomUUID();
        if(balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }

        BankAccountManager.BankAccounts.add(this);
    }

    public Person getPerson() {
        return person;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public UUID getUuid() {
        return uuid;
    }


}
