public class Pen {
    String model;
    String color;
    float point;
    int charge;
    boolean covered;

    void status() {
        System.out.println("Pen model: " + this.model);
        System.out.println("A pen with the color: " + this.color);
        System.out.println("Is it covered? " + this.covered);
        System.out.println("Size: " + this.point);
        System.out.println("Charge: " + this.charge + "%");
    }

    void toScribble() {
        if(this.covered == true){
            System.out.println("ERROR! NOT POSSIBLE TO SCRIBBLE");
        } else{
            System.out.println("Scribbling...");
        }
    }

    void toCover() {
        this.covered = true; //Covering
    }

    void toUncover() {
        this.covered = false; //Uncovering
    }
}