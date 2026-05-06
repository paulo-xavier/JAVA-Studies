public class SmartTv{
    public String brand; 
    private int volume; 
    private boolean turnedOn; 
    private int channel; 

    public void showStatus(){}

    public void turnOn(){
        this.turnedOn = true; 
    }

    public void turnOff(){
        this.turnedOn = false; 
    }

    public void changeVolume(int finalVolume) {
        if(this.turnedOn == false){
            System.out.println("Failed to set volume! The TV is off...");
        } else if(finalVolume > 100 || finalVolume < 0){
            System.out.println("ERROR! Please enter a value between 0 and 100");
        } else {
            this.volume = finalVolume; 
            System.out.println("VOLUME SUCCESSFULLY CHANGED!!");
        }
    }

    public void increaseVolume(){}

    public void decreaseVolume(){}


}