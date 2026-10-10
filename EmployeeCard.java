import java.util.*;
public class EmployeeCard{
    class Employee{
        int id;
        String name;
        int Salary;
        void addEmp(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee ID: ");
            id = sc.nextInt();
            System.out.println("Enter Employee Name: ");
            name = sc.next();
            System.out.println("Enter Employee Salary: ");
            Salary = sc.nextInt();
            sc.close();
        }
        void dispEmp(){
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + Salary);
        }
    }
    public static void main(String[] args) {
        EmployeeCard empCard = new EmployeeCard();
        Employee emp = empCard.new Employee();
        emp.addEmp();
        emp.dispEmp();
    }
}

/*
class
void addEmployee(int id, String name){
    this.id = id;
    this.name = name;
}



*/ 