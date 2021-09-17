package Lab3;

public class Faculty extends CollegeEmployee{
    private boolean isMemberTenured;

    public boolean isIsTenured() {
        return isMemberTenured;
    }

    public void setIsTenured(boolean isTenured) {
        this.isMemberTenured = isTenured;
    }  
      
    public Faculty(){
        
    }
    public Faculty(boolean isTenured){
        this.isMemberTenured = isTenured;
    }
    @Override
    public void printPersonInformation(){
        super.printPersonInformation();
        System.out.println("is Member Tenured: " + (isMemberTenured ? "Yes" : "No")); 
    }
}
