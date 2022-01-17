class BAccount {
    Integer balance;

    public BAccount(Integer balance) {
        this.balance = balance;
    }
}

public class SaveAccount {
    protected double rate;
    public SaveAccount(int balance, double rate){
        super();
        this.rate = rate;
    }

    public static void main(String[] args) {
        
        SaveAccount sa = new SaveAccount(5000,0.05);
        
         
        System.out.println(sa.rate);
    }
}
