/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidTermnProject;

/**
 *
 * @author Marcos Rodriguez
 */
public class Company {

    public static void main(String[] args) {
        Employee rob = new Employee("Robert Tyson", 41);
        Employee maria = new Employee("Maria Salazar", 185);
        Employee john = new Employee("John Travolta", 362);
        Employee will = new Employee("Will Smith", 187);
        Employee jen = new Employee("Jen Trans", 32);
        Employee ann = new Employee("Ann Marie", 155);
        
        
        Department sales = new Department("Sales Department");
        sales.addEmployee(rob);
        sales.addEmployee(maria);
        sales.printDepartmentDetail();
        
        Department marketing = new Department("Marketing Department");
        marketing.addEmployee(jen);
        marketing.addEmployee(ann);
        marketing.printDepartmentDetail();
         
        Department engineering = new Department("Engineering Department");
        engineering.addEmployee(john);
        engineering.addEmployee(will);
        engineering.printDepartmentDetail();
        
    }
    
}
