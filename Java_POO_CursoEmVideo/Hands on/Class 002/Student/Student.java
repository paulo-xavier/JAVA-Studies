public class Student {
    String name;
    int age;
    float[] grades;
    boolean isApproved;

    public void addGrades(float grade) {
        for (int i = 0; i < this.grades.length; i++) {
            if (this.grades[i] > 0) { // It means that a grade exists in this position
                continue;
            } else {
                this.grades[i] = grade;
            }
        }
    }

    public void toShowGrades() {
        
        for (int i = 0; i < this.grades.length; i++) {
            System.out.printf("Grade %d: %.2f \n", i + 1, this.grades[i]);

        }

    }
}