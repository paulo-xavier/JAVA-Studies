public class Car {
    String brand; 
    String model; 
    int year; 
    int speed; 
    boolean isOn; 

    public void toShowStatus(){
        System.out.println("Brand | " + this.brand);
        System.out.println("Model | " + this.model);
        System.out.println("Year | " + this.year);
        System.out.println("Speed | " + this.speed);
        System.out.println("Is On? | " + this.isOn);
    }

    public void turnOn(){
        this.isOn = true; 
    }

    public void turnOff(){
        this.isOn = false; 
    }

    public void toAccelerate(int value){
        this.speed += value; 
    }

    public void toBreak(int value){
        if (this.speed <= 0){
            System.out.println("The car is already stopped!");
            this.speed = 0; 
        } else {
            this.speed -= value; 
        }
    }
}