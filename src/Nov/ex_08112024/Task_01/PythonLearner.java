package Nov.ex_08112024.Task_01;

public class PythonLearner extends StudentATB {
    String pythonSkillLevel;

    // Constructor
    public PythonLearner(String instituteName, String studentName, int studentID, String pythonSkillLevel) {
        super(instituteName, studentName, studentID);
        this.pythonSkillLevel = pythonSkillLevel;
    }

    public String toString() {
        return super.toString() + ", Python Skill Level: " + pythonSkillLevel;
    }

    // Overriding the displayInstitute() method
    public void displayInstitute() {
        System.out.println(studentName + " is a Python learner at " + instituteName + " with skill level: " + pythonSkillLevel);
    }
}
