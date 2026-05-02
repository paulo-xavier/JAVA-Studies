public class Main {
    public static void main(String[] args){
        Student a = new Student(); 
        
        a.grades = new float[4];

        a.addGrades(5); 
        
        a.addGrades(10); 
        a.addGrades(15); 
        a.addGrades(20); 

        a.toShowGrades();
        
    }
}
