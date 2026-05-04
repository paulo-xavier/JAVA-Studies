public class Main {
    public static void main(String[] args){
        
        Pen c1 = new Pen(); 
        
        c1.model = "BIC Cristal"; 
        
        c1.color = "Blue"; 

        // c1.point = 0.5f;
        
        c1.charge = 80; //We can use a protect attribute because we are in another class Main that uses the Pen class. 

        // c1.covered = false; 
        c1.cover();

        c1.status();

        c1.scribble(); 
    }   
}
