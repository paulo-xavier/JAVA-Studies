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

    }

    void takePicture(){
        if (this.on == false) {
            System.out.println("ERROR! Turn on your cellphone!!");
        } else {
            System.out.println("1...2...3");
            System.out.println("Taking picture...");
        }
    }

    void recordVideo(){

    }

    void turnOn(){

    }

    void turnOff(){

    }
}