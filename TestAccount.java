public class TestAccount {

    public static void main(String[] args) {

        // Account a = new SavingAccount();
        // Account fca = new FastSavingAccount();
        // SavingAccount sa = new FastSavingAccount();
      
        //implicit type casting fsa to ac 暗黙的
        Account acc = new FastSavingAccount();

        //casting to fastsavingaccount from account　explicit
        FastSavingAccount fsa = FastSavingAccount(acc);

        //type casting from account to saving account explicit
        SavingAccount sa =SavingAccount(acc);

       System.out.println(fsa);
       System.out.println(sa);
       System.out.println("calling git again");
      

    }

    private static FastSavingAccount FastSavingAccount(Account acc) {
        return null;
    }

    private static SavingAccount SavingAccount(Account acc) {
        return null;
    }


}

class Account {
    void dispBalance() {
        System.out.println("Account Balance");
    }

    public String toString() {
        return "Account[]";
    }
}

class SavingAccount extends Account {

    void dispBalance() {
        System.out.println("SavingAccount Balance");
    }
}

class FastSavingAccount extends SavingAccount {

    void dispBalance() {
        System.out.println("FastSavingAccount Balance");
    }
}