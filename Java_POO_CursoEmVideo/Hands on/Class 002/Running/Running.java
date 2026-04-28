public class Running {
    String location; 
    String dateAndTime; 
    float kilometers; 
    String[] rewards; 
    String[] rules; 
    boolean isActive; 
    int subscriptions; 

    void status(){

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

    void inactivateRunnin(){
        this.isActive = false; 
    }

    void setKilometers(float km){
        this.kilometers = km; 
    }

}