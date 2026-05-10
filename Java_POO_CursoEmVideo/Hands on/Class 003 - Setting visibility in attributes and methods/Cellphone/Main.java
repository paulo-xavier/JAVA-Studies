public class Main {
    public static void main(String[] args) {

        Cellphone c1 = new Cellphone();

        c1.resolution = "2400x1080";
        c1.cameraQuantity = 4;
        c1.color = "Aqua";
        c1.model = "Moto G56";
        c1.brand = "Motorola";

        c1.setAndroid();
        c1.turnOn();

        c1.status();
        
    }
}