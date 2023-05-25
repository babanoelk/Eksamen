package TaskSeven;

import java.util.ArrayList;
import java.util.List;

public class Diploma {

    private String studentName;
    private List<Course> courses = new ArrayList<>();

    public Diploma(String studentNam) {
        this.studentName = studentNam;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {

        for (Course course : courses) {
            studentName += "\n" + course.toString();
        }
        return studentName;
    }

    public int getAverageGrade() {
        int counter = 0;
        for (Course c : courses) {
            counter += c.getAverageGrade();
        }
        return counter / courses.size();
    }
}
