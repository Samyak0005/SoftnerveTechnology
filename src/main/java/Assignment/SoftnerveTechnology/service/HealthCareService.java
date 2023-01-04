package Assignment.SoftnerveTechnology.service;

import Assignment.SoftnerveTechnology.model.PatientDetails;
import Assignment.SoftnerveTechnology.repo.HealthCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class HealthCareService {

    @Autowired
    HealthCareRepository healthCareRepository;

    public String AddPatientDetails(PatientDetails patientDetails) {

        healthCareRepository.save(patientDetails);
        return "Add data patient SuccessFully";
    }

    public List<PatientDetails> get(){

      return   healthCareRepository.findAll();
    }

    public String updatePatientDetails(Long id, String contact_details){

        PatientDetails patientDetails = healthCareRepository.getReferenceById(id);
        patientDetails.setContact_details(contact_details);
        healthCareRepository.save(patientDetails);

        return"Update data Successfully";
    }

    public String DeletePatientDetails(@PathVariable Long id){

         healthCareRepository.deleteById(id);
         return "Delete data Successfully";
    }
}
