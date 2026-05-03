public class Student {
    String name;
    int age;
    float[] grades;
    int totalGrades;
    boolean isApproved;

    public void addGrades(float grade) {
        this.grades[totalGrades] = grade;
        totalGrades++;
    }

    public void toShowGrades() {
        for (int i = 0; i < this.totalGrades; i++) {
            System.out.printf("Grade %d: %.2f \n", i + 1, this.grades[i]);
        }
    }

    public float toCalculateAverage() {
        int gradesSum = 0;
        int gradesQuantity = this.totalGrades;

        for (int i = 0; i < this.totalGrades; i++) {
            gradesSum += this.grades[i];
        }

        int average = gradesSum / gradesQuantity;

        return average;
    }

    public void toCheckApproval(float average) {
        if (average >= 7) {
            System.out.println("APPROVED!");
            this.isApproved = true; 
        } else {
            System.out.println("REPROVED!");
            this.isApproved = false; 
        }
    }

    public void toGenerateReport() {
        System.out.println("\n==== STUDENT INFORMATION ====\n");
        System.out.printf("| Name: %s |\n", this.name);
        System.out.printf("| Age: %d |\n", this.age);

        for (int i = 0; i < this.totalGrades; i++) {
            System.out.printf("| Grade %d: %.2f \n", i + 1, this.grades[i]);
        }

        System.out.printf("| Is approved?  %b |", this.isApproved);
    }

    public void toSetName(String name){
        this.name = name; 
    }

    public void toSetAge(int age){
        this.age = age; 
    }
}