public class Main {
    public static void main(String[] args) {
        // Создаем 5 студентов
        Student s1 = new Student("Akzhan", "ID001", "SE");
        Student s2 = new Student("Jan", "ID002", "IT");
        Student s3 = new Student("Muxa", "ID003", "SE");
        Student s4 = new Student("Diana", "ID004", "CS");
        Student s5 = new Student("Ali", "ID005", "SE");

        // Обновляем данные
        s1.updateGPA(3.8); s1.addCredits(30);
        s2.updateGPA(3.2); s2.addCredits(45);
        s3.updateGPA(3.9); s3.addCredits(25);
        s4.updateGPA(3.4); s4.addCredits(50);
        s5.updateGPA(3.6); s5.addCredits(15);

        // Работа с курсом
        Course myCourse = new Course("Java OOP", "Dr. Smith", 5);
        myCourse.addStudent(s1, 0);
        myCourse.addStudent(s2, 1);
        myCourse.addStudent(s3, 2);
        myCourse.addStudent(s4, 3);
        myCourse.addStudent(s5, 4);

        // Вывод результатов
        System.out.println("Average GPA: " + myCourse.getAverageGPA());
        System.out.println("Best Student (by credits): " + myCourse.getBestStudent().getName());

        Student[] list = {s1, s2, s3, s4, s5};
        System.out.println("Total Credits of all: " + totalCredits(list));
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) total += s.getCredits();
        return total;
    }
}