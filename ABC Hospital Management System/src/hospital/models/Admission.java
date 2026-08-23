
package hospital.models;

import java.time.LocalDate;


public class Admission {
    private int id;   
    private Patient patient;
    private Bed bed;
    private LocalDate admissionDate;
    private String dischargDate;
     private String reason;
    private String status;
    
public Admission(){
}

    public int getId() {
        return id;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargDate() {
        return dischargDate;
    }

    public void setDischargDate(String dischargDate) {
        this.dischargDate = dischargDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
