package OOPS.JAVA_KEYWORDS;

class HospitalManagement{
    static String hospitalName = "Apollo Hospitals";
    static int totalPatients = 0;

    String name, ailment;
    int age;
    final int patientID;

    HospitalManagement(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof HospitalManagement) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
        }
    }
}

