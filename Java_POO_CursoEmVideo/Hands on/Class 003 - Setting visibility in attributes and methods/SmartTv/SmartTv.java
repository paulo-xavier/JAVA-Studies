public class SmartTv {
    public String brand;
    private int volume;
    private boolean turnedOn;
    private int channel;

    public void showStatus() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Volume: " + this.volume);
        System.out.println("Current channel: " + this.channel);
        System.out.println("TV is ON? " + this.turnedOn);
    }

    public void turnOn() {
        this.turnedOn = true;
    }

    public void turnOff() {
        this.turnedOn = false;
    }

    public void changeVolume(int finalVolume) {
        if (this.turnedOn == false) {
            System.out.println("Failed to set volume! The TV is off...");
        } else if (finalVolume > 100 || finalVolume < 0) {
            System.out.println("ERROR! Please enter a value between 0 and 100");
        } else {
            this.volume = finalVolume;
            System.out.println("VOLUME SUCCESSFULLY CHANGED!!");
        }
    }

    public void increaseVolume() {

        if (this.turnedOn == false) {

            System.out.println("TV is OFF! Please, turn it on first. ");

        } else {

            if (this.volume == 100) {
                System.out.println("Volume is on max!!");
            } else {
                this.volume++;
                if (this.volume > 100) {
                    this.volume = 100;
                    System.out.println("Volume: " + this.volume);
                }
            }
        }
    }

    public void decreaseVolume() {

        if (this.turnedOn == false) {
            
            System.out.println("TV is OFF! Please, turn it on first. ");

        } else {

            if (this.volume == 0) {
                System.out.println("Volume is already on minimum - 0% ");
            } else {
                this.volume--;
                
                if (this.volume < 0) {
                    this.volume = 0;
                }
            }
        }
    }

    public void changeChannel(int newChannel) {
        if(this.turnedOn == false){
            
            System.out.println("ERROR! Please, turn on the TV first.");
        
        } else {
            this.channel = newChannel; 
        }
    }

    public void nextChannel(){
        this.channel++; 
    }

    public void previousChannel(){
        if (this.channel == 0){
            return; 
        } else{
            this.channel--; 
        }
    }
}