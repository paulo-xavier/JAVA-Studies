public class BankAccount {
    private String owner; 
    private int accountNumber;
    private double balance;

    public BankAccount(String owner, int accountNumber){
        setOwner(owner);
        setAccountNumber(accountNumber);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        if(value <= 0){
            System.out.println("You cannot deposit a negative value or zero!"); 
        } else {
            this.balance += value; 
        }
    }

    public void withdraw(double value){
        if(value > this.getBalance()){
            System.out.println("You cannot withdraw more than your balance!"); 
        } else if(value <= 0){
            System.out.println("You cannot withdraw a negative value or zero!");
        } else {
            this.balance -= value;
        }
    }

    public void showAccountData(){
        System.out.println("Owner: " + this.getOwner());
        System.out.println("Account Number: " + this.getAccountNumber(); 
    }
}

