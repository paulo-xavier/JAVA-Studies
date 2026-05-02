public class BankInfo {
    int accountNumber;
    String owner;
    double balance;
    boolean isActive;

    public void toShowAccountInfo() {
        System.err.println("| Account Number: " + this.accountNumber);
        System.err.println("| Owner: " + this.owner);
        System.err.println("| Balance: " + this.balance);
        System.err.println("| Is active? " + this.isActive);
    }

    public void toDeposit(double value) {
        if (this.isActive == false) {
            System.out.println("FAILED TO OPERATE! Account is inactive.");
        } else {
            this.balance += value;
        }

        System.out.println("BALANCE: " + this.balance);
    }

    public void toWithdraw(double value) {
        if (this.isActive == false) {
            System.out.println("FAILED TO OPERATE! Account is inactive.");
        } else if (value > this.balance) {
            System.out.println("FAIL! This value is greater than the current balance");
        } else {
            this.balance -= value;
        }
        System.out.println("BALANCE: " + this.balance);
    }

    public void toActivateAccount() {
        this.isActive = true;
    }

    public void toDeactivateAccount() {
        this.isActive = false;
    }

    public void setOwner(String username) {
        this.owner = username;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }
}
