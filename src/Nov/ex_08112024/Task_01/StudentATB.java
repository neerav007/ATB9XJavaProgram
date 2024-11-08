package Nov.ex_08112024.Task_01;

public class StudentATB extends ATB {
    String studentName;
    int studentID;

    // Constructor
    public StudentATB(String instituteName, String studentName, int studentID) {
        super(instituteName);
        this.studentName = studentName;
        this.studentID = studentID;
    }

    // Override toString() from Object
    @Override
    public String toString() {
        return "Student Name: " + studentName + ", ID: " + studentID;
    }

    // Overloading: display with different parameters
    public void displayDetails() {
        System.out.println("Displaying details of " + studentName);
    }

    public void displayDetails(String extraInfo) {
        System.out.println("Displaying details of " + studentName + ". Info: " + extraInfo);
    }
}
