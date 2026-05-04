public class Main {
    public static void main(String[] args) {
        Running londonMarathon = new Running();

        londonMarathon.location = "London - ENG";
        londonMarathon.dateAndTime = "September 1st - 9AM";
        londonMarathon.kilometers = 42;

        String[] runningRewards = { "Medal", "Trophy", "Shirt" };
        londonMarathon.rewards = runningRewards;

        String[] runningRules = { "Do not be the last one!", "Do not forget to warm-up" };
        londonMarathon.rules = runningRules;

        londonMarathon.isActive = true;
        londonMarathon.subscriptions = 10;

        System.out.println("===============================");

        londonMarathon.toStartRunning(); // "3...2...1...GOOO!!"

        System.out.println("===============================");

        londonMarathon.inactivateRunning();
        londonMarathon.toStartRunning(); //This running is not active!

        System.out.println("===============================");

        londonMarathon.status();

        londonMarathon.toShowRunningRules();
        londonMarathon.toShowRunningRewards();
        

    }
}
