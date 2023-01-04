package Assignment.SoftnerveTechnology.controller;

import Assignment.SoftnerveTechnology.model.PatientDetails;
import Assignment.SoftnerveTechnology.service.HealthCareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class HealthCareController {

    @Autowired
    HealthCareService healthCareService;

    @PostMapping("/add_patient")
    public String AddPatientDetails(@RequestBody PatientDetails patientDetails){

        return healthCareService.AddPatientDetails(patientDetails);
    }

    @GetMapping("/get_patient")
    public List<PatientDetails> get(){

        return healthCareService.get();
    }

    @PutMapping("/update_patient")
    public String updatePatientDetails(@RequestParam Long id, @RequestParam String contact_details){

        return healthCareService.updatePatientDetails(id,contact_details);
    }

    @DeleteMapping("/delete_patient/{id}")
    public String DeletePatientDetails(@PathVariable Long id){

        return healthCareService.DeletePatientDetails(id);
    }

}
