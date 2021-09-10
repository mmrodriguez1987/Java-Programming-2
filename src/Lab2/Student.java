package Lab2;

/**
 *
 * @author Marcos Rodriguez
 */
public class Student {
    private static String _name, _id;
    private static double _averageGrade, _GPA;

    public static String getName() {
        return _name;
    }

    public static void setName(String name) {
        Student._name = name;
    }

    public static String getId() {
        return _id;
    }

    public static void setId(String id) {
        Student._id = id;
    }
    
    public static double getGPA() {
        return _GPA;
    }

    public static void setGPA(double _GPA) {
        Student._GPA = _GPA;
    }
    
    public static void setAverageGrade(double _averageGrade) {
        Student._averageGrade = _averageGrade;
    }
    
    /**
     * Initialize the Student Class
     * @param name Student Name
     * @param id Identifier for the Student
     * @param averageGrade Average Grade for the student
     */
    public Student(String name, String id, double averageGrade ) {
       setName(name);
       setId(id);
       setAverageGrade(averageGrade);
       computeGPA();
    }

    public static void computeGPA() {    
        if(_averageGrade > 95){
            setGPA(4);
        } else if (_averageGrade >= 90 && _averageGrade <= 95 ) {
            setGPA(3.8);
        } else if (_averageGrade >= 85 && _averageGrade < 90 ) {
            setGPA(3.5);
        } else if (_averageGrade >= 80 && _averageGrade < 85 ) {
            setGPA(3.0);
        } else if (_averageGrade >= 70 && _averageGrade < 80 ) {
            setGPA(2.7);
        } else if (_averageGrade >= 60 && _averageGrade < 70 ) {
            setGPA(2.5);
        }
    }

  
}
