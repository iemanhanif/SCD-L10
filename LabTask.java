
package labtask;
// Immutable class for failed students
final class FailedStudent {
    private final String rollNumber;
    private final String subjectCode;
    private final String subjectName;

    // Constructor
    public FailedStudent(String rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    // Getter methods
    public String getRollNumber() {
        return rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    // Display details
    public void display() {
        System.out.println("Failed Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Name: " + subjectName);
    }
}

// Mutable class for promoted students
class PromotedStudent {
    private String rollNumber;
    private String subjectCode;
    private String subjectName;

    // Constructor
    public PromotedStudent(String rollNumber, String subjectCode, String subjectName) {
        this.rollNumber = rollNumber;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    // Getter and Setter methods
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    // Display details
    public void display() {
        System.out.println("Promoted Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println("Subject Name: " + subjectName);
    }
}

public class LabTask {
    public static void main(String[] args) {
              // Creating an immutable object for a failed student
        FailedStudent failedStudent = new FailedStudent("2022F-SE-046", "CS101", "Introduction to Programming");
        failedStudent.display();

        System.out.println();

        // Creating a mutable object for a promoted student
        PromotedStudent promotedStudent = new PromotedStudent("2022F-SE-047", "CS102", "Object Oriented Programming");
        promotedStudent.display();

        // Modifying details of promoted student
        System.out.println("\nUpdating Promoted Student Details...");
        promotedStudent.setSubjectCode("CS103");
        promotedStudent.setSubjectName("Data Structures");
        promotedStudent.display();
    }

    }
    

