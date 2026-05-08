public class Main {
    public static void main(String[] args) {
        
        SmartTv lg = new SmartTv();

        lg.brand = "LG";

        // lg.showStatus();

        System.out.println("\n==========\n");

        lg.changeChannel(90);
        lg.increaseVolume();
        lg.decreaseVolume();
        lg.changeChannel(12);

        // lg.showStatus();

        System.out.println("\n==========\n");

        lg.turnOn();
        lg.changeChannel(12);

        // lg.showStatus();

        System.out.println("\n==========\n");

        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();

        lg.decreaseVolume();
        lg.decreaseVolume();

        // lg.showStatus();

        System.out.println("\n=========\n");

        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();
        lg.nextChannel();

        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();
        lg.previousChannel();

        lg.showStatus();

    }
}
