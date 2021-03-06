package pl.miloszlewandowski.patients;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

  private final PatientRepository patientRepository;

  public PatientService(PatientRepository patientRepository) {
    this.patientRepository = patientRepository;
  }

  public PatientDetailsTempProjection getDetailsProjectionById(Integer id) {
    return patientRepository.getPatientDetailsTempProjectionById(id);
  }

  public Patient getById(Integer id){
    return patientRepository.getById(id);
  }

  public Patient saveNewPatient(PatientSaveR patientSaveR) {
    Patient patient = new Patient();
    patient.setName(patientSaveR.name());
    return patientRepository.save(patient);
  }


  public Patient updatePatient(Patient patient) {
    return null;
  }

  public void deleteById(Integer id) {
    patientRepository.deleteById(id);
  }

  public List<Patient> getAll() {
    return patientRepository.findAll();
  }
}
