package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Department {   
    
    private String _departmentName;
    //private Employee[] _employees = new Employee[10];
    private List<Employee> _employees = new ArrayList<>();
    private double _budget = 0;

    public List<Employee> getEmployees() {
        return _employees;
    }

    public void setEmployees(List<Employee> _employees) {
        this._employees = _employees;
    }

    public double getBudget() {
        return _budget;
    }

    public void setBudget(double _budget) {
        this._budget = _budget;
    }
    private int counter = 0;

    public String getDepartmentName() {
        return this._departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this._departmentName = departmentName;
    }
 
    public Department(String departmentName) {
        this._departmentName = departmentName;
        this._budget =  _budget = 50000;
    }
    
    public void addEmployee(Employee obj) {
        this._employees.add(obj);
        this.counter++;
        this._budget += 20000;
       
        
        
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void printDepartmentDetail() {
        System.out.print("*********************************************\n");
        System.out.print("Department Name: " + this._departmentName +" \n");
        for(int i = 0; i < _employees.size(); i++)
        {           
            System.out.print("Employee ID: " 
                    + _employees.get(i).getEmployeeID() 
                    + ", Employee Name: " 
                    + _employees.get(i).getEmployeeName() 
                    + " \n");
        } 
        System.out.print("The budget for this Department is: $" + this.getBudget() +" \n");
    }
}
