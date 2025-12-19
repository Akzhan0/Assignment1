public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    public void addCredits(int c) { if (c > 0) this.credits += c; }
    public void updateGPA(double newGPA) { if (newGPA >= 0.0 && newGPA <= 4.0) this.gpa = newGPA; }
    public boolean isHonors() { return this.gpa >= 3.5; }

    @Override
    public String toString() {
        return "Student: " + name + " | GPA: " + gpa + " | Credits: " + credits;
    }
}