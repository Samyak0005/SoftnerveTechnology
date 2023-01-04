package Assignment.SoftnerveTechnology.repo;

import Assignment.SoftnerveTechnology.model.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthCareRepository extends JpaRepository<PatientDetails,Long> {
}
