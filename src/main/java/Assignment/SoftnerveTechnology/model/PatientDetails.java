package Assignment.SoftnerveTechnology.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "Patient_Details")
public class PatientDetails {

    @Id
    @GeneratedValue
    Long patient_id;

    String patient_name;
    String contact_details;

    public PatientDetails() {
    }

    public PatientDetails(Long patient_id, String patient_name, String contact_details) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.contact_details = contact_details;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getContact_details() {
        return contact_details;
    }

    public void setContact_details(String contact_details) {
        this.contact_details = contact_details;
    }
}
