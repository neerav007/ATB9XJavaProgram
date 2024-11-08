package Nov.ex_08112024.Task_01;

public class RunnerClass {
    public static void main(String[] args) {
        // Create ATB students array
        StudentATB[] students = new StudentATB[3];

        // Instantiate each StudentATB (s1, s2, s3)
        students[0] = new StudentATB("Automation Tester Blueprint", "Rohit", 101);
        students[1] = new PythonLearner("Automation Tester Blueprint", "Rahul", 102, "Intermediate");
        students[2] = new JavaLearner("Automation Tester Blueprint", "Rekha", 103, "Advanced");

        // Display student details using toString()
        for (StudentATB student : students) {
            System.out.println(student.toString());
        }

        // Show examples of method overloading
        students[0].displayDetails();
        students[0].displayDetails("Extra info about Rohit");

        // Demonstrating method overriding
        students[1].displayInstitute();
        students[2].displayInstitute();
    }
}
