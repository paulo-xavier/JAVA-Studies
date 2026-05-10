public class Cellphone {
    
    protected String dimensions;
    protected String resolution; 
    protected int cameraQuantity; 
    public String color; 
    public String model; 
    public String brand; 
    private boolean android; 
    private boolean old; 
    private boolean locked; 
    private boolean on; 
    
    public void status(){
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

    public void takePicture(){
        if (this.on == false) {
            System.out.println("ERROR! Turn on your cellphone!!");
        } else if (this.locked == true){
            System.out.println("ERROR! Unlock your cellphone :)");
        } else {
            System.out.println("1...2...3");
            System.out.println("Taking picture...");
        }
    }

    public void recordVideo(){
        if(this.on == false){
            System.out.println("ERROR! Turn on your cellphone");
        } else if (this.locked == true) {
            System.err.println("ERROR! Unlock your cellphone, please");
        } else {
            System.out.println("1...2...3");
            System.out.println("Recording video ...");
        }
    }

    public void turnOn(){
        this.on = true; 
    }

    public void turnOff(){
        this.on = false; 
    }

    public void toUnlock(){
        this.locked = false; 
    }

    public void toLock(){
        this.locked = true; 
    }

    public void setOld(){
        this.old = true; 
    }

    public void unsetOld(){
        this.old = false; 
    }

    public void setAndroid(){
        this.android = true; 
    }

    public void unsetAndroid(){
        this.android = false; 
    }

}