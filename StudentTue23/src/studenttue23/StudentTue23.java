package studenttue23;

/**
 *
 * @author Stephanie
 */
public class StudentTue23 {

    /**
     * @param args the command line arguments
     */
        
        private String studentId;
        private String studentName;

    public StudentTue23(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}