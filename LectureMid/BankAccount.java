class BankAccount{
    private double balance;
    private float interestRate;

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance(){
        return balance;
    }

    public void addInterest(){
        double interestAmt = balance * interestRate;
        balance += interestAmt;
    }

}