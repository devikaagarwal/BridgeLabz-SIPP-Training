import java.io.*;

class Employee implements Serializable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class BackupDemo {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee("John", 101);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("backup.ser"));
        oos.writeObject(emp);
        oos.close();

        System.out.println("Employee data serialized for backup.");
    }
}

