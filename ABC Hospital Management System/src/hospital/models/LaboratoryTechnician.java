
package hospital.models;

import java.time.LocalDate;


public class LaboratoryTechnician extends Staff {
    private String qualification;
    private String licenseNumber;
            
     public  LaboratoryTechnician(){
     
     }

    public LaboratoryTechnician( String firstName, String lastName,  char gender, LocalDate dateOfBirth,
     String phone, String email, String street, String city, String country, String qualification, String licenseNumber,
            String staffId, LocalDate employmentDate, double salary, Department department) {
        super(firstName, lastName, gender, dateOfBirth, phone, email, street, city, country, staffId, employmentDate, salary, department);
        this.qualification = qualification;
        this.licenseNumber = licenseNumber;
    }
     
}
