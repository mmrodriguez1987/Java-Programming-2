package FinalProject;

public class Employee {
    private String employeeName;
    private int employeeID;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Employee(String name, int id) {        
        this.employeeID = id;
        this.employeeName = name;
    }
}
