// Patient.java
// This class stores patient ID, age, and BloodData
public class Patient {
    private int id;
    private int age;
    private BloodData bloodData;
    // Default constructor
    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData(); // Default BloodData
    }
    // Overloaded constructor
    public Patient(int id, int age, String bloodType, String rhFactor) {
        this.id = id;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }
    // Getters
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public BloodData getBloodData() {
        return bloodData;
    }
}
