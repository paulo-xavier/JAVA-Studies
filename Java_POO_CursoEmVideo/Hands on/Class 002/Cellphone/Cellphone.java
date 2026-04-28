public class Cellphone {
    
    String dimensions;
    String resolution; 
    int cameraQuantity; 
    String color; 
    String model; 
    String brand; 
    boolean android; 
    boolean old;
    boolean locked; 
    boolean on; 
    
    void status(){
        System.out.println("Dimensions: " + this.dimensions); 
        System.out.println("Resolution: " + this.resolution); 
        System.out.println("Camera quantity: " + this.cameraQuantity); 
        System.out.println("Color: " + this.color); 
        System.out.println("Model: " + this.model); 
        System.out.println("Brand: " + this.brand);
        System.out.println("Android? " + this.android);
        System.out.println("Locked? " + this.locked);
        System.out.println("On? " + this.on);
    }

    void takePicture(){
        if (this.on == false) {
            System.out.println("ERROR! Turn on your cellphone!!");
        } else if (this.locked == true){
            System.out.println("ERROR! Unlock your cellphone :)");
        } else {
            System.out.println("1...2...3");
            System.out.println("Taking picture...");
        }
    }

    void recordVideo(){
        if(this.on == false){
            System.out.println("ERROR! Turn on your cellphone");
        } else if (this.locked == true) {
            System.err.println("ERROR! Unlock your cellphone, please");
        } else {
            System.out.println("1...2...3");
            System.out.println("Recording video ...");
        }
    }

    void turnOn(){
        this.on = true; 
    }

    void turnOff(){
        this.on = false; 
    }

    void toUnlock(){
        this.locked = false; 
    }

    void toLock(){
        this.locked = true; 
    }
}