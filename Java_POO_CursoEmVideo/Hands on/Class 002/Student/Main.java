public class Main {
    public static void main(String[] args) {
        Student a = new Student();

        a.grades = new float[4];

        a.toSetName("Maria Helena Xavier"); 
        a.toSetAge(23);

        a.addGrades(5);
        a.addGrades(20);
        a.addGrades(15);
        a.addGrades(20);

        a.toShowGrades();

        System.out.println("Average: " + a.toCalculateAverage());

        a.toCheckApproval(a.toCalculateAverage());

        System.out.println("\n=========\n");

        Student b = new Student();

        b.toSetName("Paulo Roberto Xavier");
        b.toSetAge(21);

        b.grades = new float[3];

        b.addGrades(1);
        b.addGrades(2);
        b.addGrades(3);

        b.toShowGrades();

        System.out.println("Average: " + b.toCalculateAverage());

        b.toCheckApproval(b.toCalculateAverage());

        System.out.println("\n=========\n");

        b.toGenerateReport();
        a.toGenerateReport();

    }
}
