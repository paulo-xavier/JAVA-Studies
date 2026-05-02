public class Main {
    public static void main(String[] args) {
        BankInfo username = new BankInfo();

        username.toActivateAccount();
        username.setOwner("Paulo Xavier");
        username.setBalance(100);
        username.setAccountNumber(123456);

        username.toShowAccountInfo();

        System.out.println("\n=============\n");

        username.toWithdraw(200); // Invalid value to withdraw

        System.out.println("\n=============\n");

        username.toWithdraw(90);
        username.toDeposit(20);

        System.out.println("\n=============\n");

        username.setOwner("Maria Helena Xavier");
        username.toDeposit(100);

        username.toDeactivateAccount();
        username.toDeposit(100);
        username.toWithdraw(100);

        System.out.println("\n=============\n");

        username.toShowAccountInfo();

        System.out.println("\n=============\n");

        BankInfo username2 = new BankInfo(); 
        
        username2.toDeposit(100);
        username2.toWithdraw(200);
        username2.toShowAccountInfo(); 

        username2.toActivateAccount(); 
        username2.toDeposit(10);
        username2.toWithdraw(10);
        username2.toWithdraw(10);


    }
}
