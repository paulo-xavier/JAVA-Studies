public class Main {
    public static void main(String[] args) {
        Car uno = new Car();

        uno.brand = "Fiat";
        uno.model = "Uno 2002";
        uno.year = 2002;

        uno.isOn = false;
        uno.speed = 20;

        System.out.println("=============");

        uno.turnOn();

        uno.toAccelerate(100);
        uno.toBreak(10);

        System.out.println(uno.speed); // 110

        System.out.println("=============");

        uno.toBreak(200);
        uno.toBreak(100);

        System.out.println("=============");

        uno.turnOff();
        uno.toAccelerate(100);
        uno.toBreak(20);

        System.out.println("=============");

        uno.turnOn();
        uno.toAccelerate(100);

        System.out.println("=============");

        uno.toShowStatus(); 

        System.out.println("=============");

        Car uno2 = new Car(); 
        uno2.toShowStatus();

        
    }
}