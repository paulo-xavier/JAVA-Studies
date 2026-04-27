public class Main {
    public static void main(String[] args){
        
        Pen c1 = new Pen(); 
        
        c1.model = "BIC";
        c1.color = "Blue"; 
        c1.point = 0.5f;  
        c1.charge = 50; 

        c1.toCover(); //Covered
        c1.toScribble();
        c1.status();

        Pen c2 = new Pen(); 
        c2.model = "FABER CASTEL"; 
        c2.color = "Black"; 
        
        c2.toUncover(); //Uncovered
        c2.toScribble();
        c2.status();
    }   
}
