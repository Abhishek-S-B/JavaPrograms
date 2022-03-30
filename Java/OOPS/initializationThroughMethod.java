package Java.OOPS;

public class initializationThroughMethod {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "Abhi";
        e.print();
        e.assignData(2, "Ravi");
        e.print();
    }
}

class Employee {
    int id;
    String name;
    public void assignData(int i, String n) {
        id = i;
        name = n;
    }
    public void print() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}
