package Practica;

public class Manager extends Employee{
    public Manager(String FirstName, String LastName, String Department, String Occupation, String Salary, int EmployeeID) {
        super(FirstName, LastName, Department, Occupation, Salary, EmployeeID);
    }


    public void setSalary(String salary) {
        Salary = Integer.parseInt(salary);
    }

    @Override
    public String toString() {
        return "First Name: " + FirstName + " Last Name: " + LastName + " Department: " + Department + " Occupation: " + Occupation + " Salary: " + Salary + " Employee ID: " + EmployeeID;
    }
}
