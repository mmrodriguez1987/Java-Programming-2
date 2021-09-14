package MidTermnProject;

public class Department {   
    
    private String _departmentName;
    private Employee[] _employees = new Employee[10];
    private int counter = 0;

    public String getDepartmentName() {
        return this._departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this._departmentName = departmentName;
    }

    public Employee[] getEmployee() {
        return this._employees;
    }

    public void setEmployee(Employee[] employees) {
        this._employees = employees;
    }
    
    public Department(String departmentName) {
        this._departmentName = departmentName; 
    }
    
    public void addEmployee(Employee obj) {
        _employees[counter] = obj;
        counter++;
    }
    
    public void printDepartmentDetail() {
        System.out.print("*********************************************\n");
        System.out.print("Department Name: " + this._departmentName +" \n");
        for(int i = 0; i <= _employees.length -1; i++){
            if (_employees[i] != null) {
                System.out.print("Employee ID: " + 
                        _employees[i].getEmployeeID() + 
                        ", Employee Name: " + 
                        _employees[i].getEmployeeName() + " \n");
            }    
        }
    }
}
