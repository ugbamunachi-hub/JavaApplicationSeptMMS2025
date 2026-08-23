
package hospital.models;

import java.time.LocalDate;

public class Nurse extends Staff {
    private String nursingLiscense;
    private String qualification;

    public Nurse(){
    }

    public Nurse(String nursingLiscense, String qualification, String staffId, LocalDate employmentDate, 
            double salary, String firstName, String lastName, char gender, LocalDate dateOfBirth, 
            String phone, String email, String street, String city, String state, String country,Department department) {
        super( firstName, lastName, gender, dateOfBirth, phone, email, street, city, country,staffId,
                employmentDate, salary,department);
        this.nursingLiscense = nursingLiscense;
        this.qualification = qualification;
    }
    
  

    public String getNursingLiscense() {
        return nursingLiscense;
    }

    public void setNursingLiscense(String nursingLiscense) {
        this.nursingLiscense = nursingLiscense;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    }

    

