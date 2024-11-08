package Nov.ex_08112024.Task_01;

public class JavaLearner extends StudentATB {
    String javaSkillLevel;

    // Constructor
    public JavaLearner(String instituteName, String studentName, int studentID, String javaSkillLevel) {
        super(instituteName, studentName, studentID);
        this.javaSkillLevel = javaSkillLevel;
    }

    public String toString() {
        return super.toString() + ", Java Skill Level: " + javaSkillLevel;
    }

    // Overriding the displayInstitute() method
    public void displayInstitute() {
        System.out.println(studentName + " is a Java learner at " + instituteName + " with skill level: " + javaSkillLevel);
    }

}
