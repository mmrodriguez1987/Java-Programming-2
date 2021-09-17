package Lab3;

public class Person {
    private String firstName, lastName, streetAddress,  zipCode, phone;
  
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullAddress() {
        return streetAddress + ", " + zipCode;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }   

    public void setZipcode(String zipcode) {
        this.zipCode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Person () {
        
    }
    public Person(String firstName, String lastName, String phone, String street, String zipcode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.streetAddress = street;
        this.zipCode = zipcode;
    }
    
    public void printPersonInformation() {
        System.out.println("************* Personal Information *************");
        System.out.println("Information: ");
        System.out.println("Name: " + getFullName());
        System.out.println("Address: " + getFullAddress());
        System.out.println("Phone: " + phone);         
    }
}
