package treatmentHistory;

public class Treatment {
	private int treatmentId;
    private int patientId;
    private String treatmentDate;
    private String doctorName;
    private String treatmentDetails;

    public Treatment(int treatmentId, int patientId,
                     String treatmentDate, String doctorName,
                     String treatmentDetails) {

        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.treatmentDate = treatmentDate;
        this.doctorName = doctorName;
        this.treatmentDetails = treatmentDetails;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void displayTreatment() {

        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Date: " + treatmentDate);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Treatment: " + treatmentDetails);
    }
}
