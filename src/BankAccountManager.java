import java.util.ArrayList;
import java.util.UUID;

public class BankAccountManager {
    public static ArrayList<BankAccount> BankAccounts = new ArrayList<>();
    public static BankAccount getBankAccount(UUID uuid) {
        for(BankAccount account: BankAccounts) {
            if (account.getUuid() == uuid) {
                return account;
            }
        }
        return null;
    }
    public static BankAccount getBankAccount(Person person) {
        for(BankAccount account: BankAccounts) {
            if(account.getPerson() == person) {
                return account;
            }
        }
        return null;
    }

    public static int getNumAccounts() {
        return BankAccounts.size();
    }


}
