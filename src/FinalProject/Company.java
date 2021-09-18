package FinalProject;

public class Company {

    public static void main(String[] args) {
        Employee rob = new Employee("Robert Tyson", 41);
        Employee maria = new Employee("Maria Salazar", 185);
        Employee john = new Employee("John Travolta", 362);
        Employee will = new Employee("Will Smith", 187);
        Employee jen = new Employee("Jen Trans", 32);
        Employee ann = new Employee("Ann Marie", 155);
        Employee sam = new Employee("Samuel Rodriguez",33);
        Employee vian = new Employee("Viangela Rodriguez",305);
        Employee mig = new Employee("Miguel Chavarria",33);
        
        
        Department sales = new Department("Sales Department");
        sales.addEmployee(rob);
        sales.addEmployee(maria);
        sales.addEmployee(mig);
        sales.printDepartmentDetail();
        
        Department marketing = new Department("Marketing Department");
        marketing.addEmployee(jen);
        marketing.addEmployee(ann);
        marketing.printDepartmentDetail();
         
        Department engineering = new Department("Engineering Department");
        engineering.addEmployee(john);
        engineering.addEmployee(will);
        engineering.addEmployee(sam);
        engineering.addEmployee(vian);
        engineering.printDepartmentDetail();
        
    }
    
}
