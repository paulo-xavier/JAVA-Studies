public class Pen {
    private String model; 
    private String color; 
    private float point;
    private boolean covered; 
    
    public Pen(String m, String c, float p){ // This is a constructor method
        this.model = m; 
        this.color = c; 
        this.point = p; 
        this.cover();
    }

    public String getModel(){
        return this.model; 
    }

    public void setModel(String m){
        this.model = m; 
    }

    public float getPoint(){
        return this.point; 
    }

    public void setPoint(float p){
        this.point = p; 
    }

    public void cover(){
        this.covered = true; 
    }

    public void uncover(){
        this.covered = false; 
    }

    public void status(){
        System.out.println("ABOUT THE PEN");
        System.out.println("Model: " + this.getModel());
        System.out.println("Point: " + this.getPoint());
        System.out.println("Color: " + this.color);
        System.out.println("Is covered? " + this.covered);
    }
}