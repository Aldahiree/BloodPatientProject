// BloodData.java
// This class stores a person's blood type and Rh factor
public class BloodData {
    private String bloodType; // Blood type: O, A, B, AB
    private String rhFactor;  // Rh factor: + or -
    // Default constructor - sets blood type to O+
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }
    // Overloaded constructor - allows setting both values
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    // Getter and setter for bloodType
    public String getBloodType() {
        return bloodType;
    }
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    // Getter and setter for rhFactor
    public String getRhFactor() {
        return rhFactor;
    }
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    // Method to return full blood data
    public String getBloodInfo() {
        return bloodType + rhFactor;
    }
}
