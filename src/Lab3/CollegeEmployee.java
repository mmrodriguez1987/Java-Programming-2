package Lab3;

public class CollegeEmployee extends Person{
    private String socialSecNumb, departName;
    private Double annualSalary;   
    
   
    
    
    public String getSocialSecNumb() {
        return socialSecNumb;
    }

    public void setSocialSecNumb(String socialSecNumb) {
        this.socialSecNumb = socialSecNumb;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }
       
        
    public CollegeEmployee(){
        
    }
    
    public CollegeEmployee(String ssn, String deptName, Double salary){
        this.socialSecNumb = ssn;
        this.departName = deptName;
        this.annualSalary = salary;
    }
    
    @Override
    public void printPersonInformation(){
        super.printPersonInformation();
        System.out.println("SSN: " + socialSecNumb);
        System.out.println("Department Name: " +departName);
        System.out.println("Annual Salary: "+ annualSalary);
    }

}
