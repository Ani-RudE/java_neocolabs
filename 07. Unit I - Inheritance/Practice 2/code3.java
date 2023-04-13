//Create multilevel inheritance with the below classes
import java.util.*;

class WorkerDetail {
    int empCode;
    int basicSalary;
    String name;

    public WorkerDetail(int empCode, String name, int basicSalary) {
        this.empCode = empCode;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Code:" + empCode);
        System.out.println("Name:" + name);
        System.out.println("Salary " + basicSalary);
    }

    public double calculateHRA() {
        return 0.6 * basicSalary;
    }
}

class OfficerSal extends WorkerDetail {
    public OfficerSal(int empCode, String name, int basicSalary) {
        super(empCode, name, basicSalary);
    }

    public double calculateDA() {
        return 0.98 * basicSalary;
    }
}

class ManagerSal extends OfficerSal {
    public ManagerSal(int empCode, String name, int basicSalary) {
        super(empCode, name, basicSalary);
    }

    public double calculateCA() {
        return 0.2 * basicSalary;
    }

    public double calculateGrossPay() {
        return basicSalary + calculateHRA() + calculateDA() + calculateCA();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int empCode = scan.nextInt();
        String name = scan.next();
        int basicSalary = scan.nextInt();

        ManagerSal manager = new ManagerSal(empCode, name, basicSalary);
        manager.displayDetails();
        System.out.println("HRA:" + manager.calculateHRA());
        System.out.println("DA:" + manager.calculateDA());
        System.out.println("City Allowance:" + manager.calculateCA());
        System.out.println("Gross Salary:" + manager.calculateGrossPay());

        scan.close();
    }
}