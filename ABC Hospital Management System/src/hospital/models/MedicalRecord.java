package hospital.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {

    private int id;
    private Patient patient;
    private LocalDate createdDate;
    private List<Treatment> treatment = new ArrayList<>();
    private List<LaboratoryTest> laboratorytest = new ArrayList<>();
    private List<Prescription> prescription = new ArrayList<>();
    private List<Admission> admission = new ArrayList<>();

    public MedicalRecord() {
    }
}
