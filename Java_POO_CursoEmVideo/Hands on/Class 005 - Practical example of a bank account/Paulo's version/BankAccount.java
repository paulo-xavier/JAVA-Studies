public class BankAccount {

    enum BankAccountType {
        SAVINGS,
        CHECKING
    }

    public int accountNumber;
    protected BankAccountType accountType;
    private Owner owner; 
    private float balance;  
    private boolean status; 

    public BankAccount(
        int accountNumber, 
        BankAccountType accountType, 
        Owner owner         
    ){
        setAccountNumber(accountNumber);
        setAccountType(accountType);
        setOwner(owner); 
        setStatus(false); //Account not active yet; 
        setBalance(0 );
    }

    public void activateAccount(){
        
        if(this.status){
            
            System.out.println("The account is already opened!!");
        
        } else {
            
            this.status = true; 

            if(this.getAccountType() == BankAccountType.CHECKING){

                // Deposit R$50 as reward
                this.deposit(50); 

            } else { //SAVING
                
                // Deposit R$150 
                this.deposit(150);
            }
        }
    }

    public void deposit(float value){
        if (this.status){
            
            this.balance+=value; 
        } else {
            System.out.println("Account must be ACTIVE to deposit a value!!!");
        }
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


