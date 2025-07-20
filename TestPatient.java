// TestPatient.java
// This class tests the Patient class with different input types
import java.util.Scanner;
public class TestPatient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Default patient
        Patient patient1 = new Patient();
        // Prompt user for second patient data
        System.out.print("Enter Patient ID: ");
        int id2 = input.nextInt();
        System.out.print("Enter Age: ");
        int age2 = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter Blood Type: ");
        String type2 = input.nextLine();
        System.out.print("Enter Rh Factor: ");
        String factor2 = input.nextLine();
        Patient patient2 = new Patient(id2, age2, type2, factor2);
        // Prompt user for third patient data (default BloodData)
        System.out.print("Enter Patient ID: ");
        int id3 = input.nextInt();
        System.out.print("Enter Age: ");
        int age3 = input.nextInt();
        Patient patient3 = new Patient(id3, age3, "O", "+"); // Hardcoded default blood data
        // Display all patient info
        System.out.println("\nPatient 1: ID = " + patient1.getId() + ", Age = " + patient1.getAge()
                + ", Blood = " + patient1.getBloodData().getBloodInfo());
        System.out.println("Patient 2: ID = " + patient2.getId() + ", Age = " + patient2.getAge()
                + ", Blood = " + patient2.getBloodData().getBloodInfo());
        System.out.println("Patient 3: ID = " + patient3.getId() + ", Age = " + patient3.getAge()
                + ", Blood = " + patient3.getBloodData().getBloodInfo());
        input.close();
    }
}