// TestBloodData.java
// This class tests the BloodData class
import java.util.Scanner;
public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for blood type and Rh factor
        System.out.print("Enter blood type (O, A, B, AB): ");
        String type = input.nextLine();
        System.out.print("Enter Rh factor (+ or -): ");
        String factor = input.nextLine();
        // Create BloodData object using user input
        BloodData userBlood = new BloodData(type, factor);
        // Create default BloodData object
        BloodData defaultBlood = new BloodData();
        // Display both blood data objects
        System.out.println("\nUser's Blood Data: " + userBlood.getBloodInfo());
        System.out.println("Default Blood Data: " + defaultBlood.getBloodInfo());
        // Update the default blood data with user’s values
        defaultBlood.setBloodType(type);
        defaultBlood.setRhFactor(factor);
        // Display updated blood data
        System.out.println("\nUpdated Default Blood Data: " + defaultBlood.getBloodInfo());
        input.close();
    }
}