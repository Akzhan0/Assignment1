public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];

        studentArray[0] = new Student("Azhan", "SE2521", "SE");
        studentArray[1] = new Student("NURAI", "CS2516", "CS");
        studentArray[2] = new Student("MUXA", "SE2509", "SE");
        studentArray[3] = new Student("GLENT", "S104", "IT");
        studentArray[4] = new Student("VLAD", "S105", "IT");

        studentArray[0].updateGPA(3.9); studentArray[0].addCredits(30);
        studentArray[1].updateGPA(3.2); studentArray[1].addCredits(45);
        studentArray[2].updateGPA(3.7); studentArray[2].addCredits(20);
        studentArray[3].updateGPA(3.5); studentArray[3].addCredits(50);
        studentArray[4].updateGPA(2.8); studentArray[4].addCredits(15);

        Course myCourse = new Course("Java OOP", "Dr. Brown", 5);
        for (int i = 0; i < studentArray.length; i++) {
            myCourse.addStudent(studentArray[i], i);
        }

        System.out.println(myCourse.toString());
        System.out.println("Average GPA: " + myCourse.courseAverageGPA());
        System.out.println("Top Credit Student: " + myCourse.highestCreditStudent().getName());

        System.out.println("\n--- Statistics ---");
        System.out.println("Top GPA Student: " + getTopStudent(studentArray).getName());
        System.out.println("Honors Count: " + countHonors(studentArray));
        System.out.println("Total Credits: " + totalCredits(studentArray));
    }

    public static Student getTopStudent(Student[] arr) {
        Student top = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getGpa() > top.getGpa()) {
                top = arr[i];
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            if (s != null) {
                total += s.getCredits();
            }
        }
        return total;
    }
}