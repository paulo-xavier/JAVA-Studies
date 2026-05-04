public class Main {
    public static void main(String[] args) {

        Cellphone c1 = new Cellphone();

        c1.resolution = "2400x1080";
        c1.cameraQuantity = 4;
        c1.color = "Aqua";
        c1.model = "Moto G56";
        c1.brand = "Motorola";
        c1.android = true;

        c1.locked = true; // Cellphone is locked
        c1.on = true; // Cellphone is on

        System.err.println("\n===================\n");

        c1.status();

        System.err.println("\n===================\n");

        c1.takePicture(); // ERROR! Unlock the cellphone
        c1.recordVideo(); // ERROR! Unlock the cellphone

        System.err.println("\n===================\n");

        // Unlocking the cellphone to use the methods()
        c1.toUnlock();

        c1.takePicture(); // Taking picture
        c1.recordVideo(); // Recording video

        System.err.println("\n===================\n");

        c1.turnOff();

        c1.takePicture(); // ERROR! Turn on your cellphone
        c1.recordVideo(); // ERROR! Turn on your cellphone

        System.err.println("\n===================\n");

        Cellphone c2 = new Cellphone();

        c2.model = "iPhone 15"; 
        c2.status();

    }
}