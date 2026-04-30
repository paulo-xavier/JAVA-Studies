public class Running {
    String location; 
    String dateAndTime; 
    float kilometers; 
    String[] rewards; 
    String[] rules; 
    boolean isActive; 
    int subscriptions; 

    void status(){
        System.out.println("Location: " + this.location); 
        System.out.println("Date and time: " + this.dateAndTime); 
        System.out.println("Kilometers: " + this.kilometers); 
       System.out.println("Is active? " + this.isActive); 
        System.out.println("Subscriptions:  " + this.subscriptions); 

    }

    void toStartRunning(){
        if(this.isActive){
            System.out.println("3...2...1...GOOO!!"); 
        } else {
            System.out.println("This running is not active!"); 
        }
    }

    void activateRunning(){
        this.isActive = true; 
    }

    void inactivateRunning(){
        this.isActive = false; 
    }

    void setKilometers(float km){
        this.kilometers = km; 
    }

    void toShowRunningRules(){
        
        System.out.println("\nRUNNING RULES\n");

        for (int i = 0; i < this.rules.length; i++){
            System.out.println(this.rules[i]);
        }
    }

    void toShowRunningRewards(){
        System.out.println("\nRUNNING REWARDS\n");

        for (int i = 0; i < this.rewards.length; i++){
            System.out.println(this.rewards[i]); 
        }

    }

}