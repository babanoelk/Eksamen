package TaskSeven;

public class Course {

    private String courseName;
    private int grade;

    public Course(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = gradeValidator(grade);
    }

    @Override
    public String toString() {
        return courseName + ": " + grade;
    }

    private int gradeValidator(int grade) {


        if (grade == 12 || grade == 10 || grade == 7 || grade == 4 || grade == 2 || grade == 00 || grade == -3) {
            return grade;
        }
        System.out.println("Grade can't be that!(" + grade + ") Try again! ");
        return 1000;
    }

    public int getAverageGrade() {
        return grade;
    }

}
