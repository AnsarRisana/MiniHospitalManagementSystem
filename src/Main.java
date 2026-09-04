
import java.util.Scanner;

import patient.Patient;
import patientRecords.PatientRecords;
import emergencyPatientQueue.EmergencyPatientQueue;
import patientVisitHistory.PatientVisitHistory;
import patientVisitHistory.Visit;


public class Main {
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	   PatientRecords patientRecords = new PatientRecords();
	   EmergencyPatientQueue emergencyQueue = new EmergencyPatientQueue();
	   PatientVisitHistory visitHistory = new PatientVisitHistory();
	   

	        int choice;

	        do {
	            System.out.println();
	            System.out.println(" ");
	            System.out.println(" MINI HOSPITAL MANAGEMENT SYSTEM");
	            System.out.println(" ");
	            System.out.println("1. Add Patient");
	            System.out.println("2. Search Patient");
	            System.out.println("3. Delete Patient");
	            System.out.println("4. Display Patient Records");
	            System.out.println("5. Add Emergency Patient");
	            System.out.println("6. Treat Emergency Patient");
	            System.out.println("7. Exit");
	            System.out.println("8. Adding a new visit to the patient's history");
	            System.out.println("9. Removing a visit");
	            System.out.println("10. Searching for a visit");
	            System.out.println("11. Displaying the patient's visit history");
	            System.out.println(" ");
	            System.out.print("Enter your choice: ");

	            choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Patient ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("Enter Patient Name: ");
	                    String name = scanner.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("Enter Contac tNumber: ");
	                    String contact = scanner.nextLine();

	                    System.out.print("Enter Medical Condition: ");
	                    String condition = scanner.nextLine();

	                    Patient patient = new Patient(
	                            id, name, age, contact, condition);

	                    patientRecords.insert(patient);

	                    System.out.println("Patient added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter Patient ID to search: ");
	                    int searchId = scanner.nextInt();

	                    Patient foundPatient = patientRecords.search(searchId);

	                    if (foundPatient != null) {
	                        System.out.println("\nPatient Found:");
	                        foundPatient.displayPatient();
	                    } else {
	                        System.out.println("Patient not found.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Patient ID to delete: ");
	                    int deleteId = scanner.nextInt();

	                    patientRecords.delete(deleteId);

	                    System.out.println("Delete operation completed.");
	                    break;

	                case 4:
	                    System.out.println("\nPatient Records:");
	                    patientRecords.displayInOrder();
	                    break;

	                case 5:
	                    System.out.print("Enter Patient ID for emergency queue: ");
	                    int emergencyId = scanner.nextInt();

	                    Patient emergencyPatient = patientRecords.search(emergencyId);

	                    if (emergencyPatient != null) {
	                        emergencyQueue.enqueue(emergencyPatient);
	                        System.out.println("Patient added to emergency queue.");
	                    } else {
	                    	System.out.println("Patient not found in patient records.");
	                    }
	                    break;

	                case 6:
	                    Patient treatedPatient = emergencyQueue.dequeue();

	                    if (treatedPatient != null) {
	                        System.out.println("\nTreating Patient:");
	                        treatedPatient.displayPatient();
	                    }
	                    break;
	                    
	                    
	                case 7:
	                    System.out.println("Thank you for using the system.");
	                    break;
	                    
	                case 8:    
	                    System.out.print("Enter Visit ID: ");
	                    int visitid = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("Enter Doctor Name: ");
	                    String doctorname = scanner.nextLine();

	                    System.out.print("Enter Visit Date: ");
	                    String date = scanner.nextLine();

	                    System.out.print("Enter Diagnosis :");
	                    String diagnosis  = scanner.nextLine();

	                    System.out.print("Enter Treatment : ");
	                    String treatment  = scanner.nextLine();

	                    Visit visit = new Visit(
	                    		visitid, doctorname, date, diagnosis, treatment );
	                    
	                    visitHistory.insert(visit);

	                    System.out.println("Visit added successfully!");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 7);

	        scanner.close();
	    }
}
