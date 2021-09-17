package Lab3;

public class Student extends Person {
    
    private String gradePointAverage, majorFieldStudy;

    public String getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(String gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    public String getMajorFieldStudy() {
        return majorFieldStudy;
    }

    public void setMajorFieldStudy(String majorFieldStudy) {
        this.majorFieldStudy = majorFieldStudy;
    }
    public Student(){
        
    }
    
    @Override
    public void printPersonInformation() {
        super.printPersonInformation();
        System.out.println("Major Field of Study: "+ this.majorFieldStudy);
        System.out.println("Grade point average: "+ this.gradePointAverage);
    }
}
