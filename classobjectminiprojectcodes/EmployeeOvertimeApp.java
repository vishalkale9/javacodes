import java.util.Scanner;

class Employee
{
    int id;
    String name;
    int totalWorkingHours; // Total hours worked in a week
    double baseSalary;
    double overtimePay;
    double totalSalary;

    //methods to set the employee details 
    public void setDetails(int id, String name, int totalWorkingHours)
    {
        this.id = id;
        this.name = name;
        this.totalWorkingHours = totalWorkingHours;
        this.baseSalary = 0;
        this.overtimePay = 0;
        this.totalSalary = 0;
    }

     // Method to display employee information
         void displayInformation() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Base Salary: Rs. " + baseSalary);
        System.out.println("Overtime Pay: Rs. " + overtimePay);
        System.out.println("Total Salary: Rs. " + totalSalary);
        System.out.println("-----------------------------");
    }

}
class OverTime{
    int overtimerate=50;
    int baseSalaryrate=100;
    int weekhours=40;

    //method to calculate base salary and overtime
     void calculateSalary(Employee []emp)
     {
        for(int i=0;i<emp.length;i++)
        {
            int totalhr=emp[i].totalWorkingHours;
            int regularhr=Math.min(totalhr,weekhours);
            int overtimehr=Math.max(totalhr-weekhours,0);

            //base salary
            emp[i].baseSalary=regularhr*baseSalaryrate;

           // Calculate overtime pay for overtime hours
           emp[i].overtimePay=overtimehr*overtimerate;

           // Calculate total salary

           emp[i].totalSalary=emp[i].baseSalary+emp[i].overtimePay;
        }

     }
    
}
public class EmployeeOvertimeApp {
    public static void main(String[] args) {
    Employee []employees=new Employee[5];
    Scanner sc=new Scanner(System.in);

    for (int i = 0; i < employees.length; i++) {
        employees[i] = new Employee(); // Instantiate the Employee object
    }
    
    for(int i=0;i<employees.length;i++)
    {   
        System.out.println("plz enter emplotee "+i +" Details ");
        System.out.println("plz enter id ");
        int nid=sc.nextInt();
        sc.nextLine();
        System.out.println("plz enter name");
        String  ename=sc.nextLine();
        System.out.println("plz enter total hours  ");
        int nhr=sc.nextInt();
        employees[i].setDetails(nid, ename, nhr);
    }
      // Calculate salary for each employee
      OverTime overTimeCalculator = new OverTime();
      overTimeCalculator.calculateSalary(employees);

    //display information 
    for(int i=0;i<employees.length;i++)
    {
       employees[i].displayInformation();
    }
    }
}
