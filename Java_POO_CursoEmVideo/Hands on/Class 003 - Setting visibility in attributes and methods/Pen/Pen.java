public class Pen {
    public String model;
    public String color;
    private float point;
    protected int charge;
    private boolean covered;

    public void status() {
        System.out.println("Pen model: " + this.model);
        System.out.println("A pen with the color: " + this.color);
        System.out.println("Is it covered? " + this.covered);
        System.out.println("Size: " + this.point);
        System.out.println("Charge: " + this.charge + "%");
    }

    public void scribble() {
        if(this.covered == true){
            System.out.println("ERROR! NOT POSSIBLE TO SCRIBBLE");
        } else{
            System.out.println("Scribbling...");
        }
    }

    public void cover() {
        this.covered = true; //Covering
    }

    public void uncover() {
        this.covered = false; //Uncovering
    }
}