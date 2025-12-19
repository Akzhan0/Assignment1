public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String name, String teacher, int size) {
        this.courseName = name;
        this.instructor = teacher;
        this.students = new Student[size];
    }

    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        }
    }

    public double getAverageGPA() {
        double total = 0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                total += s.getGpa();
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public Student getBestStudent() {
        if (students.length == 0) return null;
        Student best = null;
        for (Student s : students) {
            if (s != null) {
                if (best == null || s.getCredits() > best.getCredits()) {
                    best = s;
                }
            }
        }
        return best;
    }
}