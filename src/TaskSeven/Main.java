package TaskSeven;

public class Main {

    public static void main(String[] args) {
        Diploma diploma = new Diploma("Ahmad");

        Course course1 = new Course("DAT", 12);
        Course course2 = new Course("DANSK", 8);
        Course course3 = new Course("MAT", 3);

        diploma.addCourse(course1);
        diploma.addCourse(course2);
        diploma.addCourse(course3);

        System.out.println(diploma.toString());
        System.out.println(diploma.getAverageGrade());
    }
}
