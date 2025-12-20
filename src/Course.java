public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int arraySize) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[arraySize];
    }

    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            this.students[index] = s;
        }
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return count > 0 ? sum / count : 0.0;
    }

    public Student highestCreditStudent() {
        if (students.length == 0) return null;
        Student top = students[0];
        for (Student s : students) {
            if (s != null && s.getCredits() > top.getCredits()) {
                top = s;
            }
        }
        return top;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " | Instructor: " + instructor;
    }
}