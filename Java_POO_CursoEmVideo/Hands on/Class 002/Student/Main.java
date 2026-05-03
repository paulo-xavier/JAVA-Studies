public class Main {
    public static void main(String[] args) {
        Student a = new Student();

        a.grades = new float[4];

        a.setName("Maria Helena Xavier");
        a.setAge(23);

        a.addGrades(5);
        a.addGrades(20);
        a.addGrades(15);
        a.addGrades(20);

        a.showGrades();

        System.out.println("Average: " + a.calculateAverage());

        a.checkApproval();

        System.out.println("\n=========\n");

        Student b = new Student();

        b.setName("Paulo Roberto Xavier");
        b.setAge(21);

        b.grades = new float[3];

        b.addGrades(1);
        b.addGrades(2);
        b.addGrades(3);

        b.showGrades();

        System.out.println("Average: " + b.calculateAverage());

        b.checkApproval();

        System.out.println("\n=========\n");

        b.generateReport();
        a.generateReport();

        System.out.println("\n=========\n");

        Student c = new Student();
        System.out.println(c.calculateAverage());

    }
}
