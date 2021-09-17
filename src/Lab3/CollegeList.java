package Lab3;

import java.util.Scanner;

public class CollegeList {

    private static char input;
    private static CollegeEmployee[] collegeEmployee = new CollegeEmployee[4];
    private static Faculty[] faculty = new Faculty[3];
    private static Student[] student = new Student[3];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please specify the Type of Person data that will be entered: \n");
        System.out.print("'C' for Collage Employee\n");
        System.out.print("'F' for Faculty Person\n");
        System.out.print("'S' for Student Person\n");
        System.out.print("'Q' for Quit\n");

        switch (in.nextLine().toUpperCase()) {
            case "C":
                try {
                    for (int i = 0; i <= collegeEmployee.length; i++) {
                        System.out.println("First Name: ");
                        collegeEmployee[i].setFirstName(in.nextLine());
                        System.out.println("Last Name: ");
                        collegeEmployee[i].setLastName(in.nextLine());
                        System.out.println("Phone: ");
                        collegeEmployee[i].setPhone(in.nextLine());
                        System.out.println("Address: ");
                        collegeEmployee[i].setStreetAddress(in.nextLine());
                        System.out.println("Zip Code: ");
                        collegeEmployee[i].setZipcode(in.nextLine());
                        System.out.println("Social Security Number: ");
                        collegeEmployee[i].setSocialSecNumb(in.nextLine());
                        System.out.println("Department Name: ");
                        collegeEmployee[i].setDepartName(in.nextLine());
                        System.out.println("Social Security Number: ");
                        collegeEmployee[i].setAnnualSalary(in.nextDouble());
                    }                
                    for (CollegeEmployee st : collegeEmployee) st.printPersonInformation();
                } 
                catch(Exception e) {
                    System.out.println("Error description: "+ e);
                }
                break;
            case "F":
                try
                {
                    for (int i = 0; i <= faculty.length; i++) {
                        System.out.println("First Name: ");
                        faculty[i].setFirstName(in.nextLine());
                        System.out.println("Last Name: ");
                        faculty[i].setLastName(in.nextLine());
                        System.out.println("Phone: ");
                        faculty[i].setPhone(in.nextLine());
                        System.out.println("Address: ");
                        faculty[i].setStreetAddress(in.nextLine());
                        System.out.println("Zip Code: ");
                        faculty[i].setZipcode(in.nextLine());
                        System.out.println("Social Security Number: ");
                        faculty[i].setSocialSecNumb(in.nextLine());
                        System.out.println("Department Name: ");
                        faculty[i].setDepartName(in.nextLine());
                        System.out.println("Social Security Number: ");
                        faculty[i].setAnnualSalary(in.nextDouble());
                        System.out.println("Is Tenured Member: ");
                        faculty[i].setIsTenured(in.nextBoolean());
                    }                
                    for (Faculty st : faculty) st.printPersonInformation();  
                }
                catch(Exception i) {
                    System.out.println("Error description: "+ i);
                }
                break;
            case "S":
                try {
                    for (int i = 0; i <= student.length; i++) {
                        System.out.print("First Name: ");
                        String var = (in.nextLine()) == null ? "" : in.nextLine();
                        student[i].setFirstName(var);
                        System.out.print("Last Name: ");
                        student[i].setLastName(in.nextLine());
                        System.out.print("Phone: ");
                        student[i].setPhone(in.nextLine());
                        System.out.print("Address: ");
                        student[i].setStreetAddress(in.nextLine());
                        System.out.print("Zip Code: ");
                        student[i].setZipcode(in.nextLine());
                        System.out.print("Grade Point Average: ");
                        student[i].setGradePointAverage(in.nextLine());
                        System.out.print("Major Fiel dStudy: ");
                        student[i].setMajorFieldStudy(in.nextLine());
                    }
                    for (Student st : student) st.printPersonInformation();
                }
                catch(Exception j) {
                    System.out.println("Error description: "+ j);
                }
                break;
            case "Q":
                System.exit(0);
                break;
        }

    }

}
